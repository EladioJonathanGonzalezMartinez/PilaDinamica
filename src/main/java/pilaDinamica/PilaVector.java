/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaDinamica;

import java.util.Vector;

/**
 *
 * @author remix
 */
public class PilaVector {
    private static final int INICIAL = 19;
    private int cima;
    private Vector listaPila;
    
    public void insertar(Object elemento) throws Exception
    {
        cima++;
        listaPila.addElement(elemento);
    }
    public Object quitar() throws Exception
    {
        Object aux;
        if (pilaVacia()) {
            throw new Exception ("Pila vacia, no se puede extraer.");
        }
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }
    
    public Object cimaPila() throws Exception
    {
        if (pilaVacia()) {
            throw new Exception ("Pila vacia, no se puede extraer.");
        }
        return listaPila.elementAt(cima);
    }
    
    public boolean pilaVacia()
    {
        return cima == -1;
    }
    
    public void limpiarPila() throws Exception
    {
        while (! pilaVacia())
            quitar();
    }
    
    public void mostrarPila(){
             for (int i = listaPila.size(); i > 0; i--) {
                 if ((int) listaPila.elementAt(i-1)!=0) {
                     System.out.println(listaPila.elementAt(i-1));
                     
                 }
                 
             }
         }
}
