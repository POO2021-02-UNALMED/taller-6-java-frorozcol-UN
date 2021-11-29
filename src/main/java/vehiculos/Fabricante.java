package vehiculos;

import java.util.ArrayList;
import java.util.Hashtable;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public static Fabricante fabricaMayorVentas(){
        //Creamos una hashtable para llevar la contabilidad de los vehiculos.
        ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();
        Hashtable<Fabricante, Integer> paisHash = new Hashtable<>();
        Fabricante fabSeleccionado=null;


        for (Vehiculo vehiculo : vehiculos) {
            fabSeleccionado = vehiculo.getFabricante();
            //En caso de que exista en la hashtable
            if (paisHash.containsKey(fabSeleccionado)) {
                paisHash.put(fabSeleccionado, paisHash.get(fabSeleccionado) + 1);
            }
            //En caso de que no exista
            else {
                paisHash.put(fabSeleccionado, 1);
            }
        }
        int canitidadMax = paisHash.get(vehiculos.get(0).getFabricante());
        Fabricante fabMax = vehiculos.get(0).getFabricante();
        for (Fabricante fab : paisHash.keySet()) {
            int cant = paisHash.get(fab);
            if (cant > canitidadMax) {
                canitidadMax = cant;
                fabMax = fab;
            }
        }
        return fabMax;
    }
}
