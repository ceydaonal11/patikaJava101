import java.util.Scanner;

public class kdvTutarHesaplama {
    public static void main(String[] args) {
                /*
       KDV Tutarı Hesaplayan Program
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
    tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = sc.nextInt();
        System.out.println("Kdv'siz fiyat: " + sayi);
        if(sayi>0 && sayi<100){
            double kdv = 0.18;
            double oran = sayi*kdv;
            System.out.println("Kdv tutarı: " + oran);
            double tutar = sayi+oran;
            System.out.println("Kdv'li fiyatı: " + tutar);
        }else{
            double kdv = 0.08;
            double oran = sayi*kdv;
            System.out.println("Kdv tutarı: " + oran);
            double tutar = sayi+oran;
            System.out.println("Kdv'li fiyatı: " + tutar);
        }

    }
}
