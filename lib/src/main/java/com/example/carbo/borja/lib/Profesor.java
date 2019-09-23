package com.example.carbo.borja.lib;


public class Profesor extends Persona {

    private String asignatura;

    public Profesor(String nombre, int edad, int dni, String asignatura ) {
        super(nombre, edad, dni);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    //   @OVERRIDE
    public void mostrar() {
        System.out.println("");
        System.out.print("Me llamo " + getNombre() + " y tengo " + getEdad() + " Doy la asignatura de " + asignatura);
        System.out.println("");

    }
}
