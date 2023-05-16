package _presentacion;


import _modelo.Coche;
import _modelo.SeguroCoche;
import _modelo.TallerMecanica;
import _modelo.TallerPintura;

public class Main {
    public static void main(String[] args) {
        // Crear objetos Coche
        Coche coche1 = new Coche("ABC123", "Modelo1");
        Coche coche2 = new Coche("DEF456", "Modelo2");

        // Crear objetos Taller
        TallerMecanica tallerMecanica = new TallerMecanica();
        TallerPintura tallerPintura = new TallerPintura();

        // Realizar reparaciones en los talleres
        String resultadoMecanica = tallerMecanica.reparar(coche1);
        String resultadoPintura = tallerPintura.reparar(coche2);

        // Crear objeto SeguroCoche
        SeguroCoche seguroCoche1 = new SeguroCoche(tallerMecanica, "Aseguradora1");
        SeguroCoche seguroCoche2 = new SeguroCoche(tallerPintura, "Aseguradora2");

        // Realizar reparaciones mediante el seguro
        seguroCoche1.reparar(coche1);
        seguroCoche2.reparar(coche2);
    }
}