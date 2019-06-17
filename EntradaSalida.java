/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocuadernillorubio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
class EntradaSalida {

    static int mostrarMenu() {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-Practicar");
        System.out.println("2-Listar");
        System.out.println("3-Salir");
        int opcion=sc.nextInt();
        return opcion;
    }

    static int preguntarNumeroOperaciones() {
        Scanner sc=new Scanner(System.in); 
        System.out.println("¿Cuántas operaciones quiere hacer?");
        int n_operaciones=sc.nextInt();
        return n_operaciones;
    }

    static int mostrarOperacion(int x, int y) {
        Scanner sc=new Scanner(System.in);
        System.out.println(x+"x"+y+"=");
        int respuesta=sc.nextInt();
        return respuesta;
    }
    static String pedirNombreUsuario()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el nombre");
        String nombre=sc.nextLine();
        return nombre;
    }

    static void mostrarRanking(ArrayList<Ranking> lista_ranking) {
        for(Ranking x: lista_ranking)
        { System.out.println(x);}
    }
    
}