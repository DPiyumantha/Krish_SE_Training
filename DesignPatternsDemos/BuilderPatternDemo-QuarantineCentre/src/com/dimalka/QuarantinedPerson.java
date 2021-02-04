package com.dimalka;

public class QuarantinedPerson {
	private String name;
	private String country;
	private String nicNumber;
	private String passportNumber;
	private int quarantineDays;
	private boolean specialCareNeeded;
	
	public QuarantinedPerson(Builder builder) {
		this.name=builder.name;
		this.quarantineDays = builder.quarantineDays;
		this.country = builder.country;
		this.nicNumber = builder.nicNumber;
		this.passportNumber = builder.passportNumber;
		this.specialCareNeeded = builder.specialCareNeeded;
	}
	
	
	static class Builder{
		private String name;
		private String country;
		private String nicNumber;
		private String passportNumber;
		private int quarantineDays;
		private boolean specialCareNeeded;
		
		public QuarantinedPerson build() {
			return new QuarantinedPerson(this);
		}
		
		public Builder(int quarantineDays) {
			this.quarantineDays = quarantineDays;
		}
		public Builder country(String country) {
			this.country = country;
			return this;
		}
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		public Builder nicNumber(String nicNumber) {
			this.nicNumber = nicNumber;
			return this;
		}
		public Builder passportNumber(String passportNumber) {
			this.passportNumber = passportNumber;
			return this;
		}
		public Builder specialCareNeeded(boolean specialCareNeeded) {
			this.specialCareNeeded = specialCareNeeded;
			return this;
		}
	}


	@Override
	public String toString() {
		return "QuarantinedPerson [name=" + name + ", country=" + country + ", nicNumber=" + nicNumber
				+ ", passportNumber=" + passportNumber + ", quarantineDays=" + quarantineDays + ", specialCareNeeded="
				+ specialCareNeeded + "]";
	}

	
}
