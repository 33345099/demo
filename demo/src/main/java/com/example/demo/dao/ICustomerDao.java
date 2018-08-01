package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.vo.CustomerVO;
@Mapper
public interface ICustomerDao {
	List<CustomerVO> findAllCustomer(@Param(value = "vo")CustomerVO vo);
	void save(@Param(value = "vo")CustomerVO vo);
	void updateCustomer(@Param(value = "vo")CustomerVO vo);
	CustomerVO getCustomerById(@Param(value="id") String id);
}
