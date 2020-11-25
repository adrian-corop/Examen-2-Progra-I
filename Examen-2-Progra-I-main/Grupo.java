
/**
 * Write a description of class Grupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grupo
{   
    Estudiante estudiante = new Estudiante();
    MetodosLista metodosLista = new MetodosLista();
    
    public void insertarAlfabeticamente(String nombre){   
        if (metodosLista.estaVacia()){
            metodosLista.agregarAlInicio(nombre);
        }else{
            int posicion = metodosLista.obtenerPosicionAlfabetica(nombre);            
            metodosLista.insertarEnPosicion(nombre , posicion);
        }
    }
    Arbol metodosArbol = new Arbol();
    
    public void insertarPromedios(){
      
      metodosArbol.agregarHijo(estudiante.calcularPromedios());

    }
    
}
