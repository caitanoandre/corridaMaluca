/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CorridaMaluca;

public class App {
    public static void main(String[]args){
  Veiculos fusca = new Veiculos(new Motordefusca ());
  Veiculos Ferrari = new Veiculos (new MotorDeFerrrari());
  Veiculos lamborgini = new Veiculos(new Motordelamborgini());
  
  System.out.println(fusca.acelerar());
    System.out.println(Ferrari.acelerar());
      System.out.println(lamborgini.acelerar());
 }  
}
