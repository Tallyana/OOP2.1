

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();

        human1.name = "Максим";
        human2.name = "Аня";
        human3.name = "Катя";
        human4.name = "Артем";

        human1.setBirthday(35);
        human2.setBirthday(-29);
        human3.setBirthday(28);
        human4.setBirthday(27);

        human1.setCityOfResidence("Минск");
        human2.setCityOfResidence(null);
        human3.setCityOfResidence("Калининград");
        human4.setCityOfResidence("Петербург");

        human1.post = "бренд-менеджерa";
        human2.post = "методистa образовательных программ";
        human3.post = "продакт-менеджера";
        human4.post = "директора по развитию бизнеса";


        human1.toSay();
        human2.toSay();
        human3.toSay();
        human4.toSay();
    }

}

