class Kendaraan {

    void berjalan() {
        System.out.println("Kendaraan berjalan");
    }
}

class Mobil extends Kendaraan {

    @Override
    void berjalan() {
        System.out.println("Mobil melaju di jalan");
    }
}

class Sepeda extends Kendaraan {

    @Override
    void berjalan() {
        System.out.println("Sepeda dikayuh di jalan");
    }
}

public class Main {

    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.berjalan();

        Mobil mobil = new Mobil();
        mobil.berjalan();

        Sepeda sepeda = new Sepeda();
        sepeda.berjalan();
    }
}
