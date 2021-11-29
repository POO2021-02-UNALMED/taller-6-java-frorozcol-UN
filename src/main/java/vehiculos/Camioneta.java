package vehiculos;

public class Camioneta extends Vehiculo{
    private static int cantidadCamioneta;
    private  boolean volco;

    public Camioneta(String placa, int puertas, String nombre, float precio, float peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso,  "4x4", fabricante);
        this.volco = volco;
        cantidadCamioneta++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamioneta;
    }
}
