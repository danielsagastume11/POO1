/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116.Vehiculos;

/**
 *
 * @author Daniel Sagastume
 */
public class Vehiculos {
    private String Marca;
    private int Peso;
    private int Pasajeros;
    private String Motor;
    private String Color;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Vehiculos(String Marca, int Peso, int Pasajeros, String Motor, String Color) {
        this.Marca = Marca;
        this.Peso = Peso;
        this.Pasajeros = Pasajeros;
        this.Motor = Motor;
        this.Color = Color;
    }
}
