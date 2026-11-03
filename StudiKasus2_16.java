import java.util.Scanner;

public class StudiKasus2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama, jenis;
        int jumlahDokumen, peringkat, statusPkm;

        System.out.print("Student name : ");
        nama = sc.nextLine();
        System.out.print("Type of activity (BELMAWA/BAKORMA/MANDIRI/PKM/OTHERS) : ");
        jenis = sc.nextLine().trim().toUpperCase();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            // Condition a: competition
            System.out.print("Total documents : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Champion ranking : ");
            peringkat = sc.nextInt();

            if (jumlahDokumen < 4) {
                System.out.println("Status: Incomplete document (need " + (4 - jumlahDokumen)
                        + " more documents). Award funds were not awarded.");
            } else {
                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status: Eligible to receive award funds (champion " + peringkat
                            + ", documents fulfilled).");
                } else {
                    System.out.println("Status: Not eligible to receive award funds (only for 1/2/3 winners).");
                }
            }
        } else if (jenis.equals("PKM")) {
            // Condition b: PKM
            System.out.print("Total document : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("PKM funding status (1 = passed, 0 = not passed) : ");
            statusPkm = sc.nextInt();

            if (jumlahDokumen < 4) {
                System.out.println("Status: Incomplete document (need " + (4 - jumlahDokumen)
                        + " more documents). Award funds were not awarded.");
            } else {
                if (statusPkm == 1) {
                    System.out.println("Status: Eligible to receive award funds (PKM proposal funded).");
                } else {
                    System.out.println("Status: Not entitled to receive award funds (PKM proposal is not funded).");
                }
            }
        } else {
            System.out.println("Status: Not entitled to receive award funds (type of activity excluding provisions).");
        }

        sc.close();

    }
}
