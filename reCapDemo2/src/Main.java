public class Main {
    public static void main(String[] args) {

        double[] myList = {6.2, 3.3, 4.4, 2.1, 5.5};
        double total = 0;
        double max = myList[0];
        for (double benimListem : myList) {
            if (max < benimListem) {
                max = benimListem;
            }
            total = total + benimListem;
            System.out.println(benimListem);
        }
        System.out.println("Toplam= " + total);
        System.out.println("En büyük= " + max);


    }
}