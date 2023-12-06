package com.Parameta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Parameta.model.Empleado;

@RestController
@RequestMapping("/services/empleado")
public class EmpleadoController {

    private final com.Parameta.service.EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(com.Parameta.service.EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @PostMapping("/guardar")
    public String guardarEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.guardarEmpleado(empleado);
    }
}

