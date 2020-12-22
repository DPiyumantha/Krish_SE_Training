package com.virtusa;

public class WishFactory {
	public static Wish createWish(int hour) {
		if(hour>18) {
			return new NightWish();
		}else if(hour>14) {
			return new EveningWish();
		}else if(hour>=12) {
			return new AfternoonWish();
		}else {
			return new MorningWish();
		}
	}
}
