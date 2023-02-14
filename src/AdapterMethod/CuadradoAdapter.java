package AdapterMethod;

public class CuadradoAdapter implements Figura{

    private Cuadrado cuadrado;

    public CuadradoAdapter(Cuadrado cuadrado){
        this.cuadrado = cuadrado;
    }
    @Override

    public void dibujar(){
        cuadrado.pintarCuadrado();
    }
}
