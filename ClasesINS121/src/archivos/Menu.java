/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author fimar
 */
public class Menu {
    
    
    public static void main(String[] args) {

        try {
            File archivo = new File("src\\Usuarios\\usuariosBD.txt");
            System.out.println("Esto es un directorio ? :"+ archivo.isDirectory());
            System.out.println("Se puede leer ? :"+ archivo.canRead());
            System.out.println("Se puede escribir? :"+ archivo.canWrite());
            System.out.println("Peso: "+ archivo.length());
            System.out.println("Nombre :"+ archivo.getName());
            System.out.println("ruta :"+ archivo.getPath());
            System.out.println("ruta absoluta: "+ archivo.getAbsolutePath());
            
            FileOutputStream fostm = new FileOutputStream(archivo);
            
            String info ="INFORMACION CARGADA EN TEXTO";
            StringBuffer texto = new StringBuffer();
            texto.append(info);
            texto.append("\r\n Juan Pablo Vasquez");
            texto.append("\r\n Carlisto Puno");
            texto.append("\r\n Nicolais Muñoz");
            texto.append("\r\n Edgardo Harley Cardenas");
            texto.append("\r\n Alexis SANS");
            texto.append("\r\n El niño del pelo raro...PANCHO!");
            
            if (archivo.exists()) {
                
            } else {
                archivo.createNewFile();
            }
            byte[] contenido = texto.toString().getBytes();
            fostm.write(contenido);
            fostm.flush();
            fostm.close();
           

        } catch (IOException ex) {
            System.out.println("Error al manejar archivos: " + ex);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("error arreglos " + ex.getCause() +" "+ex);
        }catch(ArithmeticException ex){
            System.out.println("La división por cero no existe, corrija!!");
        }
    }
    
}
