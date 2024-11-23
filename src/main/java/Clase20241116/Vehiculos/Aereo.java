/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116.Vehiculos;

/**
 *
 * @author Daniel Sagastume
 */
public class Aereo extends Vehiculos{

    public Aereo(int Alas, int turbinas, String Marca, int Peso, int Pasajeros, String Motor, String Color) {
        super(Marca, Peso, Pasajeros, Motor, Color);
        this.Alas = Alas;
        this.turbinas = turbinas;
    }
    private int Alas;
    private int turbinas;


    public int getAlas() {
        return Alas;
    }

    public void setAlas(int Alas) {
        this.Alas = Alas;
    }

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }
    
    
}
