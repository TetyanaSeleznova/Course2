package zodiac;

import company.Main;

public class zodiac {

    public static class znac {
  public String name;
  public String characterictic;
        public znac(String name, String Characterictic) {
            this.name = name;
            this.characterictic = Characterictic;
        }
        public void print_znac() {
            System.out.println( "Name " + name + "Characterictic " + characterictic);
        }}
    public static class friend {
      public   String name;
        public int age;
        public String znac1;
        public friend(String name, int age, String znac1) {
            this.name = name;
            this.age = age;
            this.znac1 = znac1;
        }
        public void print_friend() {
            System.out.println( "Name " + name + "Age:  " + age + "Znac: " + znac1); }

    }
}
