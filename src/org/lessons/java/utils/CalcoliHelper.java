package org.lessons.java.utils;

public class CalcoliHelper {



    //metodi
    //Il fatto di dover scrivere lo stesso metodo per tipi di parametro diversi applica nella pratica uno dei principi di programmazione ad oggetti che abbiamo visto oggi…Quale?
    //L'Overloading

    public static int somma(int a, int b){
        return a + b;
    }

    public static double somma(double a, double b){
        return a + b;
    }

    public static int differenza(int a, int b){
        return a - b;
    }

    public static double differenza(double a, double b){
        return a - b;
    }
    
    public static int moltiplicazione(int a, int b){
        return a * b;
    } 

    public static double moltiplicazione(double a, double b){
        return a * b;
    }

    public static int valoreAssoluto(int a){
        return Math.abs(a);
    }

    public static double valoreAssoluto(double a){
        return Math.abs(a);
    }

    public static int minimo(int a, int b){
        return Math.min(a, b);
    }

    public static double minimo(double a, double b){
        return Math.min(a, b);
    }

    public static int massimo(int a, int b){
        return Math.max(a, b);
    }

    public static double massimo(double a, double b){
        return Math.max(a, b);
    }


}
