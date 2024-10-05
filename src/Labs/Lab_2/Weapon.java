package Labs.Lab_2;

public abstract class Weapon {
    private float damage;
    private String nameWeapon;
    private int cost;
    private static int count;

    public Weapon(float damage, String nameWeapon, int cost){
        this.damage = damage;
        this.nameWeapon = nameWeapon;
        this.cost = cost;

    }

    public Weapon(){
        this(1, "Branch", 1);
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public int getCost() {
        return cost;
    }

    public float getDamage() {
        return damage;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    private static void counter(){
        count++;
    }

    public static int getCount(){
        return count;
    }

    public abstract void powerUp();

    public int enchantment(){
        return cost *= 2;
    }
}



