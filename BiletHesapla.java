import javax.swing.*;
import java.util.Scanner;

public class BiletHesapla {

    double km = 20;
    double ciftYonIndirim = 0.8;
    double cocuk = 0.50;
    double genc = 0.90;
    double yasli = 0.70;
    double ankaraIstanbul = 400;
    double istanbulAntalya = 600;
    double ankaraVan = 850;
    double izmirAntep = 1200;
    double canakkaleTokat = 1000;
    int yon;
    String sehir;
    String rota;

    Void yonHesapla () {

        String tarife =
        "AnkaraIstanbul\n" +
                "2 Istanbul-Antalya (600) \n" +
                "3 Ankara-Van (850) \n" +
                "4 Izmir_Antep (1200)\n" +
                "5 Çanakkale-Tokat(1000)";

        Scanner scanner = new Scanner(System.in);
        int rota = scanner.nextInt();

        JOptionPane.showMessageDialog(null,"Bilet Fiyatı Hesaplama Programına Hoşgeldiniz\n"+
                "Uçuş Rotası Seçiniz"+
               "1 Ankara-Istanbul \n" +
                        "2 Istanbul-Antalya\n" +
                        "3 Ankara-Van\n" +
                        "4 Izmir_Antep\n" +
                        "5 Çanakkale-Tokat") ;

        while (rota > 1 && rota < 6) {

        }
        rota = Integer.parseInt(JOptionPane.showInputDialog("Doğru Seçim Yapmadınız\n" + "Lütfen 1 ile 5 Arasında Seçiminizi Yapınız"));

        while(true);
        JOptionPane.showInputDialog(rota+ "1 Tekyön 2 Gidiş Dönüş");
        if (rota==1);
       int yas = Integer.parseInt(JOptionPane.showInputDialog("Yolcunun yaşını giriniz"));
        if (yas > 24 && yas < 65) {
            JOptionPane.showMessageDialog(null, "Fiyat:" + tarife + km);
            if (yas >=0 && yas <= 12) {
            JOptionPane.showMessageDialog(null, "Fiyat:" + tarife + cocuk);
            if (yas > 12 && yas <= 24) {
                JOptionPane.showMessageDialog(null, "Fiyat:" + tarife + genc);
                if (yas > 65 && yas <= 100) {
                    JOptionPane.showMessageDialog(null, "Fiyat:"+ tarife + yasli);
                }
                if (rota==2)
                    int yas = Integer.parseInt(JOptionPane.showInputDialog("Yolcunun yaşını giriniz"));
                if (yas > 24 && yas < 65) {
                    JOptionPane.showMessageDialog(null, "Fiyat:" + tarife + km*2);
                    if (yas >=0 && yas <= 12) {
                        JOptionPane.showMessageDialog(null, "Fiyat:" + tarife + cocuk*2);
                        if (yas > 12 && yas <= 24) {
                            JOptionPane.showMessageDialog(null, "Fiyat:" + tarife + genc*2);
                            if (yas > 65 && yas <= 100) {
                                JOptionPane.showMessageDialog(null, "Fiyat:"+ tarife + yasli*2);
                                break;
                            }

                            else JOptionPane.showMessageDialog(null,"Hatalı Giriş Yaptınız. Başa Dönün");
                        }
                    }
                }
            }
            }
        }
    }
}
