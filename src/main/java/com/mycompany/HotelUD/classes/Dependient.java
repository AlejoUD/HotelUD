package com.mycompany.HotelUD.classes;

public class Dependient {
	protected int counter;
	protected String name;
	protected String dni;
	protected String password;
	protected String gender;
	protected String position;
	protected String description;
	protected String bankAccount;
	public Dependient(int counter, String name, String dni, String password, String gender, String position,
			String description, String bankAccount) {
		super();
		this.counter = counter;
		this.name = name;
		this.dni = dni;
		this.password = password;
		this.gender = gender;
		this.position = position;
		this.description = description;
		this.bankAccount = bankAccount;
	}
	public Dependient() {
		super();
		this.counter = 0;
		this.name = "";
		this.dni = "";
		this.password = "";
		this.gender = "";
		this.position = "";
		this.description = "";
		this.bankAccount = "";
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	@Override
	public String toString() {
		return "Dependient [counter=" + counter + ", name=" + name + ", dni=" + dni + ", password=" + password
				+ ", gender=" + gender + ", position=" + position + ", description=" + description 
				+ ", bankAccount=" + bankAccount + "]";
	}

	

}
