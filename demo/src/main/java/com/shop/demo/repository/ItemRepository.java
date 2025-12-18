package com.shop.demo.repository;

import com.shop.demo.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
    // 상품명으로 데이터를 조회하는 쿼리 메소드 추가
    List<Item> findByItemNm(String itemNm);
}