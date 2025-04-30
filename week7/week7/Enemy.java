package week7;

import week2.Character;

public class Enemy extends Character {
    public Enemy(String nama, int hp) {
        // Memanggil konstruktor superclass dengan level 1 dan exp 0
        super(nama, 1, hp, 0); 
    }

    public void attack(Character character) {
        // Damage yang dilakukan musuh
        int damage = 15; 
        System.out.println(this.nama + " menyerang " + character.getNama() + "! Damage: " + damage);
        character.attacked(damage); // Mengurangi HP karakter
    }
}