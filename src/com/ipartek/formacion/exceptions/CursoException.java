/**
 * 
 */
package com.ipartek.formacion.exceptions;

/**
 * CursoException es una {@code}Exception que gestiona los errores de {@code}Curso
 * @author java
 *
 */
public class CursoException extends Exception {

	/**
	 * {@code}int Código de la excepción.
	 */
	private transient int codigo;	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CursoException() {
		super();
	}
		
	public CursoException(String mensaje, int pcodigo) {
		super(mensaje);
		this.codigo = pcodigo;
	}
	
	/**
	 * Código de error para código del curso no válido
	 */
	public static final int COD_CODIGO_NO_VALIDO = 10;
	
	/**
	 * Código de error de para el precio del curso no válido
	 */
	public static final int COD_PRECIO_NO_VALIDO = 20;
	
	/**
	 * Mensaje de texto de error para código del curso
	 */
	public static final String MSG_CODIGO_NO_VALIDO = "El código del curso introducido no es válido.";
	
	/**
	 * Mensaje de texto de error para precio del curso
	 */
	public static final String MSG_PRECIO_NO_VALIDO = "El precio del curso introducido no es válido.";

	

	public CursoException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public CursoException(String message, Throwable cause) {
		super(message, cause);

	}

	public CursoException(String message) {
		super(message);

	}

	public CursoException(Throwable cause) {
		super(cause);

	}

	@Override
	public String getMessage() {

		return super.getMessage();
	}
	
	
	
	
	
	
}
