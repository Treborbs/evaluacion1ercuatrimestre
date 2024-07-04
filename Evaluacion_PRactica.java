package Evaluacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evaluacion_PRactica {
 public static void main(String[] args) {
	 Scanner datos = new Scanner(System.in);
	 
	 List<String> nombre = new	ArrayList<>();
	 List<String> apellido = new ArrayList <>();
	 List<Integer> nlegajo = new ArrayList <>();
	 boolean verdad = false;
	 int numero;
	 System.out.println("Ingrese la cantidad de empleados a registrar: ");
	 int cantidadempleados = datos.nextInt();
	 
	 for (int i = 0 ; i < cantidadempleados; i++) {
		 
		 System.out.println("Ingrese un nombre de usuario: ");
		 nombre.add(datos.next());

		 System.out.println("Ingrese un apellido de usuario: ");
		 apellido.add(datos.next());
		 
		 while (verdad = true) {
		 
		 System.out.println("Ingrese un numero de legajo (maximo 5 cifras) : ");
		 numero = datos.nextInt();	
		
		 if (numero < 99999 ) {
			 nlegajo.add(numero);
			 verdad = true;
			 break;
		 }
		 else if (numero > 99999) {
			 System.err.println("Numero incorrecto ");
		 }
		 
		 
		 
		 }
		  
		 
	 
}
	 
	 for (int i = 0 ; i < nlegajo.size(); i++) {
		 for (int j = 0; j < nlegajo.size() -1 ;j++) {
			if (nlegajo.get(j)> nlegajo.get(j+1)) {
				
				int nauxiliar = nlegajo.get(j); 
				nlegajo.set(j, nlegajo.get(j+1));
				nlegajo.set((j+i), nauxiliar);
				
				String nomauxiliar = nombre.get(j); 
				nombre.set(j, nombre.get(j+1));
				nombre.set((j+i), nomauxiliar);
				
				String apelauxiliar = apellido.get(j); 
				apellido.set(j, apellido.get(j+1));
				apellido.set((j+i), apelauxiliar);
				
			}
			 
			 
		 }
	 }


	 	System.out.println("Los nombres ordenados son: ");
	 
	 for (int i = 0 ; i < nlegajo.size(); i++) {
		 	System.out.println("Nombre: "+nombre.get(i));
		 	System.out.println("Apellido: "+apellido.get(i));
		 	System.out.println("Numero de legajo: "+nlegajo.get(i));
	 }
	 
	 System.out.println("-------------------------------------------");
	 
	 System.out.println("Ingrese un número de legajo (Buscar) ");
	 int numrandom = datos.nextInt();
	 
	 for (int i = 0 ; i < nlegajo.size(); i++) {

		 if (numrandom == nlegajo.get(i)) {
			 
			 System.out.println(nlegajo.get(i));
			 System.out.println(nombre.get(i));
			 System.out.println(apellido.get(i));
		 }
		 else if (numrandom != nlegajo.get(i)) {
			 System.out.println("Ese usuario no existe");
			 break;
		 }
	}
	
	 System.out.println("Programa finalizado");
	 
	 
	 
}
}
