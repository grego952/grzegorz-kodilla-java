package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User crazyLogan = new Millenials("Crazy Logan 55");
        User foxyLady = new YGeneration("FoxyLady12");
        User humbleMike = new ZGeneration("HumbleMike44");

        //When
        String crazyLoganUses = crazyLogan.sharePost();
        System.out.println("Crazy Logan uses " + crazyLoganUses);
        String foxyLadyUses = foxyLady.sharePost();
        System.out.println("Foxy Lady uses " + foxyLadyUses);
        String humbleMikeUses = humbleMike.sharePost();
        System.out.println("Humble Mike uses " + humbleMikeUses);

        //Then
        assertEquals("Facebook", crazyLoganUses);
        assertEquals("Snapchat", foxyLadyUses);
        assertEquals("Twitter", humbleMikeUses);

    }
    @Test
    void testIndividualSharingStrategy() {
        //Given
        User foxyLady = new YGeneration("FoxyLady12");

        //When
        String foxyLadyUses = foxyLady.sharePost();
        System.out.println("Foxy Lady uses " + foxyLadyUses);
        foxyLady.setSharingStrategy(new FacebookPublisher());
        foxyLadyUses = foxyLady.sharePost();
        System.out.println("Now Foxy Lady is using " + foxyLadyUses);

        //Then
        assertEquals("Facebook", foxyLadyUses);
    }


}
