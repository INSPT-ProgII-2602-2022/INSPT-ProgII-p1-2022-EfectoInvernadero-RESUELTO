package p2;

import java.util.ArrayList;

public abstract class Area implements Monitoreable {

    private int extension;
    private int elevacion;
    private ArrayList<Double> temps;

    public Area(int extension, int elevacion) {
        this.extension = extension;
        this.elevacion = elevacion;
        this.temps = new ArrayList<>();
    }

    public int getElevacion() {
        return elevacion;
    }

    public boolean algunaTempMayorQue(double cuanto) {
        int i = 0;

        while (i < this.temps.size() && this.temps.get(i) <= cuanto) {
            i++;
        }
        return i < this.temps.size();
    }

    public double maxTemp() {
        double tempMax = Double.NEGATIVE_INFINITY;
        for (Double temp : temps) {
            if (temp > tempMax) {
                tempMax = temp;
            }
        }
        return tempMax;
    }

    public double tempPromedio() {
        double prom = 0;
        double acu = 0;
        int cant = temps.size();
        for (Double temperatura : temps) {
            acu += temperatura;
        }
        if (cant > 0) {
            prom = acu / cant;
        }
        return prom;
    }
}
