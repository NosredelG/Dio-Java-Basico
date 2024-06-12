package edu.dio.pilares.autodromo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("12345678");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("87654321");
        z400.ligar();
    }
}
    
