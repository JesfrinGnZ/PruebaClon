/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesfrin
 */
public class suma {
    
    public static void main (String[] args){
        double x=1;
        x+=3;
        float n=3/2;
        double r= Math.pow(9,(1.0/0.));
        
        System.out.println(20%-6    );
        
                
    }
    
    public double raiz(double n){
        double r=1.0;
        double ra=0.0;
         
        while(r!=ra){
            ra=r;
            r=(r+ n/r)/2.0;
        }
        return r;
}
    
}
