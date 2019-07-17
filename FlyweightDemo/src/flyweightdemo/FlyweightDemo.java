/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweightdemo;

/**
 *
 * @author Estudiante
 */
public class FlyweightDemo {

    
    public static final int ROWS = 6, COLS = 10;

    public static void main(String[] args) {
        // TODO code application logic here
        Factory theFactory = new Factory(ROWS);
        for (int i=0; i < ROWS; i++) {
            for (int j=0; j < COLS; j++){
                theFactory.getFlyweight(i).report(j);
            }
            System.out.println();
        }
        
    }
}
