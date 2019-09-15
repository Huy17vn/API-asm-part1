package com.huyvn.repository;

import com.huyvn.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market,String> {
}
