package com.activeedge.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/stocks")
public class StockController {

    public void createStock(Stock stock){

    }
    public void updateStocks(int stockId){


    }
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public void getAllStocks(){

    }
    public void getStock(int stockId){

    }
}
