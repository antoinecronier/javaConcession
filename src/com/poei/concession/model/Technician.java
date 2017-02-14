package com.poei.concession.model;

import java.util.Date;

import com.poei.concession.model.base.DateableItem;

public class Technician extends DateableItem {
	private String name;
	private Garage garage;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the garage
	 */
	public Garage getGarage() {
		return garage;
	}
	/**
	 * @param garage the garage to set
	 */
	public void setGarage(Garage garage) {
		this.garage = garage;
	}

	public void changeWheel(Car car){
		System.out.println("Technician " + this.name + " will change your wheels.");
		float wheelType = car.getWheels().get(0).getDiametre();

		for (Wheel whell : car.getWheels()) {
			this.garage.getTrash().add(whell);
		}
		
		car.getWheels().clear();
		
		for (Wheel wheel : this.garage.getStock()) {
			if (wheel.getDiametre()== wheelType) {
				wheel.setCreateAt(new Date());
				car.getWheels().add(wheel);
				System.out.println("New wheel :\n" + wheel + "\n added.");
			}
		}
		for (Wheel whell : car.getWheels()) {
			this.garage.getStock().remove(whell);
		}
		
		this.garage.getTodoCars().remove(car);
		this.garage.getDoneCars().add(car);
	}

	public Technician(String name, Garage garage) {
		this.name = name;
		this.garage = garage;
	}
}
