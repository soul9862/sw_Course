package com.exam.mapper;

import org.apache.ibatis.annotations.Insert;

public interface Sample2Mapper {

	@Insert("INSERT INTO sample2 (col2) VALUES (#{data})")
	public int insertCol2(String data);
	
}
