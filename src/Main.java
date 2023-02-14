import AdapterMethod.*;

public class Main {
    public static void main(String[] args) {
//        PreparacionHamburguesa hamburguesaNormal = new HamburguesaNormal();
//        PreparacionHamburguesa hamburguesaEspecial = new HamburguesaEspecial();
//
//        hamburguesaNormal.preparacionReceta();
//        System.out.println("=====================");
//        hamburguesaEspecial.preparacionReceta();

        Figura[] figuras = new Figura[]{
                new CirculoAdapter(new Circulo()),
                new CuadradoAdapter(new Cuadrado()),

        };
        for (Figura figura : figuras){
            figura.dibujar();
        }

    }
}