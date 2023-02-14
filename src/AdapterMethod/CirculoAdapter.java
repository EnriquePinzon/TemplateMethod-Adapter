package AdapterMethod;

public class CirculoAdapter implements Figura{
    private Circulo circulo;

    public CirculoAdapter(Circulo circulo){
        this.circulo = circulo;
    }

    @Override

    public void dibujar(){
        circulo.pintarCirculo();
    }
}
