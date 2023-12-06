package com.Parameta.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.Parameta.model.Empleado;

@WebService
public interface EmpleadoService {

	@WebMethod
	String guardarEmpleado(@WebParam(name = "empleado") Empleado empleado);
}