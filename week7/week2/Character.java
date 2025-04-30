package week2;

public class Character 
{
    protected String nama;
    protected int level = 1;
    protected int hp = 100; 
    protected int exp = 0; 
    protected int ramuan = 3; // Menyimpan jumlah ramuan
    protected int attackDamage = 20; // Damage serangan karakter

    // Konstruktor default
    public Character() {
        this.nama = "Ela";
    }

    // Konstruktor dengan parameter
    public Character(String nama, int level, int hp, int exp) {
        this.nama = nama;
        this.level = level;
        this.hp = hp;
        this.exp = exp;
    }

    public void setData(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void attack(Character enemy) {
        System.out.println(this.nama + " menyerang " + enemy.getNama() + "! Damage: " + this.attackDamage);
        enemy.attacked(this.attackDamage); // Mengurangi HP musuh
        expUp(); // Menambah EXP
    }

    public int getHp() {
        return this.hp;
    }

    public void attacked(int damage) {
        this.hp -= damage; // Mengurangi HP karakter berdasarkan damage yang diterima
        if (this.hp <= 0) {
            System.out.println(this.nama + " mati");
        }
    }

    public void defend(int damage) {
        int reducedDamage = damage / 2; // Mengurangi damage yang diterima
        this.hp -= reducedDamage;
        System.out.println(this.nama + " bertahan! Damage yang diterima: " + reducedDamage);
    }

    public void minumRamuan() {
        if (ramuan > 0) { // Menggunakan ramuan
            this.hp += 20; // Menambah HP
            ramuan--; // Mengurangi jumlah ramuan
            System.out.println(this.nama + " meminum ramuan! HP sekarang: " + this.hp + " (sisa ramuan: " + ramuan + ")");
        } else {
            System.out.println("Tidak ada ramuan tersisa!");
        }
    }

    public void levelUp() {
        this.level += 1;
    }

    public void expUp() {
        this.exp += 1;
    }

    public int getLevel() {
        return this.level;
    }

    public int getExp() {
        return this.exp;
    }

    public int getRamuan() {
        return this.ramuan; // Mengembalikan jumlah ramuan yang tersisa
    }
}