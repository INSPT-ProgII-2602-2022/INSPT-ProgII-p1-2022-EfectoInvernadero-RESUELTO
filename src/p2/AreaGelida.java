package p2;

public class AreaGelida extends Area {

    private double porcCongelado;

    public AreaGelida(double porcCongelado, int extension, int elevacion) {
        super(extension, elevacion);
        this.porcCongelado = porcCongelado;
    }    

    public boolean estaEnPeligro() {
        return tempPromedio() < -10 && porcCongelado > 90;
    }
}
