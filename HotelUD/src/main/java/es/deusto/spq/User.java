package es.deusto.spq;
public class User {
	private String name; 
    private String dni; 
    private String genero;
	
	public User(String name, String dni, String genero){
		this.name = name;
		this.dni = dni;
        this.genero = genero;
	}
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "Usuario: " +name+ "Dni: " +dni+ "Genéro: " +genero;
	}
	
}
