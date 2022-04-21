package com.mycompany.HotelUD.classes;

public class User {
	
    private int counter;
    private String name; 
    private String dni; 
    private String gender;
    private int age;
    private String password;
    private String bankCount;
    
    public User (int counter,String name, String dni, String gender, int age, String password, String bankCount) {
        super();
        this.counter = counter;
        this.name = name;
        this.dni = dni;
        this.gender = gender;
        this.age = age;
        this.password = password;
        this.bankCount = bankCount;
    }
    public User() {
        super();
        this.counter = 0;
        this.name = "";
        this.dni = "";
        this.gender = "";
        this.age = 0;
        this.password = "";
        this.bankCount = "";
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
    public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public void setDni(String dni) {
        this.dni = dni;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getBankCount() {
        return bankCount;
    }
    public void setBankCount(String bankCount) {
        this.bankCount = bankCount;
    }
    @Override
    public String toString() {
        return "User code "+counter+" name: " + name + ", dni: " + dni + ", gender: " + gender + ", age: " + age + ", password: " + password
                + ", bankCount: " + bankCount;
    }
}

