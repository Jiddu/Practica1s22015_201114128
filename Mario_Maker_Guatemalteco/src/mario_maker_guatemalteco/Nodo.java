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
public class Nodo {
    
     int dato;
    Nodo Siguiente;
    Nodo Anterior;
    
    
    
    public Nodo (int P){
    dato = P;
    this.Siguiente = null;
    this.Anterior = null;
    }
    
     
    public Nodo (int P, Nodo n){
    dato = P;
    this.Siguiente = n;
    this.Anterior = n;
}
}