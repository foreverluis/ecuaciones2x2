/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package man;

/**
 *
 * @author Estudiante
 */
public class Matriz {
    
    public double deterSistema(double x1, double y1, double x2, double y2){
        return  (x1 * y2) - (y1 * x2);
    }
    
    public double deterX(double c1, double y1, double c2, double y2){
        return (c1 * y2) -  (y1 * c2);
    }
    
    public double deterY(double x1, double c1, double x2, double c2){
        return  (x1 * c2) - (c1 * x2);
    }
    
    
}
