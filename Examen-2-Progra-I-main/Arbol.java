
/**
 * Write a description of class Arbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arbol
{
    Nodo raiz;

    public Arbol()
    {
        raiz = null;
    }
    
    public Nodo getRaiz()
    {
        return raiz;
    }
    
    private Nodo agregarRecursivo(Nodo actual, int promedio)
    {
        if(actual == null)
        {
            return new Nodo(promedio);
        }
        else if( promedio < actual.getPromedio() )
        {
            actual.setHijoIzquierdo(agregarRecursivo(actual.getHijoIzquierdo(), promedio));
        }
        else if( promedio > actual.getPromedio() )
        {
            actual.setHijoDerecho(agregarRecursivo(actual.getHijoDerecho(), promedio));
        }
        else
        {
            return actual;
        }
        
        return actual;
    }
    
    public void agregarHijo(int promedio)
    {
        raiz = agregarRecursivo(raiz, promedio);
    }
    
    public void recorrerEnOrden(Nodo nodoActual)
    {
        if( nodoActual != null)
        {
            recorrerEnOrden(nodoActual.getHijoIzquierdo());
            System.out.print(" " + nodoActual.getPromedio());
            recorrerEnOrden(nodoActual.getHijoDerecho());
        }
    }
    
    public boolean buscarElemento(int promedio)
    {
        return buscarElementoRecursivo(raiz, promedio);
    }
    
    public boolean buscarElementoRecursivo(Nodo actual, int promedio)
    {
        if(actual == null)
        {
            return false;
        }
        else if( promedio == actual.getPromedio() )
        {
            return true;
        }
        
        return promedio < actual.getPromedio() ? buscarElementoRecursivo(actual.getHijoIzquierdo(), promedio) : buscarElementoRecursivo(actual.getHijoDerecho(), promedio);
    }
}
