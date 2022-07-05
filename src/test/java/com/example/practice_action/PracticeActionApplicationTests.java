package com.example.practice_action;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class PracticeActionApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void add(){
        Hello hello =  new Hello("hoho");
        assertThat(hello.getHello()).isEqualTo("hoho");
        Hello hello1 = new Hello("gg");
        assertThat(hello1.getHello()).isEqualTo("gg");
    }

}
