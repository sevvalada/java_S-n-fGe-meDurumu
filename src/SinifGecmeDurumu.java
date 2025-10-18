/*Dersler : Matematik, Fizik, Türkçe
Geçme Notu : 55
Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/

s
import  java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int mat,fizik,turkce;
        System.out.print("Matematik notunu giriniz:");
        mat=input.nextInt();
        System.out.print("Fizik notunu giriniz:");
        fizik=input.nextInt();
        System.out.print("Turkce notunu giriniz:");
        turkce=input.nextInt();
        double avarage=(mat+fizik+turkce)/3;
        if((mat>100||fizik>100||turkce>100)||(mat<0||fizik<0||turkce<0))
        {
            System.out.println("Lütfen 0-100 arasınde bir not giriniz");
        }
        else{
      if(avarage>55){
          System.out.println("Tebrikler Sınıfı Geçtiniz :)");

      }
      else if(avarage<55){
          System.out.println("Sınıfta Kaldı :(");
      }
        System.out.println("Ortalamanız:"+avarage);
    }
    }
}
