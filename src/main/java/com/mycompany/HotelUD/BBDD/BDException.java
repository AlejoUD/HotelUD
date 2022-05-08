package com.mycompany.HotelUD.BBDD;


/**
 * Representa un error en la base de datos
 *
 */
public class BDException extends Exception {
	
	private String mensaje;
	
	/**
	 * Construye la excepci�n con le mensaje indicado
	 * @param message mensaje contenido en la excepci�n
	 */
	public BDException(String message) throws BDException{
		super(message);
		mensaje = message;
	}

	/**
	 * Construye la excepci�n con el mensaje y la excepci�n
	 * interna anidada.
	 * @param message mensaje de la excepci�n
	 * @param t excepci�n interna anidada
	 */
	public BDException(String message, Throwable t) throws BDException{
		super(message, t);
		mensaje = message;
	}
	
	public String toString(){
		return mensaje;
	}
}
