
/**
 * Write a description of class Nodo here.
 * 
 * @author (Adrian Coronado - C02414) 
 * @version (25/1/2020)
 */
public class Nodo
{

    private String nombre;
    private Nodo siguiente;

    /**
     * Constructor de objetos apara la clase Nodo
     */
    public Nodo()
    {
        nombre = null;
        siguiente = null;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
}

