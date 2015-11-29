package com.ipartek.formacion.exceptions;

/**
 * @author java
 *
 */
public class AlumnoException extends Exception {

	private transient int codigo;

	private static final long serialVersionUID = 1L;

	/**
	 * C�digo de error para c�digo de alumno no v�lido
	 */
	public static final int COD_CODIGO_NO_VALIDO = 10; //siempre numeros multiplos de 10
	
	/**
	 * C�digo de error de para n�mero de hermanos no v�lido
	 */
	public static final int COD_NHERMANOS_NO_VALIDO = 20;
	
	/**
	 * C�digo de error para fecha de nacimiento no v�lida
	 */
	public static final int COD_FECHANACIMIENTO_NO_VALIDA = 30;
	
	/**
	 * Mensaje de texto de error para c�digo de alumno
	 */
	public static final String MSG_CODIGO_NO_VALIDO = "El c�digo de alumno introducido no es v�lido.";
	
	/**
	 * Mensaje de texto de error para n�mero de hermanos
	 */
	public static final String MSG_NHERMANOS_NO_VALIDO = "El n�mero de hermanos introducido no es v�lido.";
	
	/**
	 * Mensaje de error para fecha de nacimiento no v�lida.
	 */
	public static final String MSG_FECHANACIMIENTO_NO_VALIDA = "La fecha de nacimiento introducida no es v�lida.";
	
	public AlumnoException() {
		super();	

	}
	
	//para capturar el codigo de error que reconoce de que error se trata para lanzar la excepcion
	public AlumnoException(String message, int pcodigo) {
		super(message);
		this.codigo = pcodigo;
	}	
	
	public AlumnoException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public AlumnoException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public AlumnoException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public AlumnoException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	public int getCodigo() {
		return codigo;
	}
	

}
