package proyectoInventario;

public class ControladorProducto {
    public static void main(String[] args) {
        
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

        String answer = s1.equals(s2) ? "Yes" : "No";

        System.out.println(answer);



    }
}
