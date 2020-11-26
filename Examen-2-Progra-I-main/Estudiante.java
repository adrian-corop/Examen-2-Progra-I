
/**
 * Write a description of class Estudiante here.
 * 
 * @author (Adrian Coronado - C02414) 
 * @version (25/11/2020)
 */
import java.util.Scanner;
public class Estudiante
{
    Scanner reader = new Scanner(System.in);
    String nombre;
    int notas;
    int promedio;
    int carnet;
    int indice;
    public String solicitarNombre(){
        System.out.println("Ingrese el nombre del estudiante por favor");
        nombre = reader.nextLine();
        
        return nombre;
    }

    public int solicitarCarnet(){
        System.out.println("Ingrese el carnet del estudiante por favor");
        carnet = reader.nextInt();
        reader.nextLine();
        return carnet;
    }
    
    public void solicitarNotas(){        
        System.out.println("Ingrese la nota del estudiante por favor");
        
        int bandera; // Me permite saber si el usuario quiere ingrsar mas notas
        notas= reader.nextInt();
        notas = notas + notas;
        indice++;
        System.out.println("Desea ingresar mas notas?");
        System.out.println("1 = Si          0 = No");
        bandera = reader.nextInt();
        
        if(bandera == 1){
            
            solicitarNotas();
        }else{
            if (bandera == 0){
                indice = indice;
                return;
            }else{
                System.out.println("Esa opcion no esta disponible");
                return;
            }
        }

    }    
    
    public int calcularpromedio(){
        promedio = notas/indice;
        return promedio;
    }
    
    
}

