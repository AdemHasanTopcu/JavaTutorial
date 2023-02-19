public class Main {
    public static void main(String[] args) {
        /*  String ogrenci1 = "Hasan";
            String ogrenci2 = "Selin";
            String ogrenci3 = "Adem";
            System.out.println(ogrenci1);
            System.out.println(ogrenci2);
            System.out.println(ogrenci3);
       */

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Hasan";
        ogrenciler[1]="Selin";
        ogrenciler[2]="Adem";
        ogrenciler[3]="Topcu";
        for (int i=0; i< ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("*******************************");

        for (String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }

    }
}