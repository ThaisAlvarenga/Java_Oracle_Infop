package proyectoInventario;
import java.util.Scanner;

public class ControladorProducto {
    public static void main(String[] args) {

        //los arreglos (arrays) son objetos en java
        //declarar arreglos
        int myArray [] = new int[5]; //or
        //esta notacion se usa cuando no sabes el tamaño del arreglo
        String [] myBouquet = {"rosas", "lirios", "durazno", "eucalipto"};

        myArray[0] =10;
        myArray[3] = 27;

        System.out.println(myArray);

        System.out.println(myBouquet);
        
        Producto prod1 = new Producto();
        Producto prod2 = new Producto();

        Producto prod3 = new Producto(3, "Pizarra", 2500.23, 20);
        Producto prod4 = new Producto(4, "Excritorio", 5000, 10);

        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(prod4);

        String s1 = "Howdy";
        String s2 = "Hello";

        // esto funviona más o menos como un if else
        // esto se llama operador ternario
        String answer = s1.equals(s2) ? "Yes" : "No";

        System.out.println(answer);


        Producto [] misProductos = {new Producto(1, "Pizarra", 2500.23, 20), 
                                    new Producto(2, "Pizarra", 2500.23, 20), 
                                    new Producto(3, "Pizarra", 2500.23, 20)};

        // el for normal puede cambiar los valores en el arreglo
        for (int i = 0; i < misProductos.length; i++)
        {
            //si queremos modificar los valores lo hacemos aqui
            System.out.println(misProductos[i]);
        }

        //el for each es más para los valores
        for (Producto currentProducto : misProductos)
        {
            System.out.println("Imprimiendo con un for each");
            //cualquier operacion hecha con currentProducto no cambiaria el valor en el arreglo original
            System.out.println(currentProducto);
        }

        //arreglos bidimensionales
        int[][] myBiArray = new  int[3][3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < myBiArray.length; i++)
        {
            for(int j = 0 ; j < myBiArray[i].length; j++ )
            {
                System.out.println("Ingrese un valor para la fila " + i + " y columna " + j + ":");
                myBiArray[i][j] = in.nextInt();

            }

        }

        in.close();
        System.out.println();


        for (int i = 0; i < myBiArray.length; i++)
        {
            for(int j = 0 ; j < myBiArray[i].length; j++ )
            {
                System.out.print(myBiArray[i][j] );
            }

            System.out.println();

        }

        prod1.imprimir("Hola","Buen dia","Como estamos");

        System.out.println(prod1.suma(1,2,3,4));

        
    }
}
