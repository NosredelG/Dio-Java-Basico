package edu.dio.pilares.multifuncional.estabelecimento;

import edu.dio.pilares.multifuncional.equipamentos.copiadora.Copiadora;
import edu.dio.pilares.multifuncional.equipamentos.digitalizadora.Digitalizadora;
import edu.dio.pilares.multifuncional.equipamentos.impressora.Deskjet;
import edu.dio.pilares.multifuncional.equipamentos.impressora.Impressora;
import edu.dio.pilares.multifuncional.equipamentos.impressora.Laserjet;
import edu.dio.pilares.multifuncional.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora laserjet = new Laserjet();
        Deskjet deskjet = new Deskjet();
        laserjet.imprimir();
        deskjet.imprimir();
        laserjet = deskjet;
        laserjet.imprimir();

        Multifuncional multi = new Multifuncional();
        multi.imprimir();
        multi.copiar();
        multi.digitalizar();

        Impressora impressora = multi;
        Copiadora copiadora = multi;
        Digitalizadora digitalizadora = multi;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
        laserjet = multi;
        //deskjet = multi;
        laserjet.imprimir();
    }
}
