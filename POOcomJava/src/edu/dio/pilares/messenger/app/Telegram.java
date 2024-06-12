package edu.dio.pilares.messenger.app;

public class Telegram extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo telegram");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo telegram");
        salvarHistoricoMensagem();
    }
}
