/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package man;

/**
 *
 * @author Daniel Llanos
 */
public class Funcion {
    private double a, b, c, x;
    
    public Funcion(){
        a=0;
        b=0;
        c=0;
        x=0;
        
    }
    public double f(double a, double b, double c, double x){
        double y=0;
        
        y=(a/b)*x+(c/b);
        
        return y;
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
