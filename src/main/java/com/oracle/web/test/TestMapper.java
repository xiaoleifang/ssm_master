package com.oracle.web.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageHelper;
import com.oracle.web.mapper.MonsterMapper;
import com.oralce.web.bean.Monster;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestMapper {
	
	@Autowired
	private MonsterMapper monsterMapper;
	
	@Test
	public void testPage(){
		
		PageHelper.startPage(1,5);
		
		List<Monster> list = this.monsterMapper.selectAllByPageHelper();
		
		for (Monster monster : list) {
			
			System.out.println(monster);
			
		}
		
	}

}
