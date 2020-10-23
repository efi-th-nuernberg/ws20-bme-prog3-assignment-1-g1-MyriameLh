
 public class Zahlenfilter{
  public Zahlenfilter(){
  }

  public static void main(String[] args) {
      for (int i = 0; i < 100; i++) {
      int lastdDigit = i % 10;
      int lastDigit = i-1;
      System.out.println(i);
      if (i % 5 == 0) {
        System.out.println("ZAHL ist durch 5 teilbar!");
      } if (lastdDigit == 9) {
        System.out.println("ZAHL endet auf 9!");
      } if ((i + lastDigit) % 3 == 0) {
        System.out.println("ZAHL und VORGÄNGER addiert ergeben ERGEBNIS und ERGEBNIS ist durch 3 teilbar");
      }
    }
  }
 }