/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caballo cHorse = new Caballo();
        cHorse.moviento();
        cHorse.comer();
        
    }
    

}
class Avestruz extends Animal{

    @Override
    public void moviento() {
        System.out.println("Corre a madre!!");
    }

    @Override
    public void comer() {
        System.out.println("Come Popo");
    }

}

class Caballo extends Animal{

    @Override
    public void moviento() {
        System.out.println("Galopar");
    }
    @Override
    public void comer(){
        System.out.println("Comer");
    }
    
}
abstract class Animal{
   abstract public void moviento();//declaracion del cuerpo, si no hay metodo es un metodo abastracto
   abstract public void comer();

}