/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116.Tarjeta_de_credito;

/**
 *
 * @author Daniel Sagastume
 */
public class Transaccion extends Cajero_Automatico{
    private int Deposito;
    private int Retiro;

    public int getDeposito() {
        return Deposito;
    }

    public void setDeposito(int Deposito) {
        this.Deposito = Deposito;
    }

    public int getRetiro() {
        return Retiro;
    }

    public void setRetiro(int Retiro) {
        this.Retiro = Retiro;
    }

    public Transaccion(int Deposito, int Retiro, String Banco, String Formato, String Sistema) {
        super(Banco, Formato, Sistema);
        this.Deposito = Deposito;
        this.Retiro = Retiro;
    }
}
