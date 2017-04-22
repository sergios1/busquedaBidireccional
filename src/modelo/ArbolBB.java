package modelo;

public class ArbolBB {
	private Palabra raiz;
    private ArbolBB izq;
    private ArbolBB der;
    
    public ArbolBB(){
        raiz = null;
        izq = null;
        der = null;
    }
    public boolean vacio(){
        return raiz == null && izq == null && der == null;
    }
    public void insertar(Palabra x){
    	if(vacio()){
            this.raiz = x;
            izq = new ArbolBB();
            der = new ArbolBB();
        }
        else{
            if(x.comparar(this.raiz)){
                izq.insertar(x);
            }
            else{
                der.insertar(x);
            }
        }
    }
    
}
