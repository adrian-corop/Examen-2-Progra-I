
/**
 * Write a description of class Estudiante here.
 * 
 * @author (Adrian Coronado - C02414) 
 * @version (25/11/2020)
 */
public class Estudiante
{

    String nombre;
    int notas[];
    int promedio;
    int carnets[];
    int indice;
    
    
    
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

