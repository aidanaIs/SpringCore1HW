package course;

public class Java implements prg_lang {
    private String name;

    @Override
    public void getLanguage() {
        System.out.println("Java Backend Language");
    }

    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                '}';
    }
}
