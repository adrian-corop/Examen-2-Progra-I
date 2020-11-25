
/**
 * Write a description of class Nodo here.
 * 
 * @author (Adrian Coronado - C02414) 
 * @version (25/1/2020)
 */
public class Nodo
{

    private String nombre;
    private int carnet;
    private int Notas;
    
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
    
    private int promedio;
    Nodo hijoIzquierdo;
    Nodo hijoDerecho;

    public Nodo(int promedio)
    {
        this.promedio = promedio;
        hijoIzquierdo = null;
        hijoDerecho = null;
    }
    
    public int getPromedio()
    {
        return promedio;
    }
    
    public Nodo getHijoIzquierdo()
    {
        return hijoIzquierdo;
    }

    public Nodo getHijoDerecho()
    {
        return hijoDerecho;
    }
    
    public void setPromedio(int promedio)
    {
        this.promedio = promedio;
    }
    
    public void setHijoIzquierdo(Nodo nuevoNodo)
    {
        hijoIzquierdo = nuevoNodo;
    }

    public void setHijoDerecho(Nodo nuevoNodo)
    {
        hijoDerecho = nuevoNodo;
    }
}

