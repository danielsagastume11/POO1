/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116.Tarjeta_de_credito;

/**
 *
 * @author Daniel Sagastume
 */
public class Cajero_Automatico {
    private String Banco;
    private String Formato;
    private String Sistema;

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public String getSistema() {
        return Sistema;
    }

    public void setSistema(String Sistema) {
        this.Sistema = Sistema;
    }

    public Cajero_Automatico(String Banco, String Formato, String Sistema) {
        this.Banco = Banco;
        this.Formato = Formato;
        this.Sistema = Sistema;
    }
    
}
