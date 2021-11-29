package vehiculos;

public class Camion extends Vehiculo{

    private static int cantidaCamion;
    private int ejes;

    public Camion(String placa, String nombre, float precio, float peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2",  fabricante);
        this.ejes = ejes;
        cantidaCamion++;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getCantidadCamiones() {
        return cantidaCamion;
    }
}
