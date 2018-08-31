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
public class Somador {
    double area = 0;
    
    void adicionarTriangulo(Triangulo tri){
       this.area = tri.area() + this.area;        
    }
    
    void adicionarRetangulo(Retangulo ret){
        this.area = ret.area() + this.area;
    }
    
    void adicionarCirculo(Circulo cir){
        this.area = cir.area() + this.area;
    }    
}
