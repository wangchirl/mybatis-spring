package com.shadow.mybatis.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.gjt.mm.mysql.Driver;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

/**
 * @author shadow
 * @create 2020-08-16
 * @description
 */
@Configuration
@MapperScan("com.shadow.mybatis.mapper")
public class MybatisConfig {


	@Bean
	public DataSource dataSource(){
		DataSource dataSource = new DriverManagerDataSource();
		((DriverManagerDataSource) dataSource).setDriverClassName("com.mysql.jdbc.Driver");
		((DriverManagerDataSource) dataSource).setUrl("jdbc:mysql://localhost:3306/db2019?charsetEncding=utf-8");
		((DriverManagerDataSource) dataSource).setUsername("root");
		((DriverManagerDataSource) dataSource).setPassword("root");
		return dataSource;
	}



	@Bean
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		return sqlSessionFactoryBean.getObject();
	}

}
