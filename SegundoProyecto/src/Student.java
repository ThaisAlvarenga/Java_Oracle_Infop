public class Student {
    //declara variables
    int edad;
    String nombre;
    

    //Constructores 
    Student(){}

    Student(int x, String n){
        nombre = n;
        edad = x;
    }


    //Setters: descriptores mutadores o establecedores
    public void setNombre(String s){
        nombre = s;
    }

    public void setEdad(int e){
        edad = e;
    }


    // Getters: descriptores de acceso 
    public String getNombre(){

        return nombre;
    }

    public int getEdad(){

        return edad;
    }
    

    //nos permite ver los datos del estudiante
    //El toString es una clase de java que regresa la representación textual del objeto

    @Override
    public String toString(){

        String s1 = "Nombre: " + getNombre() + " Edad: " + getEdad();

        return s1;

    }
}
