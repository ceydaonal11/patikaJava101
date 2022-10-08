import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Dairenin yarıçapını giriniz: ");
        int yCap = sc.nextInt();
        System.out.println("Merkez açısının ölçüsünü giriniz: ");
        int a = sc.nextInt();
        double dAlan = (pi*(yCap*yCap)*a)/360;
        System.out.println("Daire diliminin alanı: " + dAlan);
        //double alan = yCap*yCap*pi;
        //System.out.println("Alan: " + alan);
        //double cevre = 2*pi*yCap;
        //System.out.println("Çevre: " + cevre);
    }
}
