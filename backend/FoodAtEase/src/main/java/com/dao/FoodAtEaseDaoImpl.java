package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mapper.FoodAtEaseMapper;


@Repository
public class FoodAtEaseDaoImpl implements FoodAtEaseDao{

	@Autowired
	private SqlSessionTemplate sqlsessiontemplate;
	
	@Autowired
	private FoodAtEaseMapper mapper;
}