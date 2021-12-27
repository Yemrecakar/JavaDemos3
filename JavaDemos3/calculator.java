import Math;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hesap Makinesine Hoşgeldiniz.")
     
 
public class Main {
    
     public static int us_alma(int a,int b)//us alma fonk
   {
       
       int result=(int)Math.pow(a,b);
       return result;
       
   }
    
    
  public static void main(String[] args) {
      
   System.out.println( "yapmak istediğiniz islemi giriniz->");
   System.out.println( " 1.toplam, 2.çıkarma, 3.bölme, 4.çarpma, 5.üs alma");
   Scanner nesne=new Scanner(System.in);
   int islem=nesne.nextInt();//kullanıcıdan yapacagı islemi de aldık
   int toplam=0,carpma=1,cikarma=0,bolme=1;
  
   
   
    
   
    switch(islem)
   {
       case 1://toplama
     System.out.println("sayi adedini giriniz:");
       int sayi_adedi=nesne.nextInt();//sayi adedini kullanıcıdan aldık
      
     for(int i=0;i<sayi_adedi;i++)//sayi adedi kadar kullanıcı dışarıdan sayi girecek ve hesaplaama yapılacak
    {
        System.out.println( (i+1)+" .sayiyi giriniz");
        int sayi=nesne.nextInt();//sayi adedi kadar kullabıcıdan sayi aldık
        toplam=toplam+sayi;//girilen her saiyiy toplama atadı
        
        
    }
    
         System.out.println( "girilen sayilarin toplami "+toplam);
         break;
    
    
          case 2://cıkarma
          System.out.println("gireceğinşz sayi adedini giriniz:");
          sayi_adedi=nesne.nextInt();//sayi adedini kullanıcıdan aldık
          for(int i=0;i<sayi_adedi;i++)//sayi adedi kadar kullanıcı dışarıdan sayi girecek ve hesaplaama yapılacak
    {
          System.out.println( (i+1)+" .sayiyi giriniz");
        
          int sayi=nesne.nextInt();//sayi adedi kadar kullabıcıdan sayi aldık
          cikarma=cikarma-sayi;//girilen her saiyiy toplama atadı
       
    }
          System.out.println( "girilen sayilarin farki "+cikarma);
       
          break;
    
          case 3://bolme
          int x,y;
          System.out.println("iki sayi girniz x ve y");
          x=nesne.nextInt();//sayi adedini kullanıcıdan aldık
          y=nesne.nextInt();
          System.out.println( "girilen sayilarin orani "+x/y);
      
         break;

         case 4://carpma
         System.out.println("gireceğinşz sayi adedini giriniz:");
         sayi_adedi=nesne.nextInt();//sayi adedini kullanıcıdan aldık
         for(int i=0;i<sayi_adedi;i++)//sayi adedi kadar kullanıcı dışarıdan sayi girecek ve hesaplaama yapılacak
    {
        System.out.println( (i+1)+" .sayiyi giriniz");
        int sayi=nesne.nextInt();//sayi adedi kadar kullabıcıdan sayi aldık
        carpma=carpma*sayi;//girilen her saiyiy toplama atadı
    }
        System.out.println( "girilen sayilarin carpimi "+carpma);
        break;
 
       
       
        case 5:
        System.out.println( "iki sayi giriniz a ve b;");
        int a=nesne.nextInt();//sayi adedi kadar kullabıcıdan sayi aldık
        int b=nesne.nextInt();//sayi adedi kadar kullabıcıdan sayi aldık
        System.out.println("sonuc= "+us_alma(a,b)) ;
        break;
       
   }
   
  


  }
}
  }
}