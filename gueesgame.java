import java.util.Scanner;
import java.util.Random;
 
public class Main {

  public static void main(String[] args) {

      System.out.println("tamsayi ve 1-100 arasinda bir sayi giriniz");//sayimizi aldik
      Scanner nesne=new Scanner(System.in);

      Random rnd= new Random ();//random fonk çağırdık pc veriyo
      int tahmin=nesne.nextInt();
      int sayi=rnd.nextInt(101);

      while(tahmin!=sayi)
      {
            if(tahmin>sayi)
      {
           System.out.println("daha kucuk sayi giriniz ");
           tahmin=nesne.nextInt();

      }
      else if(tahmin<sayi)
      {
          System.out.println("daha büyük bir sayi giriniz");
           tahmin=nesne.nextInt();

      }

      }
       System.out.println("sayiyi tahmin ettiniz"+sayi);


  }
}