/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116.Tarjeta_de_credito;

/**
 *
 * @author Daniel Sagastume
 */
public class Cuenta_Bancaria extends Cajero_Automatico {
    private int CuentaAhorro;
    private int CuentaCorriente;

    public int getCuentaAhorro() {
        return CuentaAhorro;
    }

    public void setCuentaAhorro(int CuentaAhorro) {
        this.CuentaAhorro = CuentaAhorro;
    }

    public int getCuentaCorriente() {
        return CuentaCorriente;
    }

    public void setCuentaCorriente(int CuentaCorriente) {
        this.CuentaCorriente = CuentaCorriente;
    }

    public Cuenta_Bancaria(int CuentaAhorro, int CuentaCorriente, String Banco, String Formato, String Sistema) {
        super(Banco, Formato, Sistema);
        this.CuentaAhorro = CuentaAhorro;
        this.CuentaCorriente = CuentaCorriente;
    }
    
    
}
