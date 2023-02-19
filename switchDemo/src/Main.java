public class Main {
    public static void main(String[] args) {
        char not = 'C';
        switch (not) {
            case 'A':
                System.out.println("Geçti Başarılı");
                break;
            case 'B':
                System.out.println("Geçti Orta Başarılı");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }

    }
}