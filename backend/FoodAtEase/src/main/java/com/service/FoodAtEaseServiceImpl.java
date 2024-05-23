package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dao.FoodAtEaseDao;

@Service
public class FoodAtEaseServiceImpl implements FoodAtEaseService{
	@Autowired
	FoodAtEaseDao ldao;	
}

//Controller->Service->Dao->Mapper->Database;
