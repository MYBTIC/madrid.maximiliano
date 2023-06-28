import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;

public class Horario extends HorarioBase implements GestiarArchivoHorario {
    public static void mmMostrarHorario() {
        
    }
    public static void mmLeerHorarioMedicos(String mmRutaArchivo) throws InterruptedException {
         
        try {
    File file = new File("\\src\\202110105-CHUNCHO JIMENEZ ANGEL DAVID.csv");
    Scanner scanner = new Scanner(file);
    

    // Lee el archivo línea por línea
    while (scanner.hasNextLine()) {
        String Linea = scanner.nextLine();
        
        String[] mmColumnas = Linea.split(";");
        for (String column : mmColumnas) {
            System.out.println(column);
        }
        Thread.sleep(50000);
    }
        
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }

}
