package p2;

public class AreaTundraPolar extends AreaTundra {

    private IntensidadViento intensidadViento;

    public AreaTundraPolar(IntensidadViento intensidadViento, int cantMMLlovidos, int extension, int elevacion) {
        super(cantMMLlovidos, extension, elevacion);
        this.intensidadViento = intensidadViento;
    }    

    public boolean estaEnPeligro() {
        return super.estaEnPeligro() || (algunaTempMayorQue(8) 
                && intensidadViento == IntensidadViento.FUERTE);
    }
}
