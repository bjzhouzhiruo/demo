package com.demo;

import com.demo.pojo.Person;
import com.demo.pojo.Person1;
import com.demo.pojo.Person2;
import com.demo.pojo.Person3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    Person1 person1;
    @Autowired
    Person2 person2;
    @Autowired
    Person3 person3;

    @Test
    public void contextLoads() {
        //System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

}

