package com.techdive.users_posts.service;

import com.techdive.users_posts.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(User.builder().id(++usersCount).name("Adam").birthDate(LocalDate.now().minusYears(30)).build());
        users.add(User.builder().id(++usersCount).name("Eve").birthDate(LocalDate.now().minusYears(25)).build());
        users.add(User.builder().id(++usersCount).name("Jim").birthDate(LocalDate.now().minusYears(20)).build());
    }

    public List<User> findAll() {
        return users;
    }

}
