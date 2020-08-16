package com.shadow.mybatis;

import com.shadow.mybatis.entity.Account;
import com.shadow.mybatis.mapper.AccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @author shadow
 * @create 2020-08-15
 * @description
 */
public class MybatisApplication {
	public static void main(String[] args) throws IOException {


		InputStream stream = Resources.getResourceAsStream("mybatis.xml");

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);

		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 得到代理对象
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

		List<Account> list = mapper.list();

		list.forEach(item ->{
			System.out.println(item.getId());
			System.out.println(item.getName());
		});

		sqlSession.close();

	}
}
