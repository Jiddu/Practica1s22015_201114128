/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario_maker_guatemalteco;

import javax.swing.JLabel;

/**
 *
 * @author asus
 */
public class Nodo extends JLabel{
    
Personaje personaje ;
Nodo siguiente;
Nodo anterior;

public Nodo (Personaje personaje){
this.personaje = personaje;
this.siguiente = null;
this.anterior = null;

}

public Nodo (Personaje personaje, Nodo siguiente, Nodo anterior){

this.personaje = personaje;
this.siguiente = siguiente;
this.anterior = anterior;

}



}