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
public interface AccountMapper {

	List<Account> list();
}
