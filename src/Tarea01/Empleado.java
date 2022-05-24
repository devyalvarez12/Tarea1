package Tarea01;

public class Empleado extends Personas
{
    //Atributos
    Integer idEmpleado;
    Number Sueldo;

    public Empleado() {}

    public Empleado(Number idPersona, String Nombre, String Apellido, Number Edad, Integer idEmpleado,Number Sueldo)
    {
        this.idPersona=idPersona;
        this.Nombre = Nombre;
        this.Apellido= Apellido;
        this.Edad = Edad;
        this.idEmpleado= idEmpleado;
        this.Sueldo = Sueldo;
    }

    //Set
    public void setSueldo(Number Sueldo)
    {
        this.Sueldo = Sueldo;
    }

    //Get
    public Integer getIdEmpleado()
    {
        return idEmpleado;
    }
    public Number getSueldo()
    {
        return Sueldo;
    }


}
    @Override
    public String toString() {
        return super.toString() + " - Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }
