package edu.dio.pilares.messenger.app;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo facebook messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo facebook messenger");
        salvarHistoricoMensagem();
    }
}
