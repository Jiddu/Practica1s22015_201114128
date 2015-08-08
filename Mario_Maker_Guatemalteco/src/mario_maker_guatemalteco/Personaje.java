/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario_maker_guatemalteco;

/**
 *
 * @author asus
 */
public class Personaje {

    public Personaje(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Personaje(String nombre, int posicionx, int posiciony, String tipo) {
        this.nombre = nombre;
        this.posicionx = posicionx;
        this.posiciony = posiciony;
        this.tipo = tipo;
    }

    public Personaje() {
    }
    
    String nombre ;
    int posicionx;
    int posiciony;
    String tipo;
   
            
    
    
}
