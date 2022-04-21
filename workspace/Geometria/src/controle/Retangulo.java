package controle;
public class Retangulo {
   private Integer base;
   private Integer altura;

   public Retangulo(Integer base, Integer altura){
       this.base = base;
       this.altura = altura;
   }

   public Integer calcularArea(){
       return base * altura;
   }

   public Integer calcularPerimetro(){
       return (base + altura) * 2;
   }

   public Integer getBase() {
       return base;
   }

   public void setBase(Integer base) {
       this.base = base;
   }

   public Integer getAltura() {
       return altura;
   }

   public void setAltura(Integer altura) {
       this.altura = altura;
   }


}
