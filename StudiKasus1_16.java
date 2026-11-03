import java.util.Scanner;

public class StudiKasus1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Enter the cup total  : ");
        jumlahCup = sc.nextInt();
        System.out.print("Enter the payment  : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total price               : Rp " + diskon);
        System.out.println("Total payment             : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Changes:              : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("The money isn't enough. Need Rp " + kurang + " more.");
        }

        sc.close();


    }
}
