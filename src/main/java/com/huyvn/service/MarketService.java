package com.huyvn.service;

import com.huyvn.entity.Market;
import com.huyvn.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class MarketService {
    @Autowired
    private MarketRepository marketRepository;
    //list
    public List<Market> marketList(){
        return marketRepository.findAll();
    }
    //add market
    public Market addMarket(Market market){
        market.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        market.setStatus(1);
        marketRepository.save(market);
        return market;
    }
}
