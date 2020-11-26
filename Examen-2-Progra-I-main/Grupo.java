
/**
 * Write a description of class Grupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Grupo
{   
   
    Estudiante estudiante = new Estudiante();
    MetodosLista metodosLista = new MetodosLista();

    public void insertarAlfabeticamente(String nombre, int carnet, int promedio){   
        if (metodosLista.estaVacia()){
            metodosLista.agregarAlInicio(nombre, carnet, promedio);
        }else{
            int posicion = metodosLista.obtenerPosicionAlfabetica(nombre);            
            metodosLista.insertarEnPosicion(nombre , carnet, promedio, posicion);
        }
    }
    /**
    Arbol metodosArbol = new Arbol();

    public void insertarPromedios(int promedio){

        metodosArbol.agregarHijo(promedio);

    }
    */
   
    public void imprimirLista(){
    metodosLista.imprimirLista();
    }
    
}
