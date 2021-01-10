package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticTestSuite {

    private static int testCounter = 0;

    static List<String> userGenerate(int number) {
        List<String> userNameList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            userNameList.add("User" + i);
        }

        return userNameList;
    }

    @Mock
    private static Statistics statisticsMock;

    @BeforeAll
    public static void beforeAllTests() {
        statisticsMock = mock(Statistics.class);
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Posts tests")
    class testPosts {
        @Test
        void testCalculateAdvStatisticsFor0Posts() {
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.usersNames()).thenReturn(userGenerate(10));
            when(statisticsMock.postsCount()).thenReturn(0);

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int postNumber = statisticsAnalyse.getPostsAmount();
            double commentsPerPost = statisticsAnalyse.getAvgCommentsPerPost();
            double postsPerUser = statisticsAnalyse.getAvgPostsPerUser();
            double commentsPerUser = statisticsAnalyse.getAvgCommentsPerUser();

            //Then
            Assertions.assertEquals(0, postNumber);
            Assertions.assertEquals(0.0, commentsPerPost);
            Assertions.assertEquals(0.0, postsPerUser);
            Assertions.assertEquals(0.0, commentsPerUser);
            verify(statisticsMock, never()).commentsCount();
        }

        @Test
        void testCalculateAdvStatisticsFor1000Posts() {
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.usersNames()).thenReturn(userGenerate(10));

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int postNumber = statisticsAnalyse.getPostsAmount();

            //Then
            Assertions.assertEquals(1000, postNumber);
        }
    }

    @Nested
    @DisplayName("Comments tests")
    class testComments {
        @Test
        void testCalculateAdvStatisticsFor0Comments() {
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.usersNames()).thenReturn(userGenerate(10));
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int postNumber = statisticsAnalyse.getCommentsAmount();
            double commentsPerPost = statisticsAnalyse.getAvgCommentsPerPost();
            double postsPerUser = statisticsAnalyse.getAvgPostsPerUser();
            double commentsPerUser = statisticsAnalyse.getAvgCommentsPerUser();

            //Then
            Assertions.assertEquals(0, postNumber);
            Assertions.assertEquals(0.0, commentsPerPost);
            Assertions.assertEquals(100.0, postsPerUser);
            Assertions.assertEquals(0.0, commentsPerUser);
        }

        @Test
        void testCalculateAdvStatisticsForPostsMoreThenComments() {
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.usersNames()).thenReturn(userGenerate(10));
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(500);

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int postNumber = statisticsAnalyse.getPostsAmount();
            int commentNumber = statisticsAnalyse.getCommentsAmount();
            double commentsPerPost = statisticsAnalyse.getAvgCommentsPerPost();
            double postsPerUser = statisticsAnalyse.getAvgPostsPerUser();
            double commentsPerUser = statisticsAnalyse.getAvgCommentsPerUser();

            //Then
            Assertions.assertEquals(1000, postNumber);
            Assertions.assertEquals(500, commentNumber);
            Assertions.assertEquals(0.5, commentsPerPost);
            Assertions.assertEquals(100.0, postsPerUser);
            Assertions.assertEquals(50.0, commentsPerUser);
        }

        @Test
        void testCalculateAdvStatisticsForPostsLessThenComments() {
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.usersNames()).thenReturn(userGenerate(10));
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(2000);

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int postNumber = statisticsAnalyse.getPostsAmount();
            int commentNumber = statisticsAnalyse.getCommentsAmount();
            double commentsPerPost = statisticsAnalyse.getAvgCommentsPerPost();
            double postsPerUser = statisticsAnalyse.getAvgPostsPerUser();
            double commentsPerUser = statisticsAnalyse.getAvgCommentsPerUser();

            //Then
            Assertions.assertEquals(1000, postNumber);
            Assertions.assertEquals(2000, commentNumber);
            Assertions.assertEquals(2.0, commentsPerPost);
            Assertions.assertEquals(100, postsPerUser);
            Assertions.assertEquals(200, commentsPerUser);
        }
    }

    @Nested
    @DisplayName("User tests")
    class testUser {
        @Test
        void testCalculateAdvStatisticsFor0User() {
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.usersNames()).thenReturn(userGenerate(0));

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int userNumber = statisticsAnalyse.getUsersAmount();
            int postNumber = statisticsAnalyse.getPostsAmount();
            int commentNumber = statisticsAnalyse.getCommentsAmount();
            double commentsPerPost = statisticsAnalyse.getAvgCommentsPerPost();
            double postsPerUser = statisticsAnalyse.getAvgPostsPerUser();
            double commentsPerUser = statisticsAnalyse.getAvgCommentsPerUser();

            //Then
            Assertions.assertEquals(0, userNumber);
            Assertions.assertEquals(0, postNumber);
            Assertions.assertEquals(0, commentNumber);
            Assertions.assertEquals(0.0, commentsPerPost);
            Assertions.assertEquals(0.0, postsPerUser);
            Assertions.assertEquals(0.0, commentsPerUser);
            verify(statisticsMock, never()).commentsCount();
            verify(statisticsMock, never()).postsCount();
        }

        @Test
        void testCalculateAdvStatisticsFor100User() {
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.usersNames()).thenReturn(userGenerate(100));

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int userNumber = statisticsAnalyse.getUsersAmount();

            //Then
            Assertions.assertEquals(100, userNumber);
        }
    }
}
