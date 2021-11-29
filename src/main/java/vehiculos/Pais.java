package vehiculos;

import java.util.ArrayList;
import java.util.Hashtable;

public class Pais {
    private String nombre;
    public Pais(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static Pais paisMasVendedor() {
        //Creamos una hashtable para llevar la contabilidad de los vehiculos.
        ArrayList<Vehiculo> vehiculos = Vehiculo.getVehiculos();
        Hashtable<Pais, Integer> paisHash = new Hashtable<>();
        Pais paisSeleccionado=null;


        for (Vehiculo vehiculo : vehiculos) {
            paisSeleccionado = vehiculo.getFabricante().getPais();
            //En caso de que exista en la hashtable
            if (paisHash.containsKey(paisSeleccionado)) {
                paisHash.put(paisSeleccionado, paisHash.get(paisSeleccionado) + 1);
            }
            //En caso de que no exista
            else {
                paisHash.put(paisSeleccionado, 1);
            }
        }
        int canitidadMax = paisHash.get(vehiculos.get(0).getFabricante().getPais());
        Pais paisMax = vehiculos.get(0).getFabricante().getPais();
        for (Pais pais : paisHash.keySet()) {
            int cant = paisHash.get(pais);
            if (cant > canitidadMax){
                canitidadMax = cant;
                paisMax = pais;
            }
        }
        return paisMax;
    }

}
