package edu.dio.estruturasCondicionais;

public class CondicionalTernaria {
    public static void main(String[] args) {
        //Condicao ternaria 1
        int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        //Condicao ternaria 2
        resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);

         //Condicao ternaria 3
         System.out.println(nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado");
    }
}
