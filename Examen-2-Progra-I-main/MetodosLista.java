
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

    public void agregarAlFinal(String nombre, int carnet){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setNombre(nombre);
        nuevoNodo.setCarnet(carnet);
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

    public void agregarAlInicio(String nombre, int carnet, int promedio){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setNombre(nombre);
        nuevoNodo.setCarnet(carnet);
        nuevoNodo.setCarnet(promedio);
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

    public void insertarEnPosicion(String nombre,int carnet,int promedio, int posicion){
        if (posicion >= 0 && posicion <= tamano){
            if(posicion == 0){
                agregarAlInicio(nombre, carnet, promedio);

            }else if(posicion == tamano){
                agregarAlFinal(nombre, carnet);
            }else{
                Nodo nuevoNodo = new Nodo();
                nuevoNodo.setNombre(nombre);
                nuevoNodo.setCarnet(carnet);
                nuevoNodo.setCarnet(promedio);
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

    public void imprimirLista(){
        if (!estaVacia()){
            Nodo aux = inicio;
            int posicion = 0;
            while(aux != null){
                System.out.println("Estudiante: " + aux.getNombre()+"   " + aux.getCarnet() + "    Promedio:    " + aux.getPromedio());
                posicion++; 
                aux = aux.getSiguiente();
            }
        }
    }
}
