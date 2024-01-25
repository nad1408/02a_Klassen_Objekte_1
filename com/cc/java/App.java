package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Objekt erzeugen
        Cat cat = new Cat("Alonzo", "grey", 35); 

        // Ausgaben
        output(cat.getName());
        output(cat.getFurColor());
        output(String.valueOf(cat.getName()));  // int --> String

        output("---------------");

        Cat cat2 = new Cat("Grizabella", "white", 29);

        // Ausgabe
        output(cat2.getName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));  // int --> String

    }

   // statische Methode --- in Klasse
    public static void output(String outputStr){
        System.out.println(outputStr);
    }
      

}
 