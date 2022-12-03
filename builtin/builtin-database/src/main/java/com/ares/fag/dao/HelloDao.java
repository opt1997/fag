package com.ares.fag.dao;

import com.ares.fag.model.Hello;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HelloDao {
    List<Hello> findAll();
}
