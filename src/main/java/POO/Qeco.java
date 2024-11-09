/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Daniel Sagastume
 */
public class Qeco extends Animal {

    public Qeco(String Pelo, String Boca, String Cola, String Ojo, Integer Patas) {
        super(Pelo, Boca, Cola, Ojo, Patas);
    }
    
    @Override
    public void Sonido(){
        System.out.println("El queco tactac");
    }
}
