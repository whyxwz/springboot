package com.jpa.repository;

import com.jpa.entity.Test1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by xwz on 2018/3/18.
 */
@Repository
public interface Test1Repository extends JpaRepository<Test1, Long> {

    public Test1 findByName(String name);

    @Query("from Test1 t where t.name = :name")
    public Test1 findTest1(String name);

}
