class Hewan {

    void bersuara() {
        System.out.println("Suara hewan");
    }
}

class Kucing extends Hewan {

    @Override
    void bersuara() {
        System.out.println("Meow!");
    }
}

class Anjing extends Hewan {

    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

public class Main {

    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        hewan.bersuara();

        Kucing kucing = new Kucing();
        kucing.bersuara();

        Anjing anjing = new Anjing();
        anjing.bersuara();
    }
}
