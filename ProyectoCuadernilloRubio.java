/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocuadernillorubio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ProyectoCuadernilloRubio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1-Precticar
        //2-Salir
        int opcion=EntradaSalida.mostrarMenu();
        
        while(opcion!=3)
        {
            
            switch (opcion)
            {
                case 1:
                    int n_operaciones=EntradaSalida.preguntarNumeroOperaciones();
            int puntuacion=0;
            for(int contador=0; contador<n_operaciones; contador++)
            {
                
                int x=(int)(Math.random()*10);
                int y=(int)(Math.random()*10);
                int respuesta_usuario=EntradaSalida.mostrarOperacion(x, y);
                if(respuesta_usuario==x*y)
                {
                    puntuacion=puntuacion+1;
                    //puntuacion++;
                    System.out.println("Enhorabuena");
                }
                else
                {
                    System.out.println("Error");
                }
//EntradaSalida.mostrarMultiplicacion(x, y);
            }
            //NombreClase.metodo();->Estático
            //nombre_objeto.metodo();->No estático
            String nombre_usuario=EntradaSalida.pedirNombreUsuario();
            Ranking r=new Ranking(nombre_usuario, puntuacion, n_operaciones);
            AccesoFichero.grabarRanking(r);
            break;
                case 2:
                    //Listar
                    ArrayList<Ranking> lista_ranking=AccesoFichero.obtenerRanking();
                    
                    EntradaSalida.mostrarRanking(lista_ranking);
                    System.out.println("DESPUES DE ORDENAR");
                    Collections.sort(lista_ranking);
                    EntradaSalida.mostrarRanking(lista_ranking);
                    break;
            }
            opcion=EntradaSalida.mostrarMenu();
        }
    }
    
}
