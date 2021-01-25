package com.csi.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.csi.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

	@Override
	public void saveData() {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEmpName("RABEA");
		e1.setEmpSalary(4514.12);
		
		session.save(e1);
		
		transaction.commit();
	}

	@Override
	public void hibernateNQ() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.getNamedQuery("findEmployeeByName");
		query.setParameter("empName", "MUKUND");
		
		List<Employee> empNQ = query.list();
		
		System.out.println(empNQ);
		
	}

}
