public  abstract class PreparacionHamburguesa {
     void preparacionReceta(){
        cortarTomates();
        cortarCebollas();
        cortarPan();
        asarCarne();
        agregarQueso();
        armarHamburguesa();


    }
     abstract void armarHamburguesa();

     void cortarTomates(){
         System.out.println("Cortando tomates..");
     }
     void cortarCebollas(){
         System.out.println("Cortando cebollas");
     }
     void cortarPan(){
         System.out.println("cortando el pan");
     }
     void asarCarne(){
         System.out.println("asando la carne");
     }
     void agregarQueso(){
         System.out.println("agregando queso..");
     }

}
