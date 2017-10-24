/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fimar
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [] edades = new int[3];
        /*** CASO 1 - Inicialización 1 a 1 **
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30; */
        /* Caso 2 - Inicialización dinámica 
        int j = 10;
        System.out.println("largo de arreglo: "+edades.length);
        
        for (int i = 0; i < edades.length; i++) {
            edades[i]=j;
            j = j+10;
        }
        
        System.out.println("Edad 2° ubicación " + edades[1]);
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Posición: "+(i+1)+" indice: "+i+" valor: "+edades[i]);
        }
        edades[3]=78; 
        */
        
        /*CASO 3  - Inicialización HardCode
        int[] edades = {78,25,16, new Integer("15")};
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Posición: "+(i+1)+" indice: "+i+" valor: "+edades[i]);
        }*/
        Random aleatorio = new Random();
 /*       
        int [][] laMina = new int[2][3];
        laMina[0][0]=aleatorio.nextInt(10);
        laMina[0][1]=aleatorio.nextInt(10);
        laMina[0][2]=aleatorio.nextInt(10);
        
        laMina[1][0]=aleatorio.nextInt(10);
        laMina[1][1]=aleatorio.nextInt(10);
        laMina[1][2]=aleatorio.nextInt(10);
        
        
        System.out.println("ubicacion 2 , 1 :"+laMina[1][0]);
        */
        /* uso de ArrayList con Tipos de Datos Nativos
 
        ArrayList<String> nombres = new ArrayList<>();
        int cont = 255;
        while (cont >= 0) {
            nombres.add(""+Character.toString((char)cont));
            cont--;
        }
        System.out.println("  Limite de Ascii : "+nombres.size());
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Indice : "+i+" Valor: "+nombres.get(i));
            
        }
            */
        
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner lector = new Scanner(System.in);
        int cont =3;
        while(cont >=0){
            System.out.println("Ingrese nombre : ");
            String nombre = lector.next();
            System.out.println("Ingrese edad : ");
            int edad = Integer.parseInt(lector.next());        
            /*System.out.println("Ingrese peso : ");
            double peso = Double.parseDouble(lector.next());
            System.out.println("Ingrese sexo : ");
            char sexo = lector.next();
            System.out.println("Es cadado? : ");
            boolean isMarried = Boolean.parseBoolean(lector.next());
*/
            personas.add(new Persona(nombre, edad));
            cont--;
        }
        for (int i = 0; i < personas.size(); i++) {
            Persona personaConsultada = personas.get(i);
            System.out.println("nombre: "+personaConsultada.getNombre());
            System.out.println("edad: "+personaConsultada.getEdad());
        }
        
    }
    
}
