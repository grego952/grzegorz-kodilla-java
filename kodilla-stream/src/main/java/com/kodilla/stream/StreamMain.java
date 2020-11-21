package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {



        Forum forum = new Forum();
        Map <Integer, ForumUser> forumUsers = forum.getUsers().stream()

                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getAge() > 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

                forumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);


    }
}
