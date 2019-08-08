package cn.itcast.service;

import cn.itcast.dao.CustomerDao;
import cn.itcast.domain.Customer;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	
	public Customer findOne(Integer custId) {
		// TODO Auto-generated method stub
		return customerDao.finfOne(custId);
	}
	

}
