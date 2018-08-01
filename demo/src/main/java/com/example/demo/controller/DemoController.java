package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ICustomerDao;
import com.example.demo.vo.CustomerVO;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
	private ICustomerDao custRepository;
	@PostMapping("/index")
	public @ResponseBody List<CustomerVO> getAllDemo(@RequestBody CustomerVO vo){
		vo.setEnabled(true);
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
	
	@PostMapping("/remove/{id}")
	public void removeCustomerById(@PathVariable String id) {
		CustomerVO vo = new CustomerVO();
		vo.setId(id);
		vo.setEnabled(false);
		custRepository.updateCustomer(vo);
		
	}
	
	@PostMapping("/listremoved")
	public @ResponseBody List<CustomerVO> listRemovedCustomer(){
		CustomerVO vo = new CustomerVO();
		vo.setEnabled(false);
		return custRepository.findAllCustomer(vo);
	}
	
	@PostMapping("/info/{id}")
	public @ResponseBody CustomerVO getInfoById(@PathVariable String id){
		return custRepository.getCustomerById(id);
	}

}
