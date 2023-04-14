
package com.mycompany.laboratorio5;

/**
 *
 * @author May3ron
 */
public class NodoArbol {
    int dato;
    String elemento;
    NodoArbol hijoIzquierdo, hijoDerecho;
    public NodoArbol(int d){
        this.dato=d;
       // this.nombre=nom;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;  
    }
    public String toString(){
        return elemento + "Su dato es"+ dato;
    }
}
