/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import com.sun.org.apache.xml.internal.utils.DOMOrder;

/**
 *
 * @author Estudiante
 */
public class Coupe extends DecoratorCarro{
    
    public Coupe(Carro inner) {
        super(inner);
    }
    
    public void carroceria(){
        super.carroceria();
        doCoupe();
    }
    
    private void doCoupe(){
        System.out.print("Coupe");
    }    
}
