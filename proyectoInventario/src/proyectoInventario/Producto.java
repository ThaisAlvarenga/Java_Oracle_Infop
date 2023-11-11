package proyectoInventario;

public class Producto {

    private int numProducto;
    private String nombre;
    private double precio;
    private int enExistencia;
    private boolean estado = true;

    public Producto() 
    {

    }

    public Producto(int id, String nom, double prec, int numExistencia) 
    {
        this.numProducto = id;
        this.nombre = nom;
        this.precio = prec;
        this.enExistencia = numExistencia;
    }

    //GETTERS

    public int getNumProducto()
    {
        return this.numProducto;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public double getPrecio()
    {
        return this.precio;
    }

    public int getEnExistencia()
    {
        return this.enExistencia;
    }

    public boolean getEstado()
    {
        return this.estado;
    }

    // Este metodo es propio de nuestra clase
    public double getInventory()
    {
        return precio * enExistencia;
    }

    // SETTERS
    public void setNumProducto(int id)
    {
        this.numProducto = id;
    }

    public void setNombre(String nom)
    {
        this.nombre = nom;
    }

    public void setPrecio(double _precio)
    {
        this.precio = _precio;
    }

    public void setEnExistencia(int numExistencia)
    {
        enExistencia = numExistencia;
    }

    public void setEstado(boolean state)
    {
        estado = state;
    }

    //definicion de toString()

    public String toString()
    {

        return "\n Numero del producto: " + this.numProducto
        + "\n Nombre del producto: " + this.nombre
        + "\n Precio del producto: " + this.precio
        + "\n En existencia del producto: " + this.enExistencia
        + "\n Estado de producto" + (this.estado ? "Activo" : "Desactivo"); 

    }


    /*Los ... describen que el argumento es variable, osea que podemos pasar cualquier cantidad 
    que querramos con tal de que los argumentos sean del mismo tipo*/ 
    public void imprimir(String... mensajes)
    {
        for (String mensaje : mensajes)
        {
            System.out.println(mensaje);
        }

        System.out.println();
    }


    public int suma(int... numeros)
    {
        int resultado = 0;

        for (int numero: numeros){
            resultado += numero;
        }

        return resultado;
    }
    
}