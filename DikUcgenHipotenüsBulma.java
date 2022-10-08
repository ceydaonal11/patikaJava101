import java.util.Scanner;

public class DikUcgenHipotenüsBulma {
    public static void main(String[] args) {
        /*
        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */
        //Üçgenin hipotenüsü
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Lütfen Üçgenin birinci kenar uzunluğunu giriniz: ");
        int a = sc.nextInt();
        System.out.println("Lütfen Üçgenin ikinci kenar uzunluğunu giriniz: ");
        int b = sc.nextInt();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs :" + c); */

        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz..");
        System.out.println("Birinci kenar: ");
        int k1 = sc.nextInt();
        System.out.println("İkinci kenar: ");
        int k2 = sc.nextInt();
        System.out.println("Üçüncü kenar: ");
        int k3 = sc.nextInt();
        double u = (k1+k2+k3)/2;
        double cevre = 2*u;
        double alan= Math.sqrt(u *(u-k1)*(u-k2) *(u-k3));
        System.out.println("Alan: " + alan);

    }
}
