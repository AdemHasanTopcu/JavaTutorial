public class Main {
    public static void main(String[] args) {

        String[][] sehirler= new String[3][2];
        sehirler[0][0]="ANKARA";
        sehirler[0][1]="İSTANBUL";
        sehirler[1][0]="BOLU";
        sehirler[1][1]="ESKİŞEHİR";
        sehirler[2][0]="ERZİNCAN";
        sehirler[2][1]="KIRIKKALE";
        for (int i=0; i<=2; i++){
            System.out.println("******************************");
            for(int j=0;j<=1; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}