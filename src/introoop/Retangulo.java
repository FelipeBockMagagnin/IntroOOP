
package introoop;

/**
 *
 * @author Felpi
 */
public class Retangulo {
  /* As classes podem conter basicamente:
   * Dados: chamados em POO de atributos, membros, campos, propriedades.
   * Procedimentos/Funções: chamados em POO de métodos.
   */
  
  // atributos
  double altura;
  double largura;
  
  int z = 0;
  
  double x=0,y=0;
  
  // DECLARAÇÃO dos métodos:
  /* descreve a assinatura dos métodos (como os programadores devem usar
   * objetos dessa classe.
   * e DEFINIÇÃO dos métodos:
   * descreve como os métodos são implementados.
   */
  
  
  
  double area() {
    return altura*largura;
  }
  
  double perimetro(){
      return (altura*2) + (largura * 2);
  }
  
  Retangulo(double altura, double largura, double x, double y) {
    this.largura = largura;
    this.altura = altura;
    this.x = x;
    this.y = y;
  }
  
}
