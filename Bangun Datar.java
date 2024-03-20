class BangunDatar {

    double luas() {
        return 0;
    }

    double luas(double sisi) {
        return sisi * sisi;
    }

    double luas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        // Luas persegi
        System.out.println("Luas persegi dengan sisi 5: " + bangunDatar.luas(5));

        // Luas persegi panjang
        System.out.println("Luas persegi panjang dengan panjang 7 dan lebar 4: " + bangunDatar.luas(7, 4));
    }
}
