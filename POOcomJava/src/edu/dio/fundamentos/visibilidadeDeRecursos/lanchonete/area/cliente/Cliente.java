package edu.dio.fundamentos.visibilidadeDeRecursos.lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("ESCOLHENDO LANCHE");
    }
    public void fazerPedido(){
        System.out.println("FAZENDO PEDIDO");
    }
    public void pagarConta(){
        System.out.println("PAGANDO A CONTA");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
    }
    /*public void pegarPedidoBalcao(){
        System.out.println("PEGANDO O PEDIDO NO BALCAO");
    }*/
}
