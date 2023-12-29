import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        // scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);
        // kullanıcıdan değerlerini al
        System.out.print("Matematik notunuzu giriniz:");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuzu giriniz:");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuzu giriniz:");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız:" + sonuc);

        if (sonuc > 60) {
            System.out.println("Tebrikler dersi geçtiniz.");
        }
        else {
            System.out.println("Maalesef sınıfta kaldınız");

        }
    }
}
