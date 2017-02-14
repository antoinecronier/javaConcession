package com.poei.concession.model;

import com.poei.concession.model.base.DateableItem;
import com.poei.concession.utils.Random;

public class Wheel extends DateableItem {
	private int color;
	private float diametre;

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
	 * @return the dimension
	 */
	public float getDiametre() {
		return diametre;
	}
	/**
	 * @param dimension the dimension to set
	 */
	public void setDiametre(float diametre) {
		this.diametre = diametre;
	}

	public Wheel(float wheelType) {
		this.color = Random.RandBetween(0, 255);
		this.diametre = wheelType;
	}
}
