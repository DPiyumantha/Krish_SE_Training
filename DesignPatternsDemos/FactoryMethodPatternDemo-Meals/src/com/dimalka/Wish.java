package com.dimalka;

public abstract class Wish {
	protected String wish="";
	public Wish() {
		createWish();
	};
	public abstract void createWish();
	public void displayWish() {
		System.out.println(wish);
	};
}
