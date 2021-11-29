package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
    protected static int cantidadAutomovil;
    private int puestos;

    public Automovil(String placa, String nombre, float precio, float peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso,  "FWD", fabricante);
        this.puestos = puestos;
        cantidadAutomovil++;

    }


    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getCantidadAutomoviles() {
        return cantidadAutomovil;
    }

    public static void setCantidadAutomoviles(int cantidadAutomovil) {
        Automovil.cantidadAutomovil = cantidadAutomovil;
    }
}
