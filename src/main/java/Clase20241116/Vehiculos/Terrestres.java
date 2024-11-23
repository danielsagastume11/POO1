/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116.Vehiculos;

/**
 *
 * @author Daniel Sagastume
 */
public class Terrestres extends Vehiculos {
    private int ruedas;

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public Terrestres(int ruedas, String Marca, int Peso, int Pasajeros, String Motor, String Color) {
        super(Marca, Peso, Pasajeros, Motor, Color);
        this.ruedas = ruedas;
    }

    
    
}
