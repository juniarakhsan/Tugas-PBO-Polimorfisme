class OperasiMatematika {

    int tambah(int a, int b) {
        return a + b;
    }

    double tambah(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OperasiMatematika operasi = new OperasiMatematika();

        // Penjumlahan bilangan bulat
        System.out.println("Penjumlahan 5 dan 3: " + operasi.tambah(5, 3));

        // Penjumlahan bilangan desimal
        System.out.println("Penjumlahan 2.5 dan 3.14: " + operasi.tambah(2.5, 3.14));
    }
}
