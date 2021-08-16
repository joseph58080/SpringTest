package com.majon.spring.lesson03.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.majon.spring.lesson03.model.RealEstate;

public interface RealEstateDAO {
	
	// 1.
	public RealEstate selectRealEstate(@Param("id") int id);
	
	// 2.
	public List<RealEstate> selectRealEstateList(@Param("rentPrice") int rentPrice); 
	
	// 3.
	public List<RealEstate> selectRealEstateListMultipleParam(@Param("area") int area, @Param("price") int price);

}
