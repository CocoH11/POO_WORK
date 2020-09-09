public class Main{
  public static void main(String[] args) {
    int[] numbers={2,1,4,7,9,0,5};
    Tris tris=new Tris();
    //tris.method1(numbers);
    tris.method2(numbers);
    //tris.method3(numbers);
    for (int i=0;i<numbers.length ;i++ ) {
      System.out.println(numbers[i]);
    }
  }
}
