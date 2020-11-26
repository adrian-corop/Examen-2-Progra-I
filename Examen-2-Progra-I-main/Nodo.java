
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
    private int promedio;
    
    private Nodo siguiente;

    /**
     * Constructor de objetos apara la clase Nodo
     */
    public Nodo()
    {
        carnet = 0;
        promedio = 0;
        nombre = null;
        siguiente = null;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getPromedio(){
        return promedio;
    }
    public void setPromedio(int promedio){
        this.promedio = promedio;
    }
    
    public int getCarnet(){
        return carnet;
    }
    public void setCarnet(int carnet){
        this.carnet = carnet;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    
    /**
    
    Nodo hijoIzquierdo;
    Nodo hijoDerecho;

    public Nodo(int promedio)
    {
        this.promedio = promedio;
        hijoIzquierdo = null;
        hijoDerecho = null;
    }
    
    public Nodo getHijoIzquierdo()
    {
        return hijoIzquierdo;
    }

    public Nodo getHijoDerecho()
    {
        return hijoDerecho;
    }
    
    public void setHijoIzquierdo(Nodo nuevoNodo)
    {
        hijoIzquierdo = nuevoNodo;
    }

    public void setHijoDerecho(Nodo nuevoNodo)
    {
        hijoDerecho = nuevoNodo;
    }
    */
}

