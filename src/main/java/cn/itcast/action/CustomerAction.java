package cn.itcast.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.domain.Customer;
import cn.itcast.service.CustomerService;

public class CustomerAction extends ActionSupport{
	private CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	private Integer custId;
	
	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	//根据主键查询
	public String findOne() throws Exception {
		Customer customer =  customerService.findOne(custId);
		ActionContext.getContext().getValueStack().push(customer);
		
		return SUCCESS;
	}
	

}
