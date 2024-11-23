/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116.Vehiculos;

/**
 *
 * @author Daniel Sagastume
 */
public class Maritimo extends Vehiculos {
    private String Snavegacion;

    public Maritimo(String Snavegacion, String Marca, int Peso, int Pasajeros, String Motor, String Color) {
        super(Marca, Peso, Pasajeros, Motor, Color);
        this.Snavegacion = Snavegacion;
    }

    public String getSnavegacion() {
        return Snavegacion;
    }

    public void setSnavegacion(String Snavegacion) {
        this.Snavegacion = Snavegacion;
    }
    
    
}
