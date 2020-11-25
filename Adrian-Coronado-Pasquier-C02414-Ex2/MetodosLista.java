
/**
 * Write a description of class MetodosLista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MetodosLista
{
    private Nodo inicio;
    private int tamano;
    int posicion = 0;
    public MetodosLista()
    {
        inicio = null;
        tamano = 0;
    }

    public boolean estaVacia(){
        return inicio == null;
    }

    public int getTamano(){
        return tamano;
    }

    public void agregarAlFinal(String nombre){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setNombre(nombre);
        if(estaVacia()){
            inicio = nuevoNodo;
        }else{
            Nodo aux = inicio;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevoNodo);
        }
        tamano++;
    }

    public void agregarAlInicio(String nombre){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setNombre(nombre);
        if(estaVacia()){
            inicio = nuevoNodo;
        }else{
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
        }
        tamano++;
    }

    public boolean buscarElemento(String referencia){
        Nodo aux = inicio;
        boolean encontrado = false;
        while(aux != null && !encontrado){
            encontrado = (aux.getNombre() == referencia);
            aux = aux.getSiguiente();
        }
        return encontrado;
    }

    public int obtenerPosicionAlfabetica(String nombre){
        Nodo auxiliar = inicio;        
        posicion = 0;

        while(nombre.compareToIgnoreCase(auxiliar.getNombre()) >= 0)
        {
            auxiliar = auxiliar.getSiguiente();
            posicion++;
        }
        
        return posicion+1;
    }

    public int obtenerPosicion(String referencia){
        int posicion = -1;

        if(buscarElemento(referencia))
        {

            Nodo auxiliar = inicio;
            posicion = 0;

            while(referencia != auxiliar.getNombre())
            {
                auxiliar = auxiliar.getSiguiente();
                posicion++;
            }
        }

        return posicion;
    }

    public void insertarDespuesDe(String nombre, String referencia){

        if(!estaVacia()){
            if(buscarElemento(referencia)){
                Nodo nuevoNodo = new Nodo();
                nuevoNodo.setNombre(nombre);
                Nodo aux = inicio;
                while(referencia != aux.getNombre()){

                    aux = aux.getSiguiente();
                }
                Nodo nodoSiguiente = aux.getSiguiente();
                aux.setSiguiente(nuevoNodo);
                nuevoNodo.setSiguiente(nodoSiguiente);
                tamano++;

            }
        }
    }

    public void insertarEnPosicion(String nombre, int posicion){
        if (posicion >= 0 && posicion <= tamano){
            if(posicion == 0){
                agregarAlInicio(nombre);

            }else if(posicion == tamano){
                agregarAlFinal(nombre);
            }else{
                Nodo nuevoNodo = new Nodo();
                nuevoNodo.setNombre(nombre);
                Nodo aux= inicio;
                for(int indice = 0; indice < (posicion-1); indice++){
                    aux = aux.getSiguiente();
                }
                Nodo nodoSiguiente = aux.getSiguiente();
                aux.setSiguiente(nuevoNodo);
                nuevoNodo.setSiguiente(nodoSiguiente);
                tamano++;
            }
        }
    }
}
