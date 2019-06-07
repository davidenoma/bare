package com.activeedge.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        List<Stock> stocks = new ArrayList<>();
        stocks.add(new Stock(1, "Cocoa ", 100));
        stocks.add(new Stock(2, "Milk ", 40));
        stocks.add(new Stock(3, "Cement ", 200));
        stocks.add(new Stock(4, "Flour ", 50));
        stocks.add(new Stock(5, "Sugar ", 30));
        stocks.add(new Stock(6, "Salt ", 20));




    }
}
