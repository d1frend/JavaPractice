package Labs.Laba_3;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args){
        Order apple = new Order("apple", "Авиамоторная 52", 29);
        Order iPhone = new Order("iPhone 15 pro max", "Авиамоторная 21", 122_990);
        Order fridge = new Order("ATLANT", "Маршала Тухачевского 18", 2000);
        Order ricki = new Order("rick owens geobasket", "LA", 54_900);
        Order bread = new Order("bread", "Супер лента", 54);
        Order sword = new Order("меч", "Детский магазин", 500);

        Hashtable<Integer, Order> orders = new Hashtable<>();
        HashTable<String, Integer> height = new HashTable<>();

        System.out.println(height.isEmpty());
        height.put("Timoha", 195);
        height.put("Maks", 180);
        height.put("Matvei", 150);
        height.put("Danyak", 175);
        height.put("Egor", 193);
        System.out.println(height.size());

        height.put("yarick", 185);
        height.size();
        height.remove("Egor");
        System.out.println(height.size());
        System.out.println(height.get("Matvei"));



        orders.put(1001, apple);
        System.out.println(orders.get(1001).getOrderCost());
        orders.put(1002, iPhone);
        orders.put(1003, fridge);
        orders.put(1004, ricki);
        orders.put(1005, bread);
        orders.put(1001, sword);
        System.out.println(orders.get(1001).getOrderCost());
        orders.remove(1002);
        System.out.println(orders.isEmpty());

        System.out.println(orders.size());
        orders.remove(1005);
        System.out.println(orders.size());
    }


}
