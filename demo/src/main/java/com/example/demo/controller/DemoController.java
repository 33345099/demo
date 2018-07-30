package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ICustomerDao;
import com.example.demo.vo.CustomerVO;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private ICustomerDao custRepository;
	@PostMapping("/index")
	public List<CustomerVO> getAllDemo(@RequestBody CustomerVO vo){
		List<CustomerVO> customers = custRepository.findAllCustomer(vo);
		return customers;
	}
	@PostMapping("/save")
	public void save(@RequestBody CustomerVO customerVO) {
		custRepository.save(customerVO);
	}
	
	@PostMapping("/update")
	public void updateCustomer(@RequestBody CustomerVO vo) {
		custRepository.updateCustomer(vo);
	}

}
