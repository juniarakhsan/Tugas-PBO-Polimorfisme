class Karyawan {

    void tampilkanData() {
        System.out.println("Data Karyawan");
    }

    void tampilkanData(String nama) {
        System.out.println("Nama: " + nama);
    }

    void tampilkanData(String nama, String jabatan) {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
    }

    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();

        // Menampilkan data tanpa parameter
        karyawan.tampilkanData();

        // Menampilkan data dengan parameter nama
        karyawan.tampilkanData("Budi");

        // Menampilkan data dengan parameter nama dan jabatan
        karyawan.tampilkanData("Ani", "Manager");
    }
}
