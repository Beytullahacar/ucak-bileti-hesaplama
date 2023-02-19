package UcakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, normalTutar,indirimliTutar;
        double birimFiyat = 0.10;
        double tipIndirimi = 0.80;
        double cocukIndirim = 0.5;
        double gencIndirim = 0.90;
        double yasliIndirim = 0.70;
        int yas, tip;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen mesafeyi km türünden giriniz : ");
        mesafe = scan.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = scan.nextInt();
        System.out.print("1-Tek yön\n2-Gidiş-Dönüş\nLütfen yolculuk tipini seçiniz : ");
        tip = scan.nextInt();

        normalTutar = mesafe * birimFiyat;

        System.out.println("Normal Fiyat : " + normalTutar);

        if ((mesafe > 0 && yas > 0) && (tip == 1 || tip == 2)) {
            if (yas < 12) {
                switch (tip){
                    case 1:
                        indirimliTutar = normalTutar * cocukIndirim;
                        System.out.println("İndirimli Bilet Fiyatınız : " + indirimliTutar);
                        break;
                    case 2:
                        indirimliTutar = (normalTutar * cocukIndirim * tipIndirimi)*2;
                        System.out.println("İndirimli Bilet Fiyatınız : " + indirimliTutar);
                        break;
                }
            }
            if (yas >= 12 && yas <= 24){
                switch (tip){
                    case 1:
                        indirimliTutar = normalTutar * gencIndirim;
                        System.out.println("İndirimli Bilet Fiyatınız : " + indirimliTutar);
                        break;
                    case 2:
                        indirimliTutar = (normalTutar * gencIndirim * tipIndirimi)*2;
                        System.out.println("İndirimli Bilet Fiyatınız : " + indirimliTutar);
                        break;
                }
            }
            if (yas > 65){
                switch (tip){
                    case 1:
                        indirimliTutar = normalTutar * yasliIndirim;
                        System.out.println("İndirimli Bilet Fiyatınız : " + indirimliTutar);
                        break;
                    case 2:
                        indirimliTutar = (normalTutar * yasliIndirim * tipIndirimi)*2;
                        System.out.println("İndirimli Bilet Fiyatınız : " + indirimliTutar);
                        break;
                }
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
