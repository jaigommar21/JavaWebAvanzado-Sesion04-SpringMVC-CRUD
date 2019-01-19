package com.tecsup.javawebavanzado.sesion04.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.javawebavanzado.sesion04.dao.EmployeeDAO;
import com.tecsup.javawebavanzado.sesion04.excepcion.DAOException;
import com.tecsup.javawebavanzado.sesion04.excepcion.EmptyResultException;
import com.tecsup.javawebavanzado.sesion04.modelo.Employee;

@Service
public class EmployeeService  {

	@Autowired
	private EmployeeDAO employeeDAO;

	public Employee find(int employee_id) throws DAOException, EmptyResultException {
		
		Employee emp = employeeDAO.findEmployee(employee_id);

		return emp;
	}


	public List<Employee> findAll()
			throws DAOException, EmptyResultException {
		
		List<Employee> emps = employeeDAO.findAllEmployees();
	
		return emps;
	}


	public void update(String login, String password, String lastname, String firstname, int salary, int dptId)
			throws DAOException {
	
		employeeDAO.update(login, password, lastname, firstname, salary, dptId);
	}


	public void delete(String login) throws DAOException {
		 
		employeeDAO.delete(login);
	
	}


	public void create(String login, String password, String lastname, String firstname, int salary, int dptId)
			throws DAOException {
	
		employeeDAO.create(login, password, lastname, firstname, salary, dptId);

	}
	
	

}
