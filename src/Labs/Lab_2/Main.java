package Labs.Lab_2;

public class Main {
    public static void main(String[] args){
        Sword katana = new Sword(52.52f, "Катана", 500);
        katana.setMaterial("Сталь");
        katana.setLength(21);
        System.out.println(katana.getLength());
        katana.powerUp();
        katana.fight(60.52f);
        int cost = katana.getCost();
        System.out.println(cost);

        Cleaver maksim = new Cleaver(18, "Тесак", 1488);
        maksim.setMaterial("Резина");
        maksim.setExperience(52);
        System.out.println(maksim.getMaterial());
        maksim.fight(15.52f);
        maksim.youngBoys(15);


        Bow tarzan = new Bow(52.52f, "ВАЛ", 1000);
        tarzan.setProducer("Дядя Богдан");
        tarzan.setTension(6);
        System.out.println(tarzan.getProducer());
        tarzan.targetDefeat(17);

        Wand ward = new Wand(52.52f, "Вард у фонтана", 250);
        ward.setManaCost(0);
        ward.setSpell("gust of wind");
        System.out.println(ward.getManaCost());
        ward.deBuff();

        katana.enchantment();
        cost = katana.getCost();
        System.out.println(cost);


    }
}
