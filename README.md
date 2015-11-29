# Gestor Alumnos #

Aplicación web desarrollada con J2EE y MVC mediante Servlets.

1) Configurando el proyecto
----------------------------------

Tomcat - Crear nuevo servidor

	New Apache Tomcat Server 1.6

Eclipse - Crear un nuevo proyecto

	New Dynamic Web Project

	
2) Configurando nuestro repositorio en git
-------------------------------------

Actualizar nuestros datos a nivel global:
	
	git config --global user.name "nombre"
	git config --global user.email "email@email"

Actualizar nuestros datos a nivel de proyecto:
	
	git config user.name "nombre"
	git config user.email "email@email"

Subir nuestro proyecto:

	git init 
	git remote add origin <urlgitrepositorio>
	git add . / git add --all
	git commit -m "descripción"
	git push origin --all

	git status 
	git pull <urlgitrepositorio>
	git merge <nombrerama>
	

3) Ejecutar nuestra aplicación
-------------------------------------

Run as / Debug as: 
    
	localhost/<nombreproyecto>/<archivoinicial>.do


CONTENIDO
---------------

Distribución de paquetes Java Resources:
  
  * **Bean** - Clases principales del proyecto

  * **Controller** - Controladores de cada clase principal

  * **Exception** - Excepciones propias creadas
  
  * **Filter** - Filtros de BackOffice y clases jsp después de iniciar sesión
  
  * **i18n** - Archivos de properties para los mensajes de cada idioma

  * **Listener** - Clases de tipo listener para controlar el inicio de sesión

  * **Service** - Clases correspondientes a la parte service de MVC + envío de emails

  * **Util** - Constantes y enumeraciones

  * **WebService** - WebService de nuestros datos   

Distribución de paquetes WebContent:
  
  * **Backup** - JSPs de cada colección de clase con sus respectivas hojas de estilo

  * **WEB-INF** - Archivos de configuración y librerías necesarias
  
  * **WSDL** - Clases correspondientes a los webservice creados  
