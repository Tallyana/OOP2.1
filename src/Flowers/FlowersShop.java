package Flowers;

public class FlowersShop {

    public static void main(String[] args) {
        Flowers roseFlower = new Flowers("Роза обыкновенная", "Голландия", 35.59);
        Flowers chrysanthemumFlower = new Flowers("Хризантема", 15.0, 1);
        Flowers peonyFlower = new Flowers("Пион", "Англия", 69.9, 3);
        Flowers gypsophilaFlower = new Flowers("Гипсофила", "Турция", 19.5, 10);

            Buket buket = new Buket();


            buket.collectBuket(gypsophilaFlower);
            buket.collectBuket(peonyFlower);
            buket.removeFlowerFromBuket(gypsophilaFlower);
            buket.removeFlowerFromBuket(gypsophilaFlower);
            buket.getCostForBuket();
        }
    }
