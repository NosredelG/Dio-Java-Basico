package edu.dio.anatomiaDasClasses;
public class MinhaClasse {
    public static void main(String[] args) {
        //System.out.print("Ola mundo!!!");

        /*
        //Declarando Variaveis
        final String BR = "Brasil"; //final e as letras maiusculas demonstra que essa variavel nao pode sofrer alteração
        final double PI = 3.14;
        final int ESTADOS_BRASILEIROS = 27;
        
        //declaracao invalida de variaveis
        int numero&um = 1;
        int 1numero = 1;
        int numero um = 1;
        int long = 1;

        //declaracao valida de variaveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroUm = 1;
        int longo = 1;

        //Estrutura 
        Tipo nomeBemDefinido = Atribuicao (opcional em alguns casos)        

        String meuNome = "Glederson";
        int anoDeNascimento = 1982;
        boolean casado = true;

        //Declarando Metodos
        //Estrutura
        TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

        int somar (int numeroUm, int numeroDois)
        String formatarCep(long cep)
        */

        String primeiroNome = "Glederson";
        String segundoNome = "da Costa Ferreira";

        System.out.println(nomeCompleto("Nome completo: "+ primeiroNome, segundoNome));


    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
