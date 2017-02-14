package com.poei.concession.model;

import java.util.ArrayList;

import com.poei.concession.model.base.DateableItem;

public class Garage extends DateableItem {
	private String address;
	private ArrayList<Wheel> stock;
	private ArrayList<Wheel> trash;
	private ArrayList<Car> todoCars;
	private ArrayList<Car> doneCars;
	private ArrayList<Technician> technician;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the stock
	 */
	public ArrayList<Wheel> getStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(ArrayList<Wheel> stock) {
		this.stock = stock;
	}
	/**
	 * @return the trash
	 */
	public ArrayList<Wheel> getTrash() {
		return trash;
	}
	/**
	 * @param trash the trash to set
	 */
	public void setTrash(ArrayList<Wheel> trash) {
		this.trash = trash;
	}
	/**
	 * @return the todoCars
	 */
	public ArrayList<Car> getTodoCars() {
		return todoCars;
	}
	/**
	 * @param todoCars the todoCars to set
	 */
	public void setTodoCars(ArrayList<Car> todoCars) {
		this.todoCars = todoCars;
	}
	/**
	 * @return the doneCars
	 */
	public ArrayList<Car> getDoneCars() {
		return doneCars;
	}
	/**
	 * @param doneCars the doneCars to set
	 */
	public void setDoneCars(ArrayList<Car> doneCars) {
		this.doneCars = doneCars;
	}
	/**
	 * @return the technician
	 */
	public ArrayList<Technician> getTechnician() {
		return technician;
	}
	/**
	 * @param technician the technician to set
	 */
	public void setTechnician(ArrayList<Technician> technician) {
		this.technician = technician;
	}

	public Garage(){
		this.todoCars = new ArrayList<Car>();
		this.doneCars = new ArrayList<Car>();
		this.stock = new ArrayList<Wheel>();
		this.technician = new ArrayList<Technician>();
		this.trash = new ArrayList<Wheel>();
	}

	public Garage(String name){
		this.todoCars = new ArrayList<Car>();
		this.doneCars = new ArrayList<Car>();
		this.stock = new ArrayList<Wheel>();
		this.technician = new ArrayList<Technician>();
		this.trash = new ArrayList<Wheel>();
	}

	public void recieve(Car car){
		float wheelType = car.getWheels().get(0).getDiametre();
		int stockedWheel = 0;
		for (Wheel wheel : this.getStock()) {
			if (wheel.getDiametre()== wheelType) {
				stockedWheel++;
				if (stockedWheel == 4) {
					System.out.println("Your car is registered.");
					break;
				}
			}
		}
		if (stockedWheel == 4) {
			this.todoCars.add(car);
			for (Technician technician : this.technician) {
				if (true) {
					technician.changeWheel(car);
					break;
				}
			}
		}else{
			System.out.println("Your car cannot be registered because we have not enought "+wheelType + " ¤ wheels.");
		}
	}

	public Car delivery(String carName){
		Car result = null;
		Boolean flag = false;
		for (Car car : doneCars) {
			if (car.getName().equals(carName)) {
				flag = true;
				if (car.getWheels().get(0).getCreateAt() != null) {
					result = car;
					System.out.println("Your car " + car.getName() + " is now repaired thank you.");
				}else {
					System.out.println("Your car is not yet repaired.");
				}
			}
		}

		if (result == null && !flag) {
			System.out.println("We never register your car in our concession.");
		}

		return result;
	}
}
