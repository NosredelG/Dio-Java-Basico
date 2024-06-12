package edu.dio.pilares.messenger.app;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
}
