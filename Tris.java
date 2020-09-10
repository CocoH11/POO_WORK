public class Tris{

  public Tris(){

  }

  public void method1(double[] numbers){
    for (int i=1;i<numbers.length ;i++ ) {
      double save=numbers[i];
      int j=i;
      while (j>0 && numbers[j-1]>save) {
        numbers[j]=numbers[j-1];
        j=j-1;
      }
      numbers[j]=save;
    }
    return;
  }

  public void method2(double[] numbers){
    for (int i=0;i<numbers.length-1 ;i++ ) {
      int min=i;
      for (int j=i+1;j<numbers.length; j++ ) {
        if (numbers[j]<numbers[min]) {
          min=j;
        }
      }
      if (min!=i) {
        double save=numbers[i];
        numbers[i]=numbers[min];
        numbers[min]=save;
      }
    }
  }

  public void method3(double[] numbers){
    for (int i=numbers.length; i>1; i--) {
      for (int j=0;j<i-1 ;j++ ) {
        if (numbers[j+1]<numbers[j]) {
          double save=numbers[j];
          numbers[j]=numbers[j+1];
          numbers[j+1]=save;
        }
      }
    }
  }
}
