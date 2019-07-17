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
public class MonoVolumen extends DecoratorCarro {
    
    public MonoVolumen(Carro inner) {
        super(inner);
    }
    
    public void carroceria(){
        super.carroceria();
        doMonoVolumen();
    }
    
    private void doMonoVolumen(){
        System.out.print("Monovolumen");
    }
}
