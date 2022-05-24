package Tarea01;

import java.util.Date;

public class Cliente {
    //Atributos
    Number idCliente;
    Date FechaRegistro;

    public Cliente() {
    }

    //Set
    public void setIdCliente(Number idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    //Get
    public Number getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }


    @Override
    public String toString() {
        return super.toString() + " - Cliente{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}