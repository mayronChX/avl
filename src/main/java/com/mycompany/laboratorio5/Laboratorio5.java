

package com.mycompany.laboratorio5;

import javax.swing.JOptionPane;

/**
 *
 * @author May3ron
 */
public class Laboratorio5 {

    public static void main(String[] args) {
        int opcion=0, elemento;
      //String nombre;
      ArbolBinario arbolito = new ArbolBinario();
      do{
          try{  
             opcion = Integer.parseInt( JOptionPane.showInputDialog(null,
                     "ELIGE UNA OPCION...\n"+
                     "1. Agregar un Nodo\n"
             + "2. Recorrer el Arbol InOrden\n"  
             + "3. Recorrer el Arbol PreOrden\n" 
             + "4. Recorrer el Arbol PostOrden\n"  
             + "5. Buscar un Nodo en el Arbol\n"  
             + "6. Eliminar un Nodo del Arbol\n"                 
             + "7. Salir \n "
             ,"Arboles Binarios Avl"
             ,JOptionPane.INFORMATION_MESSAGE));
             switch(opcion){
                 case 1:
                     elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                             "Ingresar el Numero del Nodo....", "Agregando Nodo",JOptionPane.QUESTION_MESSAGE));
                    //  nombre =JOptionPane.showInputDialog(null,
                    //   "Ingresar el Nombre del Nodo....", "Agregando Nodo",JOptionPane.QUESTION_MESSAGE);
                     arbolito.agregarNodo (elemento);
                     break;
                 case 2:
                     if(!arbolito.estaVacio()){
                         System.out.println();
                        arbolito.inOrden(arbolito.raiz); 
                     }else{
                       JOptionPane.showMessageDialog(null,"El Arbol esta Vacio","¡Cuidado!"
                             ,JOptionPane.INFORMATION_MESSAGE);  
                     }
                     break;
                      case 3:
                          if(!arbolito.estaVacio()){
                              System.out.println();
                        arbolito.PreOrden(arbolito.raiz); 
                     }else{
                       JOptionPane.showMessageDialog(null,"El Arbol esta Vacio","¡Cuidado!"
                             ,JOptionPane.INFORMATION_MESSAGE); 
                          }
                       break;
                        case 4:
                          if(!arbolito.estaVacio()){
                              System.out.println();
                        arbolito.PostOrden(arbolito.raiz); 
                     }else{
                       JOptionPane.showMessageDialog(null,"El Arbol esta Vacio","¡Cuidado!"
                             ,JOptionPane.INFORMATION_MESSAGE); 
                          }
                       break;
                         case 5:
                          if(!arbolito.estaVacio()){
                         elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                             "Ingresar el Numero del Nodo Buscado....", "Buscando Nodo",JOptionPane.QUESTION_MESSAGE));
                        // arbolito.buscarNodo(elemento);
                         if(arbolito.buscarNodo(elemento)==null){
                          JOptionPane.showMessageDialog(null,"El Nodo no se encuentra en el Arbol","¡Nodo no Encontrado!"
                             ,JOptionPane.INFORMATION_MESSAGE);     
                         }else{
                             System.out.println("Nodo Encontrado, sus datos son: " + (elemento));
                         }
                     }else{
                       JOptionPane.showMessageDialog(null,"El Arbol esta Vacio","¡Cuidado!"
                             ,JOptionPane.INFORMATION_MESSAGE); 
                          }
                       break;
                         case 6:
                             if(!arbolito.estaVacio()){
                         elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                             "Ingresar el Numero del Nodo a Eliminar....", "Eliminando Nodo",JOptionPane.QUESTION_MESSAGE));
                        // arbolito.buscarNodo(elemento);
                         if(arbolito.eliminar(elemento)==false){
                          JOptionPane.showMessageDialog(null,"El Nodo no se encuentra en el Arbol","¡Nodo no Encontrado!"
                             ,JOptionPane.INFORMATION_MESSAGE);     
                         }else{
                            JOptionPane.showMessageDialog(null,"El Nodo ha sido Eliminado del Arbol","¡Nodo Eliminado!"
                             ,JOptionPane.INFORMATION_MESSAGE);     
                         }
                     }else{
                       JOptionPane.showMessageDialog(null,"El Arbol esta Vacio","¡Cuidado!"
                             ,JOptionPane.INFORMATION_MESSAGE); 
                          } 
                             break;
                       case 7:
                     JOptionPane.showMessageDialog(null,"Aplicacion Finalizada","¡Fin!"
                             ,JOptionPane.INFORMATION_MESSAGE);
                     break;
                 default:
                   JOptionPane.showMessageDialog(null,"Opcion Incorrecta","Error"
                             ,JOptionPane.ERROR_MESSAGE);   
             }
          }catch(NumberFormatException n){
              JOptionPane.showMessageDialog(null, "Error");
             
          }
      }while(opcion!=7);
      
    }
}

