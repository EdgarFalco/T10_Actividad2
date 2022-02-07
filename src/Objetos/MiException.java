package Objetos;

public class MiException extends Exception {

	//Atributos
	int codigoError;

	//Constructores
	public MiException() {
		super();
	}

	public MiException(int codigoError) {
		super();
		this.codigoError = codigoError;
	}
	
	//Metodos
	public String obtenerError(int numError) {
		
		String mensaje = "";
		
		switch (numError) {
		case 1:
			mensaje = "Excepcion 1: Esto es un objeto Excepcion";
			break;

		case 2:
			mensaje = "Excepcion 2: Esto es un objeto Excepcion";
			break;
		
		case 3:
			mensaje = "Excepcion 3: Esto es un objeto Excepcion";
			break;
		default:
			mensaje = "Excepcion 4: Esto es un objeto Excepcion";
			break;
		}	
		return mensaje;
	}		
}
