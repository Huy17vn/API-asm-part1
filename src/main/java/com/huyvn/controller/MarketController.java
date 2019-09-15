package com.huyvn.controller;

import com.huyvn.entity.Market;
import com.huyvn.service.MarketService;
import com.huyvn.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/markets")
public class MarketController {
    @Autowired
    private MarketService marketService;

    //add
    @PostMapping()
    public ResponseEntity<Object> addNewMarket(@RequestBody Market market){
        return new ResponseEntity<>(new JsonResponse()
                .setData(marketService.addMarket(market))
                .setMessage("save success!!")
                .setStatus(HttpStatus.CREATED.value())
                , HttpStatus.CREATED);
    }
    //list market
    @GetMapping()
    public ResponseEntity<Object> getListMarket(){
        return new ResponseEntity<>(new JsonResponse()
                .setData(marketService.marketList())
                .setMessage("get list ok")
                .setStatus(HttpStatus.OK.value()),HttpStatus.OK);
    }
}
