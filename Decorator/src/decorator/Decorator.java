/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Estudiante
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro[] array = {new MonoVolumen(new CarroBase()),new MonoVolumen(new Sedan(new Familiar(new CarroBase())))};
        for (Carro i : array){
            i.carroceria();
            System.out.println(" ");
        }
    }
    
}
