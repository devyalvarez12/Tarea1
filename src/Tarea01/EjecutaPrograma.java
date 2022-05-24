package Tarea01;

public class EjecutaPrograma
{
    public static void main (String args[])
    {
        Empleado E1 = new Empleado(1,"Devy","Alvarez",29,1,5000);

        System.out.println("Datos de la Persona Ingresada: \n " +
                "ID: "+E1.getIdPersona()+"\n"+
                "Nombre Completo: "+E1.getNombre()+" "+E1.getApellido()+"\n"+
                "Edad: "+ E1.getEdad()+" Años\n"+
                "CodEmpleado: "+ E1.getIdEmpleado()+"\n"+
                "Sueldo: Q"+ E1.getSueldo()

        );
    }
}
