package TDAconjunto.ejercicio2;

public class ConjuntoArreglo<E> implements Conjunto<E> {
    private E[] arreglo;
    private int cant;

@SuppressWarnings("unchecked")
public ConjuntoArreglo(int max){
    arreglo=(E[])new Object[max];
    cant=0;
}
public int size(){
   return cant;
}
public int capacity(){
  return arreglo.length;
}
public boolean isEmpty(){
    return cant==0;
}
public E get(int i){
return arreglo[i];
}
public void put(E elem) {
    for(int i=0;i<arreglo.length;i++){
        if(arreglo[i]==null && !this.pertenece(elem))
            arreglo[i]=elem;
    }
}public boolean pertenece(E elem){
    boolean esta=false;
    for(int i=0;i<cant && !esta; i++){
        if(arreglo[i].equals(elem))
            esta=true;
    }
 return esta;
}
public Conjunto<E> interseccion(Conjunto<E> c){
    ConjuntoArreglo<E> nueva=new ConjuntoArreglo<E>(cant);
    for(int i=0;i<cant; i++){
        if(c.pertenece(arreglo[i]))
            nueva.put(arreglo[i]);
    }
 return nueva;
}
}
