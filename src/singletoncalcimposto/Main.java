/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletoncalcimposto;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author camil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        
        CalcImposto c1 = CalcImposto.getINSTANCE();
        c1.calcImposto(200,12);
                
        System.out.println(c1.calcImposto(200,12));
    }
    
}
