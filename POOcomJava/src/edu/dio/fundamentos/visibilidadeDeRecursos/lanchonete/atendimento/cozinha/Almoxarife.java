package edu.dio.fundamentos.visibilidadeDeRecursos.lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("CONTROLANDO A ENTRADA DE ITENS");
    }
    private void controlarSaida(){
        controlarEntrada();
        System.out.println("CONTROLANDO A SAIDA DE ITENS");
    }
    void entregarIngredientes(){
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }
}
