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
public class Triangulo {
  // atributos
  double altura;
  double largura;
  String cor;
  
  int z = 0;
  
  double x=0,y=0;
  
  double area() {
    return altura*largura/2.0;
  }
  
  void pintar(String novaCor) {
    cor = novaCor;
    System.out.println("pintando o triangulo de " + cor);
  }
  
  // CONSTRUTOR da classe:
  // define o método inicializador da classe, ou seja, o código que vai ser
  // executado ao chamar o new.
  Triangulo(double altura, double largura, String cor) {
    this.altura = altura;
    this.largura = largura;
    this.cor = cor;
  }
  
  double perimetro(){
      return altura + largura + Math.sqrt(Math.pow(altura, 2) + Math.pow(largura,2));
  }
}
