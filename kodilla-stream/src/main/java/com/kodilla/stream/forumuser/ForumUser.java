package com.kodilla.stream.forumuser;

import java.time.*;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOFBirth;
    private final int numberOfPosts;


    public ForumUser(final int userID, final String userName, final char sex, final int birthYear, final int birthMonth, final int birthDay, final int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.dateOFBirth = LocalDate.of(birthYear, birthMonth, birthDay);
        this.numberOfPosts = numberOfPosts;
    }


    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOFBirth() {
        return dateOFBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getAge() {
        int age = Year.now().getValue() - getDateOFBirth().getYear();
        return age;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOFBirth=" + dateOFBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
