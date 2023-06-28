import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public interface GestiarArchivoHorario {
    public static void mmLeerHorarioMedicos(String mmRutaArchivo) {
        try {
    File file = new File("202110105-CHUNCHO JIMENEZ ANGEL DAVID.csv");
    Scanner scanner = new Scanner(file);

    // Lee el archivo línea por línea
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        
        String[] columns = line.split(";");
    }
    
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    

    }

    public static void mmMostrarEspecialidad() {

    }
    public static void mmMostrarMedicos() {
        
        
    }

}
