package Utilitario;

import java.util.Scanner;

public class Utilitario {
    /**
     * @Recomendacion Modifique el rango de aceptacion
     * @param num Recepta el numero a validar
     * @return El numero Ya validado
     */
    public class mmValidacion {
        public static int mmValidacionNumero(int num) {
            Scanner Input = new Scanner(System.in);

            boolean control = true;
            do {
                try {
                    num = Integer.parseInt(Input.nextLine());
                    while (num < 0 || num > 99) {
                        Utilitario.limpiarPantalla();
                        System.out.print("\rDigite un numero positivo y en el rango que se le solicita: ");
                        num = Integer.parseInt(Input.nextLine());

                    }
                    control = true;
                } catch (NumberFormatException e) {
                    Utilitario.limpiarPantalla();
                    System.out.print("\rDigite un numero, No caracter: ");
                    control = false;
                }
            } while (control == false);
            return num;
        }

        public static boolean mmValidadorCaracter(String sexo) {
            String mmSexo1 = "F", mmSexo2 = "M";
            if (sexo.equals(mmSexo1) || sexo.equals(mmSexo1.toLowerCase()) || sexo.equals(mmSexo2)
                    || sexo.equals(mmSexo2.toLowerCase())) {
                return true;
            } else {
                return false;
            }

        }

        public static char mmVerificadorCaracter(String validadorCaracter) {
            char Caracter = 'o';
            Scanner mmSc = new Scanner(System.in);

            do {
                System.out.print("\nDigite un caracter, M o F: ");
                validadorCaracter = mmSc.nextLine();

            } while (Utilitario.mmValidacion.mmValidadorCaracter(validadorCaracter) == false);
            validadorCaracter = validadorCaracter.toUpperCase();
            if ((Utilitario.mmValidacion.mmValidadorCaracter(validadorCaracter) == true)) {
                Caracter = validadorCaracter.charAt(0);
            }

            return Caracter;
        }

        public static String mmValidadorNick(String mmCadenaaValidar) {

            String[] mmStringValido = new String[mmCadenaaValidar.length()];
            StringBuilder mmStringBuilder = new StringBuilder();
            for (int i = 0; i < mmCadenaaValidar.length(); i++) {
                mmStringValido[i] = String.valueOf(mmCadenaaValidar.charAt(i));
            }
            for (int i = 0; i < mmStringValido.length; i++) {
                if (mmStringValido[i].equals(" ")) {
                    mmStringValido[i] = "";
                }
                mmStringValido[0] = mmStringValido[0].toUpperCase();
            }
            for (String string : mmStringValido) {
                mmStringBuilder.append(string);
            }
            mmCadenaaValidar = mmStringBuilder.toString();

            return mmCadenaaValidar;
        }

    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String mmEnmascararTexto(String texto) {
        int longitud = texto.length();
        StringBuilder enmascarado = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            enmascarado.append('*');
        }

        return enmascarado.toString();
    }

    public class mmConvertirDatosPersonales {
        public static String mmConvertirCorreo(String mmCorreoElectronico) {
            String mmCorreoValidado = mmCorreoElectronico.toLowerCase();
            

            return mmCorreoValidado;
        }
        public static String mmConvertirNombre(String mmNombre){
            String mmNombreValidado = mmNombre.toUpperCase();
            return mmNombreValidado;
        }

    }
    public static String replaceCharacter(String cadena, char caracterAntiguo, char caracterNuevo) {
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            
            if (caracter == caracterAntiguo) {
                builder.append(caracterNuevo);
            } else {
                builder.append(caracter);
            }
        }
        
        return builder.toString();
    }

}
