package com.tecsup.javawebavanzado.sesion04.servicio;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.javawebavanzado.sesion04.dao.EmployeeDAO;
import com.tecsup.javawebavanzado.sesion04.excepcion.DAOException;
import com.tecsup.javawebavanzado.sesion04.modelo.Employee;

@Service
public class SecurityService  {

	@Autowired
	private EmployeeDAO employeeDAO;

	public Employee validate(String login, String password) throws LoginException, DAOException {

		Employee emp = employeeDAO.validate(login, password);

		return emp;
	}

}
