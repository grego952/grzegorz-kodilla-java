package com.kodilla.testing.statistics;

import java.util.Collections;
import java.util.List;

public class StatisticsCalculations {

    int usersCount;
    int postCount;
    int commentCount;
    int averageNumberOfPostsPerUser;
    int averageNumberOfCommentsPerUser;
    int averageNumberOfCommentsPerPost;


    void calculateAdvStatistics(Statistics statistics) {

        List<String> strings = statistics.userNames();
        usersCount = strings.size();

        postCount = statistics.postsCount();

        commentCount = statistics.commentsCount();

        if (usersCount <= 0) {
            averageNumberOfPostsPerUser = 0;
        } else {
            averageNumberOfPostsPerUser = postCount / usersCount;
        }

        if (usersCount <= 0) {
            averageNumberOfCommentsPerUser = 0;
        } else {
            averageNumberOfCommentsPerUser = commentCount / usersCount;
        }

        if (postCount <= 0) {
            averageNumberOfCommentsPerPost = 0;
        } else
            averageNumberOfCommentsPerPost = commentCount / postCount;
    }
}
