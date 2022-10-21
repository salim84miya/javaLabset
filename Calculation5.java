//class name Calculation5


class Calci {

    int z;
  
    public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers: " + z);
    }
  
    public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers: " + z);
    }
  
    public void subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference for the given numbers: " + z);
    }
  
    public void division(int x, int y) {
      z = x / y;
      System.out.println("The quotient for the given numbers: " + z);
    }
  }
  
  
  public class Calculation5 extends Calci{
      public static void main(String args[]){
          int a =20;
          int b = 10;
  
          Calci demo = new Calci();
          demo.multiplication(a, b);
          demo.addition(a , b);
          demo.subtraction(a, b);
          demo.division(a, b);
  
      }
  }
  