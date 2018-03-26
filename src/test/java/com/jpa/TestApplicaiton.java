package com.jpa;

import com.SpringbootApplication;
import com.jpa.repository.Test1Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xwz on 2018/3/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class TestApplicaiton {

    @Autowired
    private Test1Repository test1Repository;

    @Test
    public void test(){

        System.out.println(test1Repository.findByName("zhangsan"));

    }

}
