package classes;
public class User {
	private int counter = 0;
	private String name; 
    private String dni; 
    private String gender;
    private int age;
	private String surname;
	private String bankCount;
	public User(int counter,String name, String dni, String gender, int age, String surname, String bankCount) {
		super();
		this.counter = counter++;
		this.name = name;
		this.dni = dni;
		this.gender = gender;
		this.age = age;
		this.surname = surname;
		this.bankCount = bankCount;
	}
	public User() {
		super();
		this.counter = counter++;
		this.name = "";
		this.dni = "";
		this.gender = "";
		this.age = 0;
		this.surname = "";
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBankCount() {
		return bankCount;
	}
	public void setBankCount(String bankCount) {
		this.bankCount = bankCount;
	}
	@Override
	public String toString() {
		return "User code "+counter+" name: " + name + ", dni: " + dni + ", gender: " + gender + ", age: " + age + ", surname: " + surname
				+ ", bankCount: " + bankCount;
	}

}
