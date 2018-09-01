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
public class Comparador {
  
  //se ret maior retorna true
  boolean maiorAreaRetTri(Retangulo ret, Triangulo tri) {
      return ret.area() > tri.area();
  }
  
  //se tri maior retorna true
  boolean maiorAreaTriCir (Triangulo tri, Circulo cir){
      return tri.area() > cir.area();
  } 
  
  //se ret maior retorna true
  boolean maiorAreaRetCir (Retangulo ret, Circulo cir){
      return ret.area() > cir.area();
  } 
  
  //se ret maior retorna true
  boolean maiorPerimetroRetCir (Retangulo ret, Circulo cir){
      return ret.perimetro() > cir.perimetro();
  } 
  
  //se tri maior retorna true
  boolean maiorPerimetroTriCir (Triangulo tri, Circulo cir){
      return tri.perimetro() > cir.perimetro();
  } 
  
  //se ret maior retorna true
  boolean maiorPerimetroRetTri (Retangulo ret, Triangulo tri){
      return ret.perimetro() > tri.perimetro();
  } 
}

