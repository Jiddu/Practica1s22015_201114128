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
public class Listadoble {
    
      Nodo Inicio;
     Nodo Fin;
     
     public Listadoble(){
     Inicio = null;
     Fin = null;
     }
     
     
      // agregar al inicio
     public void agregarInicio( int P){
        Inicio = new Nodo (P, Inicio);
        if (Fin == null){
       Fin = Inicio;
     }
      
}
     
     //Metodo para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = Inicio;
        System.out.println();
        while(recorrer != null){
            System.out.print("[" + recorrer.dato + "]--->");
            recorrer = recorrer.Siguiente;
        }
    }    

   
    
    //Metodo que verifica si la lista esta vacia
public boolean estaVacia()
    {
        if(Inicio == null)
        {
            return true;
        }else
        {
            return false;
        }
    }

    
//metodo para eliminar un nodo del inicio
    public int borrarDelInicio()
    {
        int elemento = Inicio.dato;
        if(Inicio == Fin){
            Inicio = null;
            Fin = null;
        }else{
            Inicio = Inicio.Siguiente;
        }
        return elemento;
    }

   
    //metodo para eliminar un nodo del final
    public int borrarDelFinal()
    {
        int elemento = Fin.dato;
        if(Inicio == Fin)
        {
            Inicio = Fin = null;
        }else{
            Nodo temporal = Inicio;
            while(temporal.Siguiente!=Fin)
            {
                temporal = temporal.Siguiente;
            }
            Fin = temporal;
            Fin.Siguiente = null;                
        }
        return elemento;
    }
     
}
