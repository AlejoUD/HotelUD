package es.deusto.spq;
public class Worker {
    private String name; 
    private String dni; 
    private String genero;
	
	public Worker(String name, String dni, String genero){
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
		return "Trabajador: " +name+ "Dni: " +dni+ "Genéro: " +genero;
	}
}
