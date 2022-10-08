import java.util.Scanner;

public class ManavKasaProg {
    public static void main(String[] args) {
        /*
        Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */
        double armutKg = 2.14;
        double elmaKg =3.67;
        double domatesKg = 1.11;
        double muzKg = 0.95;
        double patlıcanKg = 5.00;
        double armutMik, elmaMik,domatesMik,muzMik,patlicanMik;

        Scanner sc = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? ");
        armutMik= sc.nextDouble();

        System.out.println("Elma Kaç Kilo ?   ");
        elmaMik= sc.nextDouble();

        System.out.println("Domates Kaç Kilo ?   ");
        domatesMik= sc.nextDouble();

        System.out.println("Muz Kaç Kilo ?   ");
        muzMik= sc.nextDouble();

        System.out.println("Patlican Kaç Kilo ?   ");
        patlicanMik= sc.nextDouble();

        double toplamTut=((armutMik*armutKg)+(elmaMik*elmaKg)+(domatesMik*domatesKg)
                +(muzMik*muzKg)+(patlicanMik*patlıcanKg));
        System.out.println("Toplam Tutar ? "  +toplamTut);
    }
}
