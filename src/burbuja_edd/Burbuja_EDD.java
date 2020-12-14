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
public class Burbuja_EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double [] arreglo = {5, 3, 4, 2, 5.5, 6,9,0.3,0.7,10.3};//se declara el arreglo
            Ordenador_Burbuja ordena = new Ordenador_Burbuja();//se instancia
            ordena.metodo_ordenador(arreglo);//se llama el metodo a ejecutar
            System.out.println("Metodo de ordenamiento interno:");
        System.out.println("           BURBUJA            ");

            for (int i = 0; i < arreglo.length; i++) {
                
                System.out.println(arreglo[i]);//arreglo ya ordenado 
            }
        }
    }
