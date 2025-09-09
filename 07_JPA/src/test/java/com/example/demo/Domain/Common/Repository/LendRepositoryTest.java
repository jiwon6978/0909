package com.example.demo.Domain.Common.Repository;

import com.example.demo.Domain.Common.Entity.Book;
import com.example.demo.Domain.Common.Entity.Lend;
import com.example.demo.Domain.Common.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class LendRepositoryTest {

    @Autowired
    LendRepository lendRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookRepository bookRepository;

    @Test
    public void t1(){

//        List<Lend> list = lendRepository.findAll();
//        list.forEach(System.out::println);

        //INSERT
        User user = userRepository.findById("user1").get();
        Book book = bookRepository.findById(1L).get();
        Lend lend = Lend.builder()
                .id(null)
                .user(user)
                .book(book)
                .build();
        lendRepository.save(lend);
    }
}