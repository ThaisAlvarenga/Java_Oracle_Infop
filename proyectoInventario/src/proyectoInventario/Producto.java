package proyectoInventario;

public class Producto {

    private int numProducto;
    private String nombre;
    private double precio;
    private int enExistencia;

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

    //definicion de toString()

    public String toString()
    {

        return "\n Numero del producto: " + this.numProducto
        + "\n Nombre del producto: " + this.nombre
        + "\n Precio del producto: " + this.precio
        + "\n En existencia del producto: " + this.enExistencia; 

    }
}