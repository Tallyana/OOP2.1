package Flowers;

import java.util.ArrayList;

public class Buket {
    private final ArrayList<Flowers> buket;
    private static final double floristAllowance = 1.1;

    public Buket() {
        this.buket = new ArrayList<>();
    }

    public void collectBuket(Flowers anyFlowers) {
        buket.add(anyFlowers);
    }

    public void removeFlowerFromBuket(Flowers anyFlowers) {
        if (!buket.contains(anyFlowers))
            System.out.println("Такого цветка пока нет в букете. Но вы можете его добавить");
        else buket.remove(anyFlowers);

    }

    public void getCostForBuket() {
        if (buket.isEmpty()) {
            System.out.println("Вы ещё не собирали букет");
            return;
        }
        double buketCost = 0.0;
        int buketLifeSpan = buket.get(0).getLifeSpan();
        for (Flowers flower : buket) buketCost = buketCost + flower.getCost();
        for (Flowers flower : buket) if (flower.getLifeSpan() < buketLifeSpan) buketLifeSpan = flower.getLifeSpan();
        System.out.println("Цена букета равна " + buketCost * floristAllowance + " рублей");
        System.out.println("Срок стояния букета " + buketLifeSpan + " дней");
    }
}
