package es.deusto.spq;

public class Room {
    private Integer number; 
    private String tipo;
    private int superficie;
    
	
	public Room(Integer number, String tipo, int superficie){
		this.number = number;
		this.tipo = tipo;
		this.superficie = superficie;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getSuperficie() {
		return superficie;
	}


	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Habitación número: " +number+ "de tipo: " +tipo+ "con superficie de : " +superficie+ "m^2";
	}
}
