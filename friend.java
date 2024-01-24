package zodiac;
public class friend {
    public String name;
    public int age;
    public String znac;

    public friend(String name, int age, String znac) {
        this.name = name;
        this.age = age;
        this.znac = znac;
    }

    public void print_friend() {
        System.out.println("Name " + name + "\nAge:  " + age + "\nZnac: " + znac);
    }

}
