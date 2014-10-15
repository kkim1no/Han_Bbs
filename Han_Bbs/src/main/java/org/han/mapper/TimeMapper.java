package org.han.mapper;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TimeMapper {

	@Select("select sysdate from dual")
	public String getTime();
	
	
}
