package Labs.Lab_2;

public class Sword extends Weapon{
    private float length;
    private String material;
    private boolean isSharpened; //заточен - 1, не заточен - 0

    public Sword(float damage, String nameWeapon, int cost) {
        super(damage, nameWeapon, cost);

    }

    public Sword() {
        this(1, "Branch", 1);
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setSharpened(boolean sharpening) {
        isSharpened = sharpening;
    }

    public float getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isSharpened() {
        return isSharpened;
    }

    public void fight(float armor){
        if (this.getDamage() >= armor){
            System.out.println("Пробил!!!");
        }else{
            System.out.println("Не пробил, осталось брони: " + (armor-getDamage()));
        }
    }

    @Override
    public void powerUp() {
        setDamage(getDamage() * 1.12f);
    }

}
