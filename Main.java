public class Main{
  public static void main(String[] args) {
    Tris tris=new Tris();
    Calcul calcul=new Calcul();

    testCalcul(calcul);
  }

  public static void testTris(Tris tris){
    double[] numbers={2,1,4,7,9,0,5};
    tris.method2(numbers);
    for (int i=0;i<numbers.length ;i++ ) {
      System.out.println(numbers[i]);
    }
  }

  public static void testCalcul(Calcul calcul){
    double[] numbers={15.5, 14, 13.6, 11, 0, 9, 8};
    System.out.println(calcul.moyenne(numbers));
    System.out.println(calcul.ecarttype(numbers));
    System.out.println(calcul.mediane(numbers));
  }
}
