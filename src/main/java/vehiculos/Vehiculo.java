package vehiculos;

import java.util.ArrayList;

public class Vehiculo {
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static int cantidadVehiculo;
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private float precio;
    private float peso;
    private Fabricante fabricante;
    private String traccion;

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, float precio, float peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        this.traccion = traccion;
        cantidadVehiculo++;
        vehiculos.add(this);
    }

    public String getPlaca() {
        return placa;
    }

    public static int getCantidadVehiculo() {
        return cantidadVehiculo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculo;
    }

    public static void setCantidadVehiculos(int cantidadVehiculo) {
        Vehiculo.cantidadVehiculo = cantidadVehiculo;
    }

    public static String vehiculosPorTipo(){
        return  "Automoviles: " + Automovil.getCantidadAutomoviles() +
                "\nCamionetas: " + Camioneta.getCantidadCamionetas() +
                "\nCamiones: " + Camion.getCantidadCamiones();
    }
}
