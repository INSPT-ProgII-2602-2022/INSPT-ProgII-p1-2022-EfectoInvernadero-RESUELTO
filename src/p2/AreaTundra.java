package p2;

public class AreaTundra extends Area {

    private int cantMMLlovidos;

    public AreaTundra(int cantMMLlovidos, int extension, int elevacion) {
        super(extension, elevacion);
        this.cantMMLlovidos = cantMMLlovidos;
    }

    public boolean estaEnPeligro() {
        return algunaTempMayorQue(10) && getElevacion() > 500;
    }
}
