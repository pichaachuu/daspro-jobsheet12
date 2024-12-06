import java.util.*;;
public class Percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y==0) {
            System.out.print("x1");
            return(1);
        } else {
            System.out.print(x);
            if (y > 1) {
                System.out.print("x");
            }
            return x * hitungPangkat(x, y-1);
        }
    }

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = input13.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = input13.nextInt();

        System.out.print("Hasil perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
        input13.close();
    }
}
