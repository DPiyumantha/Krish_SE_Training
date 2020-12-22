package com.virtusa;

import java.util.ArrayList;

public abstract class Meal {
	
	protected ArrayList<String> items = new ArrayList<String>();
	
	public Meal() {
		createMeal();
	}

	protected abstract void createMeal();

	@Override
	public String toString() {
		return "Meal [items=" + items + "]";
	}
	
	

}
