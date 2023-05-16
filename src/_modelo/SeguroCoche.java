package _modelo;

public class SeguroCoche {
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public void reparar(Coche c) {
        String resultado = taller.reparar(c);
        System.out.println("El coche ha sido reparado por " + aseguradora + ".");
        System.out.println(resultado);
    }
}
