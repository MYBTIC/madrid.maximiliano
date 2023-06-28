import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Pruebas {

public class CSVReaderExample {
    public static void main(String[] args) {
        String csvFile = "//src//202110105-CHUNCHO JIMENEZ ANGEL DAVID.csv";
        String line;
        String csvDelimiter = ","; // Delimitador del archivo CSV
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(csvDelimiter);
                
                // Accede a los valores de cada columna
                for (String column : columns) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

}
