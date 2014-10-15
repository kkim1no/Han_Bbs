package org.han.mapper;

import org.apache.ibatis.annotations.Update;

public interface BbsMapper {

	@Update("update tbl_bbs set title=#{title} where bbsno=#{bbsno}")
	public void update(String title, Integer bbsno);
	
}
