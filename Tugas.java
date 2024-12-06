import java.util.*;
public class Tugas {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (n): ");
        int n = input13.nextInt();

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + fungsiIteratif(n,input13));
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + fungsiRekursif(n, input13));
        input13.close();
    }

    static int fungsiIteratif (int angka, Scanner input13){
        int total = 0;
        
        for (int i = angka-1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            int input = input13.nextInt();
            total += input;
        }
        return total;
    }

    static int fungsiRekursif (int angka, Scanner input13){
        
        if (angka <= 0) {
            return (0);
        } else {
            System.out.print("Masukkan angka ke-" + angka + ": ");
            int input = input13.nextInt();
            return input + fungsiRekursif(angka-1, input13);
        }
    }
}
