/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocuadernillorubio;

/**
 *
 * @author Admin
 */
public class Ranking implements Comparable<Object>{
    private String nombre;
    private int correctas;
    private int totales;

    public Ranking(String nombre, int correctas, int totales) {
        this.nombre = nombre;
        this.correctas = correctas;
        this.totales = totales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCorrectas() {
        return correctas;
    }

    public int getTotales() {
        return totales;
    }

    @Override
    public String toString() {
        return nombre+" tuvo de nota:"+
                ((float)correctas)*10/((float)totales);
    }

    @Override
    public int compareTo(Object o) {
       
       Ranking r=(Ranking)o;
        System.out.println("Estoy comparando "+nombre+ 
                " con  "+r.getNombre() );
       float puntuacion_objeto=((float)r.getCorrectas()*10)/((float)r.getTotales());
       float puntuacion_otro=((float)correctas*10)/((float)totales);
       if (puntuacion_objeto>puntuacion_otro)
       {
           return 1;
       }
       else
       {
           return -1;
       }
    }
    
    
}
