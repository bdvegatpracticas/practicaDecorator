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
public class Sedan extends DecoratorCarro{
    
    public Sedan(Carro inner) {
        super(inner);
    }
    
    public void carroceria(){
        super.carroceria();
        doSedan();
    }
    
    private void doSedan(){
        System.out.print("Sedan");
    }
    
}
