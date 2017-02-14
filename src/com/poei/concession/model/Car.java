package com.poei.concession.model;

import java.util.ArrayList;
import java.util.Date;

import com.poei.concession.model.base.DateableItem;
import com.poei.concession.utils.Random;

public class Car extends DateableItem {
	private String name;
	private int color;
	private ArrayList<Wheel> wheels;

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
	 * @return the color
	 */
	public int getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}

	/**
	 * @return the wheels
	 */
	public ArrayList<Wheel> getWheels() {
		return wheels;
	}	/**
	 * @param wheels the wheels to set
	 */
	public void setWheels(ArrayList<Wheel> wheels) {
		this.wheels = wheels;
	}

	public Car() {
		this.wheels = new ArrayList<Wheel>();
	}

	public Car(String name, float wheelType){
		this.wheels = new ArrayList<Wheel>();
		for (int i = 0; i < 4; i++) {
			this.wheels.add(new Wheel(wheelType));
		}

		this.color = Random.RandBetween(0, 255);
		this.name = name;
		this.setCreateAt(new Date());
	}
}
