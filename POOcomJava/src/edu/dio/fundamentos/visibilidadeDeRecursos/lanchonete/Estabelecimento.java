package edu.dio.fundamentos.visibilidadeDeRecursos.lanchonete;

import edu.dio.fundamentos.visibilidadeDeRecursos.lanchonete.area.cliente.Cliente;
import edu.dio.fundamentos.visibilidadeDeRecursos.lanchonete.atendimento.Atendente;
//import edu.dio.fundamentos.visibilidadeDeRecursos.lanchonete.atendimento.cozinha.Almoxarife;
import edu.dio.fundamentos.visibilidadeDeRecursos.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //acoes que nao precisam estarem disponiveis para toda a aplicacao
        /*cozinheiro.selecionarIngridientesVitamina();
        cozinheiro.lavarIngridientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararCombo();*/

        //acoes que estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //Almoxarife almoxarife = new Almoxarife();
        //acoes que nao precisam estarem disponiveis para toda a aplicacao
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();

        //acoes que somente o seu pacote cozinha precisa conhecer (default)
        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        //atendente.pegarLancheCozinha();        
        atendente.servindoMesa();
        atendente.receberPagamento();
        //acao que somente o seu pacote cozinha precisa conhecer (default)
        //atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //nao deveria, mas o estabelecimento 
        //ainda nao definiu normas de atendimento
        //cliente.pegarPedidoBalcao();

        //esta acao e muito sigilosa, que tal ser privada?
        //cliente.consultarSaldoAplicativo();

        //ja pensou os Clientes ouvindo que o gaz acabou?
        //cozinheiro.pedirParaTrocarGas(almoxarife);
        //cozinheiro.pedirParaTrocarGas(atendente);


    }
}
