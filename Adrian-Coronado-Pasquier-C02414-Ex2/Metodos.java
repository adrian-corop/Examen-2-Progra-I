
/**
 * Write a description of class Metodos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Metodos
{
    MetodosLista metodosLista = new MetodosLista();
    public void insertarAlfabeticamente(String nombre){   
        if (metodosLista.estaVacia()){
            metodosLista.agregarAlInicio(nombre);
        }else{
            int posicion = metodosLista.obtenerPosicionAlfabetica(nombre);            
            metodosLista.insertarEnPosicion(nombre , posicion);
        }
    }
}
