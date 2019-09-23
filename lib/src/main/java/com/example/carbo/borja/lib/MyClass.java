package com.example.carbo.borja.lib;


import java.util.ArrayList;
import java.util.function.Consumer;

public class MyClass {
    public static void main(String[] args) {
        String cadenasArray[] = {"Hola ", "Mundo! ", "Como ", "estas? "};

//        Persona p = new Persona( "Borja", 47, 12345678);

//        Alumno a = new Alumno( "Paco", 47, 12345678, 10);



        ArrayList<Persona> pArray = new ArrayList<>();
        pArray.add(new Persona( "Andres", 40, 12345678));
        pArray.add(new Alumno( "Borja", 47, 12345678, 10));
        pArray.add(new Profesor("Jesus", 45, 87765433, "aplicaciones móviles"));




        System.out.println("");
        System.out.println("formato compacto");
        for (String x:cadenasArray) {
        System.out.print(x);
        }

        System.out.println("");
        System.out.println("formato array");
        for (int i = 0; i < cadenasArray.length; i++) {
            System.out.print(cadenasArray[i]);
        }

        ArrayList<String> cadenasList = new ArrayList<String>();
        cadenasList.add("Hola ");
        cadenasList.add("Mon! ");
        cadenasList.add("Com ");
        cadenasList.add("estas? ");

        System.out.println("");
        for (int i = 0; i < cadenasList.size(); i++) {
            System.out.print(cadenasList.get(i));
        }

        System.out.println("");
        cadenasList.forEach(new Consumer<String>() {
            public void accept(String x) {
                System.out.print(x);
            }
        });

        System.out.println("");
        for(String x:cadenasList) {
            System.out.print(x);
        }

        System.out.println("");
        System.out.println(cadenasList);



        /* convert to upper case */
        ArrayList<String> cadenasUpperList = new ArrayList<String>();
        for(String x:cadenasList) {
            cadenasUpperList.add(x.toUpperCase());
        }

        System.out.println("");
        for(String x:cadenasUpperList) {
            System.out.print(x);
        }


        System.out.println("");
        System.out.println(cadenasUpperList);

//        p.mostrar();

//        a.mostrar();

        for (Persona x:pArray)
        {
            x.mostrar();
        }

    }
}
