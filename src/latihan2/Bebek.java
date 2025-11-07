package latihan2;

// Implementasikan class Bebek implements Terbang, Berenang
// Multiple inheritance!
public class Bebek implements Terbang, Berenang {
     private String nama;
     private int kecepatan;
     private int kedalaman;


    // Constructor
     public Bebek(String nama, int kecepatan) {
         this.nama = nama;
         this.kecepatan = kecepatan;
         this.kedalaman = kedalaman;
     }

    // Implementasi SEMUA method dari KEDUA interface
    // Dari interface Terbang:
    // @Override public void lepasLandas()
    @Override
    public void lepasLandas(){
        System.out.println(nama + " sedang lepas landas...");
    }
    // @Override public void terbang()
    @Override
    public void terbang() {
        System.out.println(nama + " terbang di udara dengan kecepatan " + kecepatan + " km/jam");
    }
    // @Override public void mendarat()
    @Override
    public void mendarat() {
        System.out.println(nama + " mendarat dengan mulus");
    }

    // Dari interface Berenang:
    // @Override public void berenang()
    @Override
    public void berenang(){
        System.out.println(nama + "  sedang berenang di permukaan air");
    }
    // @Override public void menyelam()
    public void menyelam(){
        System.out.println(nama + " terbang di udara dengan kecepatan " + kedalaman + " km/jam");
    }
}
