package Labs.Lab_2;

public class Bow extends Weapon {
    private float tension; //натяжение
    private float weight;
    private String producer;

    public Bow(float damage, String nameWeapon, int cost) {
        super(damage, nameWeapon, cost);

    }

    public Bow() {
        this(1, "Branch", 1);
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setTension(float tension) {
        this.tension = tension;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getWeight() {
        return weight;
    }

    public float getTension() {
        return tension;
    }

    public String getProducer() {
        return producer;
    }

    public void targetDefeat(float distance) {
        if (tension * 3 >= distance) {
            System.out.println("Цель поражена");
        } else {
            System.out.println("Промах");
        }
    }

    @Override
    public void powerUp() {
        setDamage(getDamage() * 1.32f);
    }
}

