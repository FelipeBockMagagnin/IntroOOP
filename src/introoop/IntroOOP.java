/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introoop;
import java.util.Scanner;

public class IntroOOP {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {  
      
    int input;
    double a,l,r,fa,fl,x,y;
      
    Scanner scan = new Scanner(System.in);
    
    
    
    
    
    
    System.out.println("Bem vindo ao Super Paint");
    
    System.out.println("Tamanho da folha: ");
    System.out.println("Altura: ");
    fa = scan.nextDouble();
    System.out.println("Largura: ");
    fl = scan.nextDouble();
      
    Folha folha = new Folha(fa, fl);
    
    
    do{
        System.out.println("****************************************************");
        System.out.println("Escolha a forma que deseja criar");
        System.out.println("0 - Parar o programa e listar formas");
        System.out.println("1 - Retangulo");
        System.out.println("2 - Circulo");
        System.out.println("3 - Triangulo");
    
        input = scan.nextInt();   
    
        switch (input){
            case 0:
                input = 0;
                break;
                
            case 1: 
                System.out.println("Aonde deseja adicionar a forma?");
                System.out.println("x: ");
                x = scan.nextDouble();
                System.out.println("y: ");
                y = scan.nextDouble();
                System.out.println("Escreva a largura");
                l = scan.nextDouble();
                System.out.println("Escreva a altura");
                a = scan.nextDouble();
                
                if((l + x) <= fl && (a + y) <= fa){
                    Retangulo ret = new Retangulo(a,l);
                    folha.adicionarRetangulo(ret);  
                } else {
                    System.out.println("");
                    System.out.println("****************************************************");
                    System.out.println("Error");
                    System.out.println("****************************************************");
                    input = 0;
                }
                break;
                
            case 2:
                
                System.out.println("Aonde deseja adicionar a forma?");
                System.out.println("x: ");
                x = scan.nextDouble();
                System.out.println("y: ");
                y = scan.nextDouble();
                
                System.out.println("Escreva o raio");
                r = scan.nextDouble();
                if((r + y) <= fa && (r + x) <= fl){
                    Circulo cir = new Circulo (r);
                    folha.adicionarCirculo(cir);
                } else {
                    System.out.println("");
                    System.out.println("****************************************************");
                    System.out.println("Error");
                    System.out.println("****************************************************");
                    input = 0;
                }
                break;
                
            case 3:
                System.out.println("Aonde deseja adicionar a forma?");
                System.out.println("x: ");
                x = scan.nextDouble();
                System.out.println("y: ");
                y = scan.nextDouble();
                
                System.out.println("Escreva a largura");
                l = scan.nextDouble();
                System.out.println("Escreva a altura");
                a = scan.nextDouble();
                
                if((l + x) <= fl && (a + y) <= fa){
                    Triangulo tri = new Triangulo(a,l,"a");
                    folha.adicionarTriangulo(tri); 
                } else {
                    System.out.println("");
                    System.out.println("****************************************************");
                    System.out.println("Error");
                    System.out.println("****************************************************");
                    input = 0;
                }
                break;
            }
        if(input!= 0){
        System.out.println("****************************************************");
        System.out.println("Forma adicionada com sucesso");   
        }
        
    } while(input != 0);
    
    
    System.out.println("");
    folha.listarFormas();
    
    folha.listarOrdenado();
    

    
    
    
    
 
    
  }
  

  
}