package primerPackage;

public class Persona {

    //declaracion de variables
     /*Las variables de clases suelen ser privadas en la convencion y se accesan solo con los setters y getters*/
    private int id;
    private String nombre;
    public final int CONSTANTE = 24; //los nombres de las constantes se escriben en mayusculas

    // los constructores nunca retornan un valor y siempre tienen el mismo nombre de la clase
    /*A gregar un constructor en Java es opcional, pero si no se declaran, los valored de las variables del objeto tendran los valores que se pusieron en su declaracion dentro de la clase.*/
    public Persona(int _id, String _nombre){
        //this es una palabra reservada que hace referencia a el objeto de esta instancia
        this.id = _id;
        this.nombre = _nombre;
    }

    /* Los modificadores de las clases SIEMPRE son publicos, privados o protegidos */

    // setter
    public void setId(int x)
    {
        id = x;
        
    }

    public void setNombre(String s)
    {
        nombre = s;
        
    }

    // getter
    public int getId()
    {

        return id;

    }

    public String getNombre() 
    {

        return(nombre);

    }


}