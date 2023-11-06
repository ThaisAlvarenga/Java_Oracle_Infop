package primerPackage;

public class Persona {

    //declaracion de variables
    private int id;
    private String nombre;

    public Persona()
    {

    }

    // setter
    public void setId(int x)
    {
        id = x;
        
    }

    public void setNombre(String s)
    {
        nombre = s;
        
    }

    //getter
    public int getId()
    {

        return id;

    }

    public String getNombre() 
    {

        return(nombre);

    }


}