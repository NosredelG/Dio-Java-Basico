package edu.dio.estruturasRepeticao;

public class EstruturaFor {
    public static void main(String[] args) {
        /*//estrutura do controle de fluxo for

        for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
        {
            // comando que será executado até que a 
            // expressão de validação torne-se falsa 
        } */

        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

        //estrutura 2
        //o que importa é somente o bloco condicional
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
        System.out.println(carneirinhos + " - Carneirinho(s)");
        carneirinhos ++;
        }       

    }
}