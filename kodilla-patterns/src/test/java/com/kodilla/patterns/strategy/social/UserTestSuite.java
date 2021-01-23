package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.predictor.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Millenials - twitter");
        User user2 = new YGeneration("YGeneration - facebook");
        User user3 = new ZGeneration("ZGeneration - snapchat");

        //When
        String user1Share = user1.sharePost();
        System.out.println("User1 share: " + user1Share);
        String user2Share = user2.sharePost();
        System.out.println("User1 share: " + user2Share);
        String user3Share = user3.sharePost();
        System.out.println("User3 share: " + user3Share);

        //Then
        assertEquals("Twitter", user1Share);
        assertEquals("Facebook", user2Share);
        assertEquals("Snapchat", user3Share);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Millenials - twitter");

        //When
        String user1Share = user1.sharePost();
        System.out.println("User1 share: " + user1Share);
        user1.setSocialPublisher(new FacebookPublisher());
        user1Share = user1.sharePost();
        System.out.println("User1 now share: " + user1Share);

        //Then
        assertEquals("Facebook", user1Share);
    }
}