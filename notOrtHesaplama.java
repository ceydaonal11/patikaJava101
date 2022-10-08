import java.util.Scanner;

public class notOrtHesaplama {
    public static void main(String[] args) {
        /*
        Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
        kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
        küçük ise "Sınıfta Kaldı" yazsın. if-else kullanmadan
        */

        Scanner scanner = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Lütfen Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();
        System.out.println("Lütfen Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();
        System.out.println("Lütfen Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        System.out.println("Lütfen Türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();
        System.out.println("Lütfen Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();
        System.out.println("Lütfen Muzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        int ort = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalama: " + ort);
        boolean not = ort >=60;
        System.out.println("Sınıfı geçti mi? : " + not);


    }
}
