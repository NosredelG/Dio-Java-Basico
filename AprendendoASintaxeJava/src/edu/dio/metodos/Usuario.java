package edu.dio.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada?" + smartTv.ligada);
        System.out.println("Volume atual?" + smartTv.volume);
        System.out.println("Canal atual?" + smartTv.canal);

        smartTv.ligar();
        System.out.println("Tv ligada?" + smartTv.ligada);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual?" + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual?" + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal atual?" + smartTv.canal);
        smartTv.mudarCanal(12);
        System.out.println("Canal atual?" + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual?" + smartTv.canal);

        smartTv.desligar();
        System.out.println("Tv ligada?" + smartTv.ligada);

    }
}
