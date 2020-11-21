package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> users = new ArrayList<>();

    public Forum() {
        users.add(new ForumUser(001, "Kratos", 'M', 0005, 1, 2, 66));
        users.add(new ForumUser(002, "johnwick4321",'M', 1970, 1, 8, 99));
        users.add(new ForumUser(003, "josephine22",'F', 1990,9 , 9, 1));
        users.add(new ForumUser(004, "tsubasa",'M', 1980, 3, 16, 150));
        users.add(new ForumUser(005, "neversurrender",'f', 1987, 12, 25, 6));

    }
    public List<ForumUser> getUsers() {
        return new ArrayList<>(users);
    }
}
