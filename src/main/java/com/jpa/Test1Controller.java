package com.jpa;

import com.jpa.repository.Test1Repository;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xwz on 2018/3/18.
 */
@Controller
public class Test1Controller {

    private Test1Repository test1Repository;

    @RequestMapping("/test/")
    public void test(@Param("name") String name){

        System.out.println(test1Repository.findByName(name).toString());

    }


}
