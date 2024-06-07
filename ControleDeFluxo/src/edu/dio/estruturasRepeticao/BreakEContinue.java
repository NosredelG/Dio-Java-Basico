package edu.dio.estruturasRepeticao;

public class BreakEContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break; //interrompe o laco
            
            System.out.println(numero);
            
        }

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue; //pula a interacao e continua o laco
            
            System.out.println(numero);
            
        }
    }
}
