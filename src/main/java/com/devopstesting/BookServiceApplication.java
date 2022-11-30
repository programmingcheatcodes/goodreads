package com.devopstesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@RequestMapping("/goodreads")
public class BookServiceApplication {

    @Autowired
    private BookDao bookDao;

    @GetMapping
    public List<Book> fetchOrders() {
        return bookDao.getOrders();
    	/*return bookDao.getOrders().stream().
    	        sorted(Comparator.comparing(Book::getName)).collect(Collectors.toList());*/
    }

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApplication.class, args);
    }

}













/*
import java.util.Comparator;
import java.util.stream.Collectors;

return orderDao.getOrders().stream().
        sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
*/