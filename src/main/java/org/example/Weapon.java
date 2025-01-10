package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    BOW(30, 1.5),    // 30 damage, 1.5 attacks/second
    AXE(70, 0.8);

    private final int damage;       // Damage of the weapon
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }


}
