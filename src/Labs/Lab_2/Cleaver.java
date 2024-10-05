package Labs.Lab_2;

public class Cleaver extends Sword{
    private float width;
    private int experience; //опыт работы тесака
    private int kills;

    public Cleaver(float damage, String nameWeapon, int cost) {
        super(damage, nameWeapon, cost);

    }

    public Cleaver() {
        this(1, "Branch", 1);
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public int getKills() {
        return kills;
    }

    public int getExperience() {
        return experience;
    }

    public void youngBoys(int ageBoy){
        if (ageBoy < 18){
            kills++;
        }else {
            System.out.println("Предупреждение");
        }
    }

}
