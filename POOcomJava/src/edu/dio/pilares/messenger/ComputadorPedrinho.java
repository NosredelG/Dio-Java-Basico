package edu.dio.pilares.messenger;

import java.util.Scanner;

import edu.dio.pilares.messenger.app.FacebookMessenger;
import edu.dio.pilares.messenger.app.MSNMessenger;
import edu.dio.pilares.messenger.app.ServicoMensagemInstantanea;
import edu.dio.pilares.messenger.app.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN messenger
        MSNMessenger msn = new MSNMessenger();

        //msn.validarConectadoInternet();
        //msn.enviarMensagem();
        //msn.salvarHistoricoMensagem();
        // msn.receberMensagem();

        FacebookMessenger faceMsn = new FacebookMessenger();
        // faceMsn.enviarMensagem();
        // faceMsn.receberMensagem();

        Telegram telegram = new Telegram();
        // telegram.enviarMensagem();
        // telegram.receberMensagem();

        //polimorfismo
        ServicoMensagemInstantanea smi = null;
        Scanner scanner = new Scanner(System.in);

        String appEscolhido = scanner.nextLine();

        if(appEscolhido.equals("msn")){
            smi = msn;
        } else if(appEscolhido.equals("fbm")){
            smi = faceMsn;
        } else if (appEscolhido.equals("tlg")){
            smi = telegram;
        } else{
            System.out.println("Nenhum app de messagem foi escolhido");
        }
        if(smi != null){
            smi.enviarMensagem();
            smi.receberMensagem();
        }
        scanner.close();
    }
}
