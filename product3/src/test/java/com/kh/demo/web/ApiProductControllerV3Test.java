package com.kh.demo.web;

import com.kh.demo.domain.product.ProductDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ApiProductControllerV3Test {
    @Autowired
    ProductDAO productDAO;

    @Test
    void del() {
        int i = productDAO.deleteByProductId(1l);

        log.info("i={}",i);

    }

    @Test
    void testDel() {
        int i = productDAO.deleteByProductId(2l);

        log.info("i={}",i);
    }
}