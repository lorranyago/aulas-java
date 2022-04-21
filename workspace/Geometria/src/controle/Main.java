//INICIO DA CLASSE MAIN

package controle;

public class Main {

   public static void main(String[] args) {
       System.out.println("Hello World!");
       Retangulo r1 = new Retangulo(2, 3);
       System.out.println(r1.calcularArea());
       System.out.println(r1.calcularPerimetro());

   }
}

