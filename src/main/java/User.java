public class User {
    private int age;

    public User() {}

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    private int score;

    public User(int age, String name, int score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }


}
