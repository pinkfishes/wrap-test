package com.wraptest;

import com.example.wrap.service.EnableWrap;
import com.example.wrap.service.WrapService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@EnableWrap
class WraptestApplicationTests {

    @Autowired
    private WrapService wrapService;

    @Test
    void contextLoads() {
        System.out.println(wrapService.wrapStr("我"));;

    }
}
