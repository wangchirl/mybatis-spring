package com.shadow.mybatis.mapper;

import com.shadow.mybatis.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author shadow
 * @create 2020-08-16
 * @description
 */
@Mapper
public interface AccountMapperSpring {
	@Select("select id,name from account")
	List<Account> list();
}
