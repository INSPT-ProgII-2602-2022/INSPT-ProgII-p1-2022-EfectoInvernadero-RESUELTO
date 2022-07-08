package p2;

import java.util.ArrayList;

public class PuntoDeControl {

    private ArrayList<Area> areas;

    public PuntoDeControl() {
        this.areas = new ArrayList<>();
    }

    public void agregarArea(Area a) {
        this.areas.add(a);
    }

    public int areasEnPeligro() {
        int cant = 0;
        for (Area area : areas) {
            if (area.estaEnPeligro()) {
                cant++;
            }
        }
        return cant;
    }

    public double maxTempAreasTundra() {
        double tempMax = Double.NEGATIVE_INFINITY;
        for (Area area : areas) {
            if (area instanceof AreaTundra) {
                double temp = area.maxTemp();
                if (temp > tempMax) {
                    tempMax = temp;
                }
            }
        }
        return tempMax;
    }
}
