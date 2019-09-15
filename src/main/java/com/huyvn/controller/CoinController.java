package com.huyvn.controller;

import com.huyvn.entity.Coin;
import com.huyvn.service.CoinService;
import com.huyvn.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/coins")
public class CoinController {
    @Autowired
    private CoinService coinService;

    // list
    @GetMapping()
    public ResponseEntity<Object> getListCoin(){
        return new ResponseEntity<>(new JsonResponse().setData(coinService.getList())
                .setMessage("get list coin success!!!")
                .setStatus(HttpStatus.OK.value()), HttpStatus.OK);
    }
    //add new coin
    @PostMapping()
    public ResponseEntity<Object> addNewCoin(@RequestBody Coin coin){
        return new ResponseEntity<>(new JsonResponse()
                .setData(coinService.addCoin(coin))
                .setMessage("save coin success")
                .setStatus(HttpStatus.CREATED.value()),HttpStatus.CREATED);
    }
    //search coin by name

    @RequestMapping(method = RequestMethod.GET,value = "/searchByName")
    public ResponseEntity<Object> searchCoinByName(@RequestParam String name){
        List<Coin> list = coinService.getCoinByName(name);
        if(list.size()==0){
            return new ResponseEntity<>(
                    new JsonResponse()
                            .setData(null)
                            .setStatus(HttpStatus.NOT_FOUND.value())
                            .setMessage("name ko ton tai or da bi xoa!!!")
                    ,HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(
                    new JsonResponse()
                            .setData(list)
                            .setStatus(HttpStatus.OK.value())
                            .setMessage("get coin by name success")
                    ,HttpStatus.OK);
        }

    }

    //search coin by marketId
    @RequestMapping(method = RequestMethod.GET,value ="/searchByMarketID")
    public ResponseEntity<Object> searchCoinByMarketID(@RequestParam String id){
        List<Coin> list = coinService.getCoinByName(id);
        if(list.size()==0){
            return new ResponseEntity<>(
                    new JsonResponse()
                            .setData(null)
                            .setStatus(HttpStatus.NOT_FOUND.value())
                            .setMessage("marketID ko ton tai or da bi xoa!!!")
                    ,HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(
                    new JsonResponse()
                            .setData(list)
                            .setStatus(HttpStatus.OK.value())
                            .setMessage("Get coin by marketId success")
                    ,HttpStatus.OK);
        }

    }
}
