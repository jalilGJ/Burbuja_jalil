/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja_edd;

/**
 *
 * @author PC7
 */
public class Ordenador_Burbuja {

    public void metodo_ordenador(double[] Arreglo) {//
        double aux;//variable auxiliar para cambiara variables
        boolean cambios = false;//inicia en falsa pero cuando haga canbios pasara a verdadero

        while (true) {//ciclo para repetir el codigo hasta que el erreglo este ordenado
            cambios = false;//
            for (int i = 1; i < Arreglo.length; i++) {//
                if (Arreglo[i] < Arreglo[i - 1]) {//si el arreglo en el indice i es menor al arreglo
                                                  //en una posicion hacia la izquierda
                                                  //esto indica que esta desordenado
                    aux = Arreglo[i];//se guarda en la varible auxiliar de numero i
                    Arreglo[i] = Arreglo[i - 1];//cambiarla por la que se esta comprarndo
                    Arreglo[i - 1] = aux;//el arreglo en la posisicion i-1 es igual al aux, 
                                         //anteriormente fue perdido el valor de aux
                    cambios = true;//
                }//este ciclo continuara hasta que este todo ordenado (i)
            }
            if (cambios == false) {// condicional para que vuelva hacer cambios en caso
                                   //de que no ordeno nada
                break;//fin
            }
        }
    }

}
