package com.Parameta.Config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Parameta.service.EmpleadoService;

import javax.xml.ws.Endpoint;

@Configuration
public class SoapConfig {

	@Autowired
	private Bus bus;

	@Autowired
	private EmpleadoService empleadoService;

	@Bean
	public Endpoint endpoint() {
		Endpoint endpoint = new EndpointImpl(bus, empleadoService);
		((EndpointImpl) endpoint).publish("/empleadoService");
		return endpoint;
	}
}
