public class Calculator{

  /* this is a basic calculator that will add/subtract/multiply/divide/mod simple int numbers in Java. works for doubles too! */

  public Calculator(){ //the constructor 

  } 

  public int add(int a, int b){ // add() method
    int total = a + b;
    return total;

  } 

  public double add(double a, double b){ // add() method
    double total = a + b;
    return total;

  } 

  public int subtract(int a, int b){ // subtract() method
    int total = a - b;
    return total;
  }

  public double subtract(double a, double b){ // subtract() method
    double total = a - b;
    return total;
  }

  public int multiply(int a, int b){ // multiply() method
    int total = a * b;
    return total;
  }

  public double multiply(double a, double b){ // multiply() method
    double total = a * b;
    return total;
  }

  public double divide(double a, double b){ // divide() method
    double total = a / b;
    return total;
  }

  public int divide(int a, int b){ // divide() method
    int total = a / b;
    return total;
  }

  public int modulo(int a, int b){ // modulo() method
    int total = a % b;
    return total;
  }

  public double modulo(double a, double b){ // modulo() method
    double total = a % b;
    return total;
  }
  

  // main method
  public static void main(String[] args){
    // create a Calculator object called myCalculator.
    // create an instance of our Calculator...
    Calculator myCalculator = new Calculator();
    // whenever we use the keyword new, we are calling our constructor.

    // calling the add() method on myCalculator...
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(4.4, 2.2));
    System.out.println(myCalculator.multiply(1.5, 11));
  }

}
