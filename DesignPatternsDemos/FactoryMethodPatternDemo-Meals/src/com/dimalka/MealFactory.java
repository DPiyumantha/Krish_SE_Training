package com.dimalka;

public class MealFactory {
	
	public static Meal createMeal(int hour) {
		if(hour<12) {
			return new Breakfast();
		}else if(hour>=12 && hour<16) {
			return new Lunch();
		}else if(hour<=24 && hour>=16) {
			return new Dinner();
		}
		return null;
	}

}
