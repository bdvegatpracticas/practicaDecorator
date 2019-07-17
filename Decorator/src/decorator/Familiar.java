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
public class Familiar extends DecoratorCarro {
    
    public Familiar(Carro inner) {
        super(inner);
    }

    
    public void carroceria(){
        super.carroceria();
        doFamiliar();
    }
    
    private void doFamiliar(){
        System.out.print("familiar");
    }    
}
