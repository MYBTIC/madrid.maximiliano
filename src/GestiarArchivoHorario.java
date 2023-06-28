import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public interface GestiarArchivoHorario {
    public static void mmLeerHorarioMedicos() {
        try {
    File file = new File("202111083-HIDALGO CRUZ PABLO ESTEBAN.csv");
    Scanner scanner = new Scanner(file);

    // Lee el archivo línea por línea
    while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        
        // Divide la línea en columnas utilizando una coma como separador
        String[] columns = line.split(",");
        
        // Accede a los valores de cada columna
        for (String column : columns) {
            System.out.println(column);
        }
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
