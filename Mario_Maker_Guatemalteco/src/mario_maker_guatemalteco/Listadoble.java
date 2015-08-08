/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario_maker_guatemalteco;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author asus
 */
public class Listadoble {
    Nodo ultimo;
    Nodo primero;
  
    
    
    public Listadoble() {
    ultimo = null;
    primero = null;
    }
    
    
    public boolean listavacia(){
    
        if (primero == null){
        
           return true;
           
        }else {
                return false;
    }
    }
    
        public void agregarpersonajesalinicio (Personaje personaje){
        if (!listavacia()) {
        primero = new Nodo (personaje, primero, null);
        primero.siguiente.anterior = primero;
        }else {
        primero = ultimo = new Nodo(personaje);        
        }
        
        }
        
        
        
        public void agregarpersonajealfinal (Personaje personaje){
        if (!listavacia()){
        ultimo = new Nodo (personaje, null, ultimo);
        ultimo.anterior.siguiente = ultimo;
        }else {
        primero = ultimo = new Nodo (personaje);
        }
        }
        
        
        
        public Personaje eliminaralinicio () {
        Personaje personaje = primero.personaje;
            if (primero == ultimo){
            primero = ultimo = null;
            }else {
            primero = primero.siguiente;
            primero.anterior = null;
   
            }
            return personaje;
            
        
        }
        
        
        
        public Personaje eliminarelultimo () {
        Personaje personaje = ultimo.personaje;
        if (primero == ultimo){
        ultimo = primero = null;
        }else {
        ultimo = ultimo.anterior;
        ultimo.siguiente = null;
        
        }
        return personaje;
        }
        
        
        public void mostrarListainiciofin(){
        
        if (!listavacia()){
        
        String datos = "<=>";
        Nodo aux = primero;
            while (aux != null) {                
                datos = datos + "["+ aux.personaje.nombre+"]<=>" ;
                aux = aux.siguiente;
                
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando lisda de inicio a fin " , JOptionPane.INFORMATION_MESSAGE);
        }
        }
        
        
    public void cargardatos (JPanel panelito, JFrame dibujitos) {
    
    int contador  = 0;
    Nodo aux = primero;
        while (aux!=null) {            
            if (aux.personaje.tipo == "MARITOO"){
                ImageIcon imagen = new ImageIcon ("C:\\Users\\asus\\Documents\\NetBeansProjects\\Practica1s22015_201114128\\Mario_Maker_Guatemalteco\\src\\ImagenesdeJuego\\mario.png");
                aux.setIcon(imagen);
                aux.setBounds (10,50+ (50* contador), 32,32);
                panelito.add(aux);
               // panelito.repaint ();
             
                JLabel nombre = new JLabel();
                nombre.setText(aux.personaje.nombre);
                nombre.setBounds (40,50+ (50* contador), 50,32);
                panelito.add(nombre);
                dibujitos.repaint();
                
                
                   contador++;
                
                   panelito.repaint ();
                   
                aux = aux.siguiente;
           
           
                
                
                
            } else  if (aux.personaje.tipo == "honguito"){
                ImageIcon imagen = new ImageIcon ("C:\\Users\\asus\\Documents\\NetBeansProjects\\Practica1s22015_201114128\\Mario_Maker_Guatemalteco\\src\\ImagenesdeJuego\\hongo.png");
                aux.setIcon(imagen);
                aux.setBounds (10,50+ (50* contador), 32,32);
                panelito.add(aux);
                panelito.repaint ();
                contador++;
                 aux = aux.siguiente;
            } else  if (aux.personaje.tipo == "fichitaa"){
                ImageIcon imagen = new ImageIcon ("C:\\Users\\asus\\Documents\\NetBeansProjects\\Practica1s22015_201114128\\Mario_Maker_Guatemalteco\\src\\ImagenesdeJuego\\ficha.png");
                aux.setIcon(imagen);
                aux.setBounds (10,50+ (50* contador), 32,32);
                panelito.add(aux);
                panelito.repaint ();
                contador++;
                 aux = aux.siguiente;
        } else  if (aux.personaje.tipo == "CASTILLOOO"){
                ImageIcon imagen = new ImageIcon ("C:\\Users\\asus\\Documents\\NetBeansProjects\\Practica1s22015_201114128\\Mario_Maker_Guatemalteco\\src\\ImagenesdeJuego\\castillo.png ");
                aux.setIcon(imagen);
                aux.setBounds (10,50+ (50* contador), 32,32);
                panelito.add(aux);
                panelito.repaint ();
                contador++;
                 aux = aux.siguiente;
        } else  if (aux.personaje.tipo == "suelitoo"){
                ImageIcon imagen = new ImageIcon ("C:\\Users\\asus\\Documents\\NetBeansProjects\\Practica1s22015_201114128\\Mario_Maker_Guatemalteco\\src\\ImagenesdeJuego\\Suelo.png ");
                aux.setIcon(imagen);
                aux.setBounds (10,50+ (50* contador), 32,32);
                panelito.add(aux);
                panelito.repaint ();
                contador++;
                 aux = aux.siguiente;
        }else  if (aux.personaje.tipo == "pareditaa"){
                ImageIcon imagen = new ImageIcon ("C:\\Users\\asus\\Documents\\NetBeansProjects\\Practica1s22015_201114128\\Mario_Maker_Guatemalteco\\src\\ImagenesdeJuego\\Pared.png ");
                aux.setIcon(imagen);
                aux.setBounds (10,50+ (50* contador), 32,32);
                panelito.add(aux);
                panelito.repaint ();
                contador++;
                 aux = aux.siguiente;
        }else  if (aux.personaje.tipo == "tortuguita"){
                ImageIcon imagen = new ImageIcon (" C:\\Users\\asus\\Documents\\NetBeansProjects\\Practica1s22015_201114128\\Mario_Maker_Guatemalteco\\src\\ImagenesdeJuego\\Kopa.png ");
                aux.setIcon(imagen);
                aux.setBounds (10,50+ (50* contador), 32,32);
                panelito.add(aux);
                panelito.repaint ();
                contador++;
                 aux = aux.siguiente;
        }else  if (aux.personaje.tipo == "goombitaa"){
                ImageIcon imagen = new ImageIcon ("C:\\Users\\asus\\Documents\\NetBeansProjects\\Practica1s22015_201114128\\Mario_Maker_Guatemalteco\\src\\ImagenesdeJuego\\Gomba.png ");
                aux.setIcon(imagen);
                aux.setBounds (10,50+ (50* contador), 32,32);
                panelito.add(aux);
                panelito.repaint ();
                contador++;
                 aux = aux.siguiente;
        }
                
                
    } 
  } 
    
    
    
    public int tamaño (){
        Nodo aux = primero;
         int contador=0; 
        while (aux!= null) {            
        contador = contador +1;   
        }
        
        
        return contador;
    
    
    }
    
    }
 

    

            
            
