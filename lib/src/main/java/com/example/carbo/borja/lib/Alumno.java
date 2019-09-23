package com.example.carbo.borja.lib;

public class Alumno extends Persona {


    private int asignaturas;

    public Alumno(String nombre, int edad, int dni, int asignaturas ) {
        super(nombre, edad, dni);
        this. asignaturas = asignaturas;
    }

    public int getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(int asignaturas) {
        this.asignaturas = asignaturas;
    }

     //   @OVERRIDE
    public void mostrar() {
        System.out.println("");
        System.out.print("Me llamo " + getNombre() + " Y tengo " + getEdad() + " Matriculado en " + asignaturas + " asignaturas");
        System.out.println("");

    }
}
