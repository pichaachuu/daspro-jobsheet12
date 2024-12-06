import java.util.*;
public class Percobaan3 {
    static double hitungLaba(double saldo, int tahun){
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun-1));
        }
    }

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal : ");
        saldoAwal = input13.nextDouble();
        System.out.print("Lamanya investasi (tahun) : ");
        tahun = input13.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.println(hitungLaba(saldoAwal, tahun));
        input13.close();
    }
}
