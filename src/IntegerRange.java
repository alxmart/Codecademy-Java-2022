class IntegerRange {
  public static void main(String[] args) {
	  
    // the variable a is declared with a value outside the range
    long a = 3147483647L;
    System.out.println(a);

    // the sum of the following expression is outside the appropriate int range
    int b = 2147483645 + 3;
    System.out.println(b);
  }
}