package Objetos;

public class Interfaz {
	
	//Mostrara los mensajes por consola
	public static void iniciar() {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			MiException ex = new MiException(2);
			System.out.println(ex.obtenerError(ex.codigoError));					
			
		}catch (Exception e) {		
			System.out.println(e.getMessage());
			
		}finally {
			terminar();
		}		
	}
	
	public static void terminar() {
		System.out.println("Programa terminado");
	}
}
