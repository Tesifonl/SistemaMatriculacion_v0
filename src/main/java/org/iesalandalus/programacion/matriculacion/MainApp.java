package org.iesalandalus.programacion.matriculacion;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.matriculacion.dominio.Asignatura;
import org.iesalandalus.programacion.matriculacion.dominio.CicloFormativo;
import org.iesalandalus.programacion.matriculacion.dominio.Curso;
import org.iesalandalus.programacion.matriculacion.dominio.EspecialidadProfesorado;
import org.iesalandalus.programacion.matriculacion.dominio.Matricula;
import org.iesalandalus.programacion.matriculacion.negocio.Alumnos;
import org.iesalandalus.programacion.matriculacion.negocio.Asignaturas;
import org.iesalandalus.programacion.matriculacion.negocio.CiclosFormativos;
import org.iesalandalus.programacion.matriculacion.negocio.Matriculas;
import org.iesalandalus.programacion.matriculacion.vista.Consola;
import org.iesalandalus.programacion.matriculacion.vista.Opcion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
    public static final int CAPACIDAD=3;
    public static Alumnos alumnos;
    public static Matriculas matriculas;
    public static Asignaturas asignaturas;
    public static CiclosFormativos ciclosFormativos;
    
    
    private static void ejecutarOpcion(Opcion opcion) throws OperationNotSupportedException {
    	
    	do {
    		if (opcion.equals(Opcion.INSERTAR_ALUMNO)) {
    			insertarAlumno();
    		}
    		if (opcion.equals(Opcion.BORRAR_ALUMNO)) {
    			borrarAlumno();
    		}
    		if (opcion.equals(Opcion.BUSCAR_ALUMNO)) {
    			buscarAlumno();
    		}
    		if (opcion.equals(Opcion.MOSTRAR_ALUMNOS)) {
    			mostrarAlumnos();
    		}
    		
       		if (opcion.equals(Opcion.INSERTAR_ASIGNATURA)) {
    			insertarAsignatura();
    		}
    		if (opcion.equals(Opcion.BORRAR_ASIGNATURA)) {
    			borrarAsignatura();
    		}
    		if (opcion.equals(Opcion.BUSCAR_ASIGNATURA)) {
    			buscarAsignatura();
    		}
    		if (opcion.equals(Opcion.MOSTRAR_ASIGNATURAS)) {
    			mostrarAsignaturas();
    		}
    		
       		if (opcion.equals(Opcion.INSERTAR_CICLO_FORMATIVO)) {
    			insertarCicloFormativo();
    		}
    		if (opcion.equals(Opcion.BORRAR_CICLO_FORMATIVO)) {
    			borrarCicloFormativo();
    		}
    		if (opcion.equals(Opcion.BUSCAR_CICLO_FORMATIVO)) {
    			buscarCicloFormativo();
    		}
    		if (opcion.equals(Opcion.MOSTRAR_CICLOS_FORMATIVOS)) {
    			mostrarCiclosFormativos();
    		}
    		if (opcion.equals(Opcion.INSERTAR_MATRICULA)) {
    			insertarMatricula();
    		}
    		if (opcion.equals(Opcion.BUSCAR_MATRICULA)) {
    			buscarMatricula();
    		}
    		if (opcion.equals(Opcion.ANULAR_MATRICULA)) {
    			anularMatricula();
    		}
    		if (opcion.equals(Opcion.MOSTRAR_MATRICULAS)) {
    			mostrarMatriculas();
    		}
    		
    	}
    	while (opcion!=Opcion.SALIR);
    }
   

    private static void insertarAlumno() throws OperationNotSupportedException {
		try {
			alumnos.insertar(Consola.leerAlumno());
			
			}
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
		
			}
			catch(NullPointerException e) {
			System.out.println(e.getMessage());
			
			}
    }
    
    private static void buscarAlumno() throws OperationNotSupportedException {
  		try {
  			alumnos.buscar(Consola.getAlumnoPorDni());
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    
    
    
    
    private static void borrarAlumno() throws OperationNotSupportedException {
  		try {
  			alumnos.borrar(Consola.getAlumnoPorDni());
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    
    private static void mostrarAlumnos() throws OperationNotSupportedException {
  		try {
  			 if(alumnos.getTamano()>0) {
  				 alumnos.toString();
  			 }
  			 else {
  				 System.out.println(" No existe alumnos en el sistema");
  			 }
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    
    private static void insertarAsignatura() throws OperationNotSupportedException {
  		try {
  			asignaturas.insertar(Consola.leerAsignatura());
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    private static void buscarAsignatura(){
  		try {
  			asignaturas.buscar(Consola.getAsignaturaPorCodigo());
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    private static void borrarAsignatura() throws OperationNotSupportedException {
  		try {
  			asignaturas.borrar(Consola.getAsignaturaPorCodigo());
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }

    
    private static void mostrarAsignaturas()  {
  		try {
  			 if(asignaturas.getTamano()>0) {
  				 asignaturas.toString();
  			 }
  			 else {
  				 System.out.println(" No existen asignaturas  en el sistema");
  			 }
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    
    private static void insertarCicloFormativo() throws OperationNotSupportedException {
  		try {
  			ciclosFormativos.insertar(Consola.leerCicloFormativo());
  			 
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    

    private static void  buscarCicloFormativo() throws OperationNotSupportedException {
  		try {
  			ciclosFormativos.buscar(Consola.getCicloFormativoPorCodigo());
  			 
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    
    private static void  borrarCicloFormativo() throws OperationNotSupportedException {
  		try {
  			ciclosFormativos.borrar(Consola.getCicloFormativoPorCodigo());
  			 
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    private static void mostrarCiclosFormativos()  {
  		try {
  			 if(ciclosFormativos.getTamano()>0) {
  				 ciclosFormativos.toString();
  			 }
  			 else {
  				 System.out.println(" No existen ciclos formativos en el sistema");
  			 }
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    /*dudas con la matricula que habria que insertar aqui*/
    private static void  insertarMatricula() throws OperationNotSupportedException {
  		try {
  			
  			matriculas.insertar(Consola.leerMatricula(Consola.leerAlumno(), Consola.getMatriculaPorIdentificacion().getColeccionAsignaturas()));
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    
    private static void  buscarMatricula() throws OperationNotSupportedException {
  		try {
  			matriculas.buscar(Consola.getMatriculaPorIdentificacion());
  			 
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    private static void  anularMatricula() throws OperationNotSupportedException {
  		try {
  			matriculas.borrar(Consola.getMatriculaPorIdentificacion());
  			 
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    
    private static void mostrarMatriculas()  {
  		try {
  			 if(matriculas.getTamano()>0) {
  				 matriculas.toString();
  			
  			 }
  			 else {
  				 System.out.println(" No existen matriculas en el sistema");
  			 }
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    private static void mostrarMatriculasPorAlumno() throws OperationNotSupportedException  {
  		try {
  			 if(Consola.getMatriculaPorIdentificacion()!=null) {
  				Consola.getMatriculaPorIdentificacion().toString();
  			 }
  			 else {
  				 System.out.println(" No existen matriculas para este alumno");
  			 }
  			
  			}
  			catch(IllegalArgumentException e) {
  				System.out.println(e.getMessage());
  		
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			
  			}
      }
    
    private static void mostrarMatriculasPorCicloFormativo() throws OperationNotSupportedException  {
  		try {
  				 Matricula[] busquedaMatricula=matriculas.get();
  				 Matricula[] encontradaMatricula=null;
  				 Asignatura[] busquedaAsignatura=null;
  				 boolean encontrada=false;
  				 boolean otro=false;
  				 int contador=0;
  				 
  		
  				 ciclosFormativos.toString();
  				 
  				 for (int i=0; i<busquedaMatricula.length-1;i++)
  				 {
  					 busquedaAsignatura=busquedaMatricula[i].getColeccionAsignaturas();
  				 	 for(int j=0;j<busquedaAsignatura.length-1;j++) {
  				 		 if(busquedaAsignatura[j].getCicloFormativo().equals(Consola.getCicloFormativoPorCodigo()))
  				 		 	{
  				 			contador++;
  				 		 	encontrada=true;
  				 			encontradaMatricula[contador-1]=busquedaMatricula[i];
  				 			encontradaMatricula.toString();
  				 		 	}
  				 		 	else {
  				 			 otro=true;	 
  				 		 	}
  				 	}
  				 }
  				 
  			}
  			catch(IllegalArgumentException e) {
  			System.out.println(e.getMessage());
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			}
      }
    
    private static void mostrarMatriculasPorCursoAcademico() throws OperationNotSupportedException  {
  		try {
  				 System.out.println("Introduce el curso");
				 String CursoAcademico=Entrada.cadena();	 
				 Matricula[] busquedaMatricula=matriculas.get(CursoAcademico);
  				 busquedaMatricula.toString();
  			}
  			catch(IllegalArgumentException e) {
  			System.out.println(e.getMessage());
  			}
  			catch(NullPointerException e) {
  			System.out.println(e.getMessage());
  			}
      }
    
    public static void main(String[] args) throws OperationNotSupportedException {

    		Consola.mostrarMenu();
    		Opcion opcion=Consola.elegirOpcion();
    		ejecutarOpcion(opcion);


        System.out.println("Hasta luego!!!!");
    }



}
