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
public abstract class DecoratorCarro implements Carro {
    private Carro core;
    public DecoratorCarro(Carro inner){
        core = inner;
    }
    
    public void carroceria (){
        core.carroceria();
    }                   
}
