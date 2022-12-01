package com.bridgelabz;

public class AirtelService {
	
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void activateService() {
		service.service();
	}

}
