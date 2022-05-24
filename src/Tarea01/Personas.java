package Tarea01;

public class Personas {

    //Atributos
    int  idPersona, Edad;
    String Nombre;
    String Apellido;


    private static int contadorPersona =0;


    //Constructores
    public Personas(Number idPersona, String Nombre, String Apellido, Number Edad)
    {
        this.idPersona=idPersona;
        this.Nombre=Nombre;
        this.Apellido=Apellido;
        this.Edad=Edad;
        contadorPersona++;
    }

    public Personas() {}

    //Sets
    public void setNombre(String Nombre)
    {
        this.Nombre=Nombre;
    }
    public void setApellido(String Apellido)
    {
        this.Apellido=Apellido;
    }
    public void setEdad(Number Edad)
    {
        this.Edad=Edad;
    }

    //Get
    public Number getIdPersona()
    {
        return idPersona;
    }
    public String getNombre()
    {
        return Nombre;
    }
    public String getApellido()
    {
        return Apellido;
    }
    public Number getEdad()
    {
        return Edad;
    }
}
