package com.poei.concession.utils;

public class Random {

	public static int RandBetween(int min, int max){
		java.util.Random rand = new java.util.Random();
		return (rand.nextInt((max - min) + 1)) + min;
	}
}
