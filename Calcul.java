public class Calcul{
  private Tris tris;

  public Calcul(){
    tris= new Tris();
  }
  public double moyenne(double[] numbers){
    double somme=0;
    for (int i=0;i<numbers.length ;i++ ) {
      somme+=numbers[i];
    }
    return somme/numbers.length;
  }

  public double ecarttype(double[] numbers){
    double moyenne=moyenne(numbers);
    double[] ecartscarre=new double[numbers.length];
    for (int i=0;i<numbers.length ;i++ ) {
      ecartscarre[i]=Math.abs(moyenne-numbers[i])*Math.abs(moyenne-numbers[i]);
    }
    return Math.sqrt(moyenne(ecartscarre));
  }

  public double mediane(double[] numbers){
    tris.method1(numbers);
    if (numbers.length/2%2==1) {
      return numbers[(numbers.length)/2+1];
    }
    return (numbers[numbers.length/2]+numbers[(numbers.length/2)+1])/2;
  }
}
