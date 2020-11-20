package com.kodilla.testing.statistics;

import com.kodilla.testing.library.Book;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class StatisticsCalculationsTest {

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    Statistics statisticsMock = Mockito.mock(Statistics.class);

    @Test
    public void test0Posts() {

        //Given
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        int postCounter0 = 0;
        when(statisticsMock.postsCount()).thenReturn(postCounter0);

        //When
        statisticsCalculations.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0, statisticsCalculations.postCount);

    }

    @Test
    public void test1000Posts() {

        //Given
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        int postCounter100 = 1000;
        when(statisticsMock.postsCount()).thenReturn(postCounter100);

        //When
        statisticsCalculations.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(1000, statisticsCalculations.postCount);

    }

    @Test
    public void test0Comments() {

        //Given
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        int commentCounter = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);

        //When
        statisticsCalculations.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0, statisticsCalculations.commentCount);
    }
    @Test
    public void testMoreCommentsThanPosts() {
        //Given
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        int commentCounter = 100;
        int postCounter = 99;
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);
        when(statisticsMock.postsCount()).thenReturn(postCounter);

        //When
        statisticsCalculations.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(100, statisticsCalculations.commentCount);
        Assert.assertEquals(99, statisticsCalculations.postCount);

    }
    @Test
    public void testMorePostsThanPosts() {
        //Given
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        int commentCounter = 99;
        int postCounter = 100;
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);
        when(statisticsMock.postsCount()).thenReturn(postCounter);

        //When
        statisticsCalculations.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(99, statisticsCalculations.commentCount);
        Assert.assertEquals(100, statisticsCalculations.postCount);

    }
    @Test
    public void test0Users() {

        //Given
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        List<String> zeroUsers = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(zeroUsers);

        //When
        statisticsCalculations.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0, statisticsCalculations.usersCount);


    }

    @Test
    public void test100Users() {

        //Given
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations();
        List<String> hundredUsers = generateListOfUsers(100);
        when(statisticsMock.userNames()).thenReturn(hundredUsers);

        //When
        statisticsCalculations.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(100, statisticsCalculations.usersCount);


    }

    private List<String> generateListOfUsers(int numberOfUsers) {
        List<String> userList = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            String user = "User " + n;
            userList.add(user);
        }
        return userList;
    }
}