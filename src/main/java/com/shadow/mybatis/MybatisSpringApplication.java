package com.shadow.mybatis;

import com.shadow.mybatis.config.MybatisConfig;
import com.shadow.mybatis.entity.Account;
import com.shadow.mybatis.mapper.AccountMapper;
import com.shadow.mybatis.mapper.AccountMapperSpring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author shadow
 * @create 2020-08-16
 * @description
 */
public class MybatisSpringApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MybatisConfig.class);
		AccountMapperSpring accountMapper = (AccountMapperSpring) ac.getBean("accountMapperSpring");

		List<Account> list = accountMapper.list();

		list.forEach(item ->{
			System.out.println(item.getId());
			System.out.println(item.getName());
		});

	}
}
