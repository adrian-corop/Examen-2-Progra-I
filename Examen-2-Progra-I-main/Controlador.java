
/**
 * Write a description of class Contorlador here.
 * 
 * @author (Adrian Coronado - C02414) 
 * @version (25/11/2020)
 */
import java.util.Scanner;
public class Controlador
{
    
    public static void menu(){
        Scanner reader = new Scanner(System.in);

        int opcion = 0;
        //Menu
        while(opcion<=1){
            System.out.println("\nMenu");
            System.out.println(
                "Digite la opcion que desea:\n\n");
            System.out.println("Anadir Estudiantes y sus notas: 1\n ");
            System.out.println("Imprimir todos los estudiantes con una nota inferior a X numero: 2\n ");
            System.out.println("Imprimir todos los estudiantes con una nota igual a X numero: 3\n ");
            System.out.println("Imprimir todos los estudiantes con una nota mayor a X numero: 4\n ");
            System.out.println("Imprimir el promedio de todos los estudiantes : 5\n ");
            System.out.println( "Para salir digite 0\n");
            opcion = reader.nextInt();
            /**
             * Switch para ejecutar el programa como decida el usuario 
             */
            switch (opcion){
                case 1:
                anadirEstudiantes();
                
                break;
                case 2:

                break;
                case 3:

                break;
                case 4:

                break;
                case 5:

                break;
                case 0:
                opcion = 10;
                return;
                default:
                System.out.println("Eleccion no disponible, por favor digite otra opcion");
                break;
            }
        }

    }

    public static void anadirEstudiantes(){  
        Scanner reader = new Scanner(System.in);
        Grupo grupo = new Grupo();
        Estudiante estudiante = new Estudiante();
        //Arbol arbol = new Arbol();
        
        String nombre = estudiante.solicitarNombre();
        int carnet= estudiante.solicitarCarnet();
        estudiante.solicitarNotas();         
        int promedio = estudiante.calcularpromedio();
        
        //grupo.insertarPromedios(promedio);
        //arbol.recorrerEnOrden(arbol.getRaiz());
        
        grupo.insertarAlfabeticamente(nombre,carnet, promedio);      
        grupo.imprimirLista();
        
        
        
        int bandera;           
        System.out.println("Desea anadir otro estudiante?   1 = Si  2 = No");
        bandera = reader.nextInt();        
        if(bandera == 1){
            anadirEstudiantes();            
        }else{
            if (bandera == 0){                
                return;
            }else{
                System.out.println("Esa opcion no esta disponible");
                return;
            }
        }
    }
    
}
