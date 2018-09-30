package atmm;

import java.util.Scanner;

public class Atmm {

    Scanner input = new Scanner(System.in);

    private int bakiye = 0;
    private int tutar;

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public int yatir() {
        System.out.println("yatırmak istediğiniz tutarı giriniz");
        tutar = input.nextInt();
        bakiye += tutar;
        System.out.println("yeni bakiyeniz : " + bakiye + " lira");
        return bakiye;
    }

    public int cek() {
        System.out.println("çekmek istediğiniz tutarı giriniz");
        tutar = input.nextInt();

        if (bakiye < tutar) {
            System.out.println("bakiyeniz yetersiz");

        } else {
            bakiye -= tutar;
            System.out.println("yeni bakiyeniz : " + bakiye + " lira");
        }
        return bakiye;

    }

    public void bakiye() {
        System.out.println("bakiyeniz : " + bakiye + " lira");
    }

    public void atm() {

        System.out.println("yapmak istediğiniz işlemi seçiniz\n"
                + "1. para çekme\n"
                + "2. para yatırma\n"
                + "3. bakiye öğrenme\n"
                + "çıkmak için q'ya basınız\n");

        while (true) {
            System.out.print("Seçiminiz : ");
            String secim = input.nextLine();
            if (secim.equals("q")) {
                System.out.println("iyi günler");
                break;
            } else if (secim.equals("1")) {
                cek();
                input.nextLine();
            } else if (secim.equals("2")) {
                yatir();
                input.nextLine();
            } else if (secim.equals("3")) {
                bakiye();
                input.nextLine();
            } else {
                System.out.println("hatalı bir giriş yaptınız");
            }

        }
    }
    private String kullanici = "yunus";
    private String sifre = "1907";
    private int hak = 3;

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public void girisKontrol() {

        while (true) {
            System.out.println("kullanıcı adı:");
            String username = input.nextLine();
            System.out.println("şifre:");
            String password = input.nextLine();

            if (username.equals(kullanici) && password.equals(sifre)) {
                System.out.println("giriş başarılı");
                break;
            } else {
                hak--;
                System.out.println("hatalı giriş yaptınız tekrar deneyiniz\n"
                        + "kalan hak sayısı : " + hak);
                if (hak == 0) {
                    System.out.println("sistem bloke oldu");
                    break;
                } else {
                }

            }
        }
    }

}
