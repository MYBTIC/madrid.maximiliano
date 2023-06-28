import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

import Utilitario.Color;
import Utilitario.Utilitario;

import java.util.ArrayList;
import java.util.HashSet;

public class Horario extends HorarioBase implements GestiarArchivoHorario {
    public static ArrayList<String> columns = new ArrayList<String>();
    public static void mmMostrarHorarios() throws InterruptedException{
        String mmRutaArchivo = "C:\\Users\\LabP344\\Documents\\madrid.maximiliano\\src\\Horarios\\202110105-CHUNCHO JIMENEZ ANGEL DAVID.csv";
        String mmLine;
        String mmLectura = "";
        String mmDelimitador = ";"; // Delimitador del archivo CSV
        int mmI = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(mmRutaArchivo))) {
            while ((mmLine = br.readLine()) != null) {

                if (mmI != 0) {
                    mmLectura = String.join(mmDelimitador, mmLine);
                    mmLectura = Utilitario.replaceCharacter(mmLectura,';',' ');
                    System.out.println(mmLectura);
                }
                mmI++;
                
            }
           
            
        } catch (IOException e) {
            e.printStackTrace();
        }
         System.out.println(columns);
        Thread.sleep(2000);
    }
    public static void mmLeerHorarioMedicos(String mmRutaArchivo) throws InterruptedException {
       File mmDirectorio = new File(mmRutaArchivo);
       

       if (mmDirectorio.exists() && mmDirectorio.isDirectory()) {
           File[] mmLecturaArchivos = mmDirectorio.listFiles();

           for (File mmLecturaNombre : mmLecturaArchivos) {
               if (mmLecturaNombre.isFile() && mmLecturaNombre.getName().endsWith(".csv")) {
                   String mmNombreArchivo = mmLecturaNombre.getName();
                   int mmDelimitadorArchivos = mmNombreArchivo.lastIndexOf('.');
                   if (mmDelimitadorArchivos > 0) {
                       String mmNombresFinal = mmNombreArchivo.substring(0, mmDelimitadorArchivos);
                       System.out.println("- "+mmNombresFinal);
                   }
               }
           }
       } else {
           System.out.println(Color.RED+"No existe su directorio");
       }
        Thread.sleep(2000);
    }


}
