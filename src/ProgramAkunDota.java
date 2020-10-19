import java.util.Scanner;

public class ProgramAkunDota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAM PEMBUATAN AKUN DOTA 2 \n");

        System.out.println("Masukkan Email : ");
        String userId = sc.nextLine();
        System.out.println("Masukkan Password : ");
        String passId = sc.nextLine();
        System.out.println("Masukkan Nickname : ");
        String userName = sc.nextLine();
        System.out.println("Masukkan Umur : ");
        int userBalance = sc.nextInt();
        Account akun = new Account(userId, userName, userBalance);

        System.out.println("Pilih : ");
        System.out.println("1. Player Baru ");
        System.out.println("2. Player Lama ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {

            System.out.println("Apakah kamu ingin memulai tutorial ?");
            System.out.println("1. Iya ");
            System.out.println("2. Exit Game ");
            int pilihTransfer = sc.nextInt();

            if (pilihTransfer == 1) {
                System.out.println("Kamu memilih memulai tutorial");
                System.out.println("1. Iya ");
                int pilihrole = sc.nextInt();

                if (pilihrole == 1) {
                    System.out.println("Silakan pilih role kamu");
                    System.out.println("1. Midlaner ");
                    System.out.println("2. Sidelaner ");
                    System.out.println("3. Offlaner ");
                    System.out.println("4. Support ");
                    int role = sc.nextInt();
                    if (role == 1) {
                        System.out.println("Role kamu Midlaner ");
                    }

                    if (role == 2) {
                        System.out.println("Role kamu Sidelaner ");
                    }

                    if (role == 3) {
                        System.out.println("Role kamu Offlaner ");
                    }

                    if (role == 4) {
                        System.out.println("Role kamu Support ");
                    }

                    System.out.println("Selamat kamu sudah menyelesaikan tutorial");
                }

                if (pilihTransfer == 2) {
                    System.out.println("Keluar Game ?");

                }
            }
        }
        if (pilihan == 2) {
            System.out.println("Mulai game ? ");
            int pilihroles = sc.nextInt();
            if (pilihroles == 1) {
                System.out.println("Silakan pilih role kamu");
                System.out.println("1. Midlaner ");
                System.out.println("2. Sidelaner ");
                System.out.println("3. Offlaner ");
                System.out.println("4. Support ");
                int roles = sc.nextInt();
                if (roles == 1) {
                    System.out.println("Role kamu Midlaner game akan segera dimulai ");
                }

                if (roles == 2) {
                    System.out.println("Role kamu Sidelaner game akan segera dimulai ");
                }

                if (roles == 3) {
                    System.out.println("Role kamu Offlaner game akan segera dimulai ");
                }

                if (roles == 4) {
                    System.out.println("Role kamu Support game akan segera dimulai ");
                }

            }
        }
        System.out.println(akun.toString());

    }
}
