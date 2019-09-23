package com.example.carbo.borja.lib;

public class Persona {

    private int edad;
    private String nombre;
    private int dni;

    public Persona(String nombre, int edad, int dni)
    {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    /* Codigo adicional */
    public void mostrar() {
        System.out.println("Me llamo " + nombre + " Y tengo " + edad);
        System.out.println("");
    }


}
