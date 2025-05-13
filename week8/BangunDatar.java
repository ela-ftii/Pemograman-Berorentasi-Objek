package week8;

class BangunDatar {
    protected int sisi;
    protected int lebar;
    protected int panjang;
    protected double alas;
    protected double tinggi;
    protected double radius;
    protected String stat;
    protected final double PHI = 3.14;

    // Konstruktor untuk Persegi
    public BangunDatar(int sisi) {
        this.sisi = sisi;
        this.stat = "square";
    }

    // Konstruktor untuk Persegi Panjang
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.stat = "rectangle";
    }

    // Konstruktor untuk Segitiga
    public BangunDatar(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.stat = "triangle";
    }

    // Konstruktor untuk Lingkaran
    public BangunDatar(double radius) {
        this.radius = radius;
        this.stat = "circle";
    }

    // Metode untuk menghitung luas
    public double luas() {
        switch (stat) {
            case "square":
                return sisi * sisi; 
            case "rectangle":
                return panjang * lebar; 
            case "triangle":
                return 0.5 * alas * tinggi; 
            case "circle":
                return PHI * radius * radius; 
            default:
                return 0; 
        }
    }
}
