package com.ipartek.formacion.exceptions;

public class ConvocatoriaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * {@code}int C�digo de la excepci�n.
	 */
	private transient int codigo;	

	
	public ConvocatoriaException() {
		super();
	}
		
	public ConvocatoriaException(String mensaje, int pcodigo) {
		super(mensaje);
		this.codigo = pcodigo;
	}
	
	/**
	 * C�digo de error para c�digo de la convocatoria no v�lido
	 */
	public static final int COD_CODIGO_NO_VALIDO = 10;	
	
	/**
	 * Mensaje de texto de error para c�digo de la convocatoria
	 */
	public static final String MSG_CODIGO_NO_VALIDO = "El c�digo de la convocatoria introducido no es v�lido.";
		
	public ConvocatoriaException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ConvocatoriaException(String message, Throwable cause) {
		super(message, cause);	
	}

	public ConvocatoriaException(String message) {
		super(message);
	}

	public ConvocatoriaException(Throwable cause) {
		super(cause);

	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
	

}
