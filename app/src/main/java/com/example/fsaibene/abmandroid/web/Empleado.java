package com.example.fsaibene.abmandroid.web;

/**
 * Esta clase representa un gasto individual de cada registro de la base de datos
 */
public class Empleado {
    public String idEmpleado;
    public int nombre;
    public String apellido;
    public String cargo;


    public Empleado(String idEmpleado, int nombre, String apellido, String cargo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }
}
