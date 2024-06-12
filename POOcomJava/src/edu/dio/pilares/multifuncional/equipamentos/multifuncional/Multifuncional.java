package edu.dio.pilares.multifuncional.equipamentos.multifuncional;

import edu.dio.pilares.multifuncional.equipamentos.copiadora.Copiadora;
import edu.dio.pilares.multifuncional.equipamentos.digitalizadora.Digitalizadora;
import edu.dio.pilares.multifuncional.equipamentos.impressora.Impressora;

public class Multifuncional implements Impressora, Digitalizadora, Copiadora{
    public void copiar(){
        System.out.println("Copiando documento com Multifuncional");
    }
    public void digitalizar(){
        System.out.println("Digitalizando documento com Multifuncional");
    }
    public void imprimir(){
        System.out.println("Imprimindo documento com Multifuncional");
    }
}
