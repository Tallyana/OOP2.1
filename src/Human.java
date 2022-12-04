//Задание 1.
public class Human {
    String name;
    private int birthday;

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    private String cityOfResidence;
    String post;
    String noInfo = "-извините,информация не указана. ";

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        if (birthday >= 0) {
            this.birthday = birthday;
        } else {
            this.birthday = Math.abs(birthday);
        }

        }


    public void setCityOfResidence(String cityOfResidence) {
        if (cityOfResidence != null && !cityOfResidence.isEmpty()) {
            this.cityOfResidence = cityOfResidence;
        } else {
            this.cityOfResidence = noInfo;
        }
    }
        public void toSay() {
                System.out.println("Привет.Меня зовут " + name + ".Мне " + getBirthday() + " лет.Я живу в городе " + getCityOfResidence() + ".Я работаю на должности " + post + ". Будем знакомы!");
        }
    }




