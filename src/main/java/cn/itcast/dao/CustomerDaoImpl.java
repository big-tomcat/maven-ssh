package cn.itcast.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itcast.domain.Customer;


public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	
	public Customer finfOne(Integer custId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Customer.class, custId);
	}

}
