/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocuadernillorubio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AccesoFichero {
static String separador=",";
static String ruta_fichero="D:\\NOTAS_CUADERNILLO.csv";
    static void grabarRanking(Ranking r) {
        String texto=r.getNombre()+separador+r.getCorrectas()+separador
                +r.getTotales()+"\n";
        try{
        FileWriter fr=new FileWriter(ruta_fichero, true);
        fr.write(texto);
        fr.close();
        }
        catch(IOException e)
        {
            
        }
        
    }

    static ArrayList<Ranking> obtenerRanking()  {
        ArrayList<Ranking> lista_ranking=new ArrayList<>();
               
        try {
        FileReader fr=new FileReader(ruta_fichero);
        BufferedReader br=new BufferedReader(fr);
        String linea=br.readLine();
        while(linea!=null)
        {
            String[] datos=linea.split(separador);
            String nombre=datos[0];
            String aciertos_str=datos[1];
            String totales_str=datos[2];
            Ranking r=new Ranking(nombre, Integer.parseInt(aciertos_str),
                    Integer.parseInt(totales_str) );
            lista_ranking.add(r);
            linea=br.readLine();
        }
    } catch (Exception ex) {
        Logger.getLogger(AccesoFichero.class.getName()).log(Level.SEVERE, null, ex);
    }
        return lista_ranking;
    }
    
}
