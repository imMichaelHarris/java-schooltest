package com.lambdaschool.school;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SchoolApplicationTests.class)
@SpringBootApplication
public class SchoolApplicationTests
{

    public static void main(String[] args)
    {
        SpringApplication.run(SchoolApplicationTests.class, args);
    }

}
