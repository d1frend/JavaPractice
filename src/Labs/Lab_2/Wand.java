package Labs.Lab_2;

public class Wand extends Weapon {
    private int manaCost; //нужное кол-во маны
    private int countOfAttack;
    private String spell;

    public Wand(float damage, String nameWeapon, int cost) {
        super(damage, nameWeapon, cost);

    }

    public Wand() {
        this(1, "Branch", 1);
    }

    public void setCountOfAttack(int countOfAttack) {
        this.countOfAttack = countOfAttack;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public int getCountOfAttack() {
        return countOfAttack;
    }

    public String getSpell() {
        return spell;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void deBuff() {
        if (spell.equalsIgnoreCase("freezing")) {
            System.out.println("Цель заморожена");
        } else if (spell.equalsIgnoreCase("fire ball")) {
            System.out.println("Цель горит");
        } else if (spell.equalsIgnoreCase("gust of wind")) {
            System.out.println("Цель контужена");
        } else {
            System.out.println("Такое заклинание не изучено");
        }
    }

    @Override
    public void powerUp() {
        setDamage(getDamage() * 1.52f);
        manaCost *= 2;
    }
}
