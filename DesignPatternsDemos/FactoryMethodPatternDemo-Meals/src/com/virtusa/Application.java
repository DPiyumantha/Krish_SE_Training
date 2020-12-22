package com.virtusa;

import java.util.Calendar;

public class Application {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int hour =calendar.get(Calendar.HOUR_OF_DAY);
		//short message to greet according to the hour of day
		Wish wish = WishFactory.createWish(hour);
		//menu for the meal according to the hour of day
		Meal meal = MealFactory.createMeal(hour);
		wish.displayWish();
		System.out.println("Here is the menu for "+meal.getClass().getSimpleName());
		System.out.println(meal.toString());
	}

}
