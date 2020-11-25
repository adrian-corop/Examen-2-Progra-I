
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
    boolean solicitar;
    public String solicitarNombre(){
        System.out.println("Ingrese el nombre del estudiante por favor");
        nombre = reader.nextLine();
        return nombre;
    }
    public int solicitarCarnet(){
    System.out.println("Ingrese el carnet del estudiante por favor");
        carnet = reader.nextInt();
        return carnet;
    }

    public void solicitarNotas(){        
        System.out.println("Ingrese las notas del estudiante por favor");
        indice = 0;
        int bandera; // Me permite saber si el usuario quiere ingrsar mas notas
        boolean solicitar = true;
        while (solicitar){

            notas= reader.nextInt();
            indice++;
            System.out.println("Desea ingresar mas notas?");
            System.out.println("1 = Si          0 = No");
            bandera = reader.nextInt();
            if(bandera == 1){
                solicitar = true;
            }else{
                if (bandera == 0){
                    solicitar = false;
                }else{
                    System.out.println("Esa opcion no esta disponible");
                    return;
                }
            }
        }
    }

    public int calcularPromedios(){
        if(indice < notas.length){
            promedio = notas[indice];
            indice++;
            calcularPromedios();        
        }
        promedio = promedio/notas.length;
        return promedio;
    }
}

