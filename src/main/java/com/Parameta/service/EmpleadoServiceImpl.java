package com.Parameta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parameta.model.Empleado;
import com.Parameta.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	private final EmpleadoRepository empleadoRepository;

	@Autowired
	public EmpleadoServiceImpl(EmpleadoRepository empleadoRepository) {
		this.empleadoRepository = empleadoRepository;
	}

	@Override
	public String guardarEmpleado(Empleado empleado) {
		try {

			Empleado empleadoGuardado = empleadoRepository.save(empleado);

			return "Empleado guardado con éxito. ID: " + empleadoGuardado.getId();

		} catch (Exception e) {
			e.printStackTrace();
			return "Error al guardar el empleado.";
		}
	}

}