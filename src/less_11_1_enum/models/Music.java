package less_11_1_enum.models;

/**
 * TheSusanin
 * 3/14/2021 Mar
 */
public enum Music {
    CLASSIC(5, "classic"), ROCK(3, "rock"), POP(12, "pop"); //является обьектами, которые могу хранить в себе какие-то элементы

    private int i;
    private String name;

    Music(int i, String name) {  // конструктор с параментрами, и переменные обьекта проинициализируем
        this.i = i;
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    public void foo() {
        System.out.println("It's true");
        System.out.println(Music.ROCK.getI() + " " + Music.ROCK.getName());
    }
}
