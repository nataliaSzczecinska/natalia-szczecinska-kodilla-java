package com.kodilla.stream.forumuser;


import java.time.LocalDate;
import java.util.*;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {

        theForumUserList.add(new ForumUser(1, "Jan Kowalski", 'M',
                LocalDate.of(1980, 7, 10), 40));
        theForumUserList.add(new ForumUser(2, "Adam Nowak", 'M',
                LocalDate.of(1988, 12, 11), 21));
        theForumUserList.add(new ForumUser(3, "Jadwiga Kowal", 'F',
                LocalDate.of(1966, 2, 1), 9));
        theForumUserList.add(new ForumUser(4, "Bartłomiej Tylman", 'M',
                LocalDate.of(1999, 4, 24), 123));
        theForumUserList.add(new ForumUser(5, "Oliwer Nowakowski", 'M',
                LocalDate.of(2005, 6, 22), 192));
        theForumUserList.add(new ForumUser(6, "Sylwester Sobieski", 'M',
                LocalDate.of(2000, 11, 20), 10));
        theForumUserList.add(new ForumUser(7, "Janusz Kowadełko", 'M',
                LocalDate.of(2000, 11, 21), 3245));
        theForumUserList.add(new ForumUser(8, "Norbert Michalski", 'M',
                LocalDate.of(1933, 5, 11), 0));
    }

    public List<ForumUser> getUserList() {

        return new ArrayList<>(theForumUserList);
    }
}
