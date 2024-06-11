package edu.dio.fundamentos.visibilidadeDeRecursos.lanchonete.atendimento.cozinha;

//import edu.dio.fundamentos.visibilidadeDeRecursos.lanchonete.atendimento.Atendente;

public class Cozinheiro {
    //pode ser deault
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }
    //pode ser deault
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    //pode ser deault
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
    private void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngridientesLanche(){
        System.out.println("SELECIONADO O PAO, SALADA, OVO E CARNE");
    }
    private void selecionarIngridientesVitamina(){
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }
    private void lavarIngridientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA NOLIQUIDIFICADOR");
    }
    private void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }
    /*public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }*/
    void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
