/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;
/**
 *
 * @author Daniel Sagastume
 */
public class Herencia {
    public static void main(String[] args) {
    Animal perro1 = new Perro("Color Negro", "SI", "Si", "Si", 4);
    perro1.Sonido();
    
    Animal gato1 = new Gato("Pelo naranja", "Si", "Si", "Si", 4);
    gato1.Sonido();
    
    Animal Qeco1 = new Qeco("No", "Si", "Si", "SI", 4);
    Qeco1.Sonido();
    }  
}
