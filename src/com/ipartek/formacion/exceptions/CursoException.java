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
	 * {@code}int C�digo de la excepci�n.
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
	 * C�digo de error para c�digo del curso no v�lido
	 */
	public static final int COD_CODIGO_NO_VALIDO = 10;
	
	/**
	 * C�digo de error de para el precio del curso no v�lido
	 */
	public static final int COD_PRECIO_NO_VALIDO = 20;
	
	/**
	 * Mensaje de texto de error para c�digo del curso
	 */
	public static final String MSG_CODIGO_NO_VALIDO = "El c�digo del curso introducido no es v�lido.";
	
	/**
	 * Mensaje de texto de error para precio del curso
	 */
	public static final String MSG_PRECIO_NO_VALIDO = "El precio del curso introducido no es v�lido.";

	

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
