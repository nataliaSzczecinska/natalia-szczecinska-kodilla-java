package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;
import com.kodilla.testing.weather.stub.Temperature;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticTestSuite {

    private int  testCounter = 0;

    static List<String> userGenerate(int number) {
        List<String> userNameList = new ArrayList<>();

        for (int i = 0 ; i < number ; i++){
            userNameList.add("User" + i);
        }

        return userNameList;
    }

    @Mock
    private static Statistics statisticsMock;

    @BeforeAll
    public static void beforeAllTests() {
        statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(userGenerate(anyInt()));
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
        void testCalculateAdvStatisticsFor0Posts(){
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.postsCount()).thenReturn(0);

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int postNumber = statisticsAnalyse.getPostsAmount();

            //Then
            Assertions.assertEquals(0, postNumber);
        }

        @Test
        void testCalculateAdvStatisticsFor1000Posts(){
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.usersNames()).thenReturn(userGenerate(anyInt()));

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
        void testCalculateAdvStatisticsFor0Comments(){
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.usersNames()).thenReturn(userGenerate(10));
            when(statisticsMock.postsCount()).thenReturn(0);

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int postNumber = statisticsAnalyse.getPostsAmount();

            //Then
            Assertions.assertEquals(0, postNumber);
        }

        @Test
        void testCalculateAdvStatisticsForPostsMoreThenComments(){
            //Given
            StatisticsAnalyse statisticsAnalyse = new StatisticsAnalyse();
            when(statisticsMock.usersNames()).thenReturn(userGenerate(10));
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(500);

            //When
            statisticsAnalyse.calculateAdvStatistics(statisticsMock);
            int postNumber = statisticsAnalyse.getPostsAmount();
            int commentNumber = statisticsAnalyse.getCommentsAmount();
            double commentsPerPosts = statisticsAnalyse.getAvgCommentsPerPost();

            //Then
            Assertions.assertEquals(1000, postNumber);
            Assertions.assertEquals(500, commentNumber);
        }
    }
}
