/*Para crear un Package en VSCode, haz un folder con el nombre del package dentro del src folder. Agrega todos tus files en ese folder y agrega el package a los files */
package primerPackage; // Los paquetes son un grupo de clases que tiene una funcionalidad

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
		
		//al crear este objeto, los valores de las variables seria nulos porque asi estan en la clase
        Persona persona1 = new Persona();
		persona1.setId(10);
		persona1.setNombre("Thais");

        System.out.println("ID: " + persona1.getId());
		System.out.println("Name: " + persona1.getNombre());



        double galones = 0;
		double litros = 0;
		
		//declarar escaner para pedir informacion al usuario
		Scanner in = new Scanner(System.in);
		// el usuario ingresaria el numero en la linea despues de esta.
		System.out.println("Ingrese el numero de galones que quiere convertir a litros");
		
		galones = in.nextDouble();
		// recuerda cerrar el in para que no tengas data leaks
		in.close();

		litros = galones * 3.785;
		
		System.out.println(galones + " galones equivale a " + litros);
		
    }
}
