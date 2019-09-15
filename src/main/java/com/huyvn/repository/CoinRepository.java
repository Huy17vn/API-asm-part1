package com.huyvn.repository;

import com.huyvn.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinRepository extends JpaRepository<Coin,Long> {

    List<Coin> findAllByNameAndStatus(String name, int i);

    List<Coin> findAllByMarketIdAndStatus(String marketId, int i);
}
