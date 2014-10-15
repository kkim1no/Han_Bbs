package org.han.web;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.han.mapper.BbsMapper;
import org.han.mapper.TimeMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/**/*-context.xml" })
public class BbsMapperTest {

	static Logger logger = Logger.getLogger(TimeMapperTest.class);


	@Inject
	BbsMapper bbsMapper;
	
	@Test
	public void test() {

		logger.info(bbsMapper);
		bbsMapper.update("제목바꾸기", 3);;
		
	}

}
