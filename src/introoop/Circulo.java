/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introoop;

/**
 *
 * @author Felpi
 */
public class Circulo {
    double raio;
    
    int z = 0;
    
    double x=0,y=0;
    
    Circulo(double raio){
        this.raio = raio;
    }
    
    double area(){
        return raio * raio * 3.14159265359;
    }
    
    double perimetro(){
        return 2 * raio * 3.14159265359;
    }
    
}
