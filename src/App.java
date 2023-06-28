import java.io.Console;
import java.util.Scanner;

import Utilitario.Color;
import Utilitario.Utilitario;

public class App {
    public  String mmHorarioRutaDirectori;
    private static final String mmCedula = "1750352450";
    private static final String mmNombreCompleto = "Maximiliano Madrid Benavides";
    public static final String mmCorreoElectronico = "maximiliano.madrid@epn.edu.ec";
    public static final String mmProfe = "profe";
     private static final String mmClaveProfe = "1234";
     private static final String mmTemaAsignado = "Medicos";

    public static int mmContador = 0; 
    public static byte mmVariableValidadorUsuario = 0;

    public static void main(String[] args) throws Exception {
        System.out.println(Color.GREEN+"Cedula: "+mmCedula);
        System.out.println("CORREO: "+Utilitario.mmConvertirDatosPersonales.mmConvertirCorreo(mmCorreoElectronico));
        System.out.println("NOMBRE: "+Utilitario.mmConvertirDatosPersonales.mmConvertirNombre(mmNombreCompleto)+Color.RESET);
        Thread.sleep(2000);
        if (mmLoginMaximiliano() == true && mmVariableValidadorUsuario == 0) {
            Menu.mmElegirOpcion(mmCorreoElectronico);
        } else if (mmVariableValidadorUsuario == 1) {
           Menu.mmElegirOpcion(mmProfe);
        }
    }
     public static boolean mmLoginMaximiliano() throws InterruptedException {
        Utilitario.limpiarPantalla();
        String mmValidacionUsuario;
        char[] contrasena;
        do {
            mmContador++;
            Utilitario.limpiarPantalla();
            Scanner mmIngreso1 = new Scanner(System.in);
            Console consola = System.console();
            System.out.println("--------------------------------------------------------");
            System.out.println("\t\t\tLOGIN");
            System.out.println("--------------------------------------------------------");
            System.out.println("\n\n\t\t......................");
            System.out.print("\n\t\t + Usuario: ");
            mmValidacionUsuario = mmIngreso1.nextLine();
            contrasena = consola.readPassword("\n\t\t + Clave: ");
            String contrasenaEnmascarada = Utilitario.mmEnmascararTexto(new String(contrasena));
            System.out.print("\n\t\t + Clave: " + contrasenaEnmascarada);
            System.out.println("\n\n\t\t......................");
            System.out.println("\t\t* Nro de intentos: " + mmContador);
            Thread.sleep(1200);

            if (mmValidacionUsuario.equals(mmCorreoElectronico)) {
                mmVariableValidadorUsuario = 0;
                if ((new String(contrasena)).equals(mmCedula)) {
                    mmMostrarBienvenida(mmVariableValidadorUsuario);
                    return true;
                }
            } else if (mmValidacionUsuario.equals(mmProfe)) {
                mmVariableValidadorUsuario = 1;
                if ((new String(contrasena)).equals(mmClaveProfe)) {
                    mmMostrarBienvenida(mmVariableValidadorUsuario);
                    return true;
                }
            }
        } while (mmContador < 3);
        Utilitario.limpiarPantalla();
        System.out.println(Color.RED+ "\n\n\n\t\t\tLo sentimos usuario y clave son incorrectos...!!\n\n\n"
                + Color.RESET);
        return false;

    }
    public static void mmMostrarBienvenida(Byte mmValidacion) throws InterruptedException {
        Utilitario.limpiarPantalla();
        if (mmValidacion == 0) {
            System.out.println("\n\n\t\t::Bienvenido " + mmCorreoElectronico.toUpperCase());
            Thread.sleep(1200);
        } else {
            System.out.println("\n\n\t\t::Bienvenido " + mmProfe.toUpperCase());
            Thread.sleep(1200);
        }
    }
    
    public class Menu{

        public static int mmMostrarMenuCargaHorario(String mmUsuarioLogeado) throws InterruptedException{
        Utilitario.limpiarPantalla();
        int mmOpcion = 0;
         System.out.println("--------------------------------------------------------");
            System.out.println("\t\tCarga horaria de <<"+mmTemaAsignado+">>");
            System.out.println("--------------------------------------------------------");
            System.out.println("\n\n\t\t......................");
            System.out.print("\n\t\t + Usuario: "+mmUsuarioLogeado.toUpperCase());

            System.out.println("\n\n\t\t1. Viualizar Alumnos");
            System.out.println("\n\t\t2. Viualizar Especialidades");
            System.out.println("\n\t\t3. Viualizar horarios");
            System.out.println("\n\t\t4. Viualizar Horario de una asignatura");
            System.out.println("\n\t\t0. salir");
            System.out.print("\n\n\t\t  < + > Digite su opcion: ");
            mmOpcion = Utilitario.mmValidacion.ValidacionNumero(mmOpcion);
            Thread.sleep(1200);
            return mmOpcion;
    }

        public static void mmElegirOpcion(String mmUsuarioLogeado) throws InterruptedException{
            do {
                switch (mmMostrarMenuCargaHorario(mmUsuarioLogeado)) {
                    case 0:
                        
                        return;
                        case 1:
                        
                        break;
                        case 2:
                        
                        break;
                        case 3:
                        Horario.mmMostrarHorario();
                        break;
                        case 4:
                        
                        break;
                    default:
                        break;
                }
            } while (true);


        }


    }
    


}