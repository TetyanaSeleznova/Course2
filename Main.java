package company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void SearchName (ArrayList<zodiac.znac> znac1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите знак зодиака: ");
        String name = sc.nextLine();

        for (int i = 0; i<znac1.size(); i++) {
            if (name.equals(znac1.get(i).name)) {
                znac1.get(i).print_znac();
            } } }
    public static void main (String [] args) {
        ArrayList <zodiac.znac>znac  = new ArrayList<zodiac.znac>();
        znac.add(new zodiac.znac("Aries", "Добрый"));
        znac.add(new zodiac.znac("Taurus", "Веселый"));
        znac.add(new zodiac.znac("Gemini", "Любознательный"));
        znac.add(new zodiac.znac("Cancer", "Умный"));
        znac.add(new zodiac.znac("Leo", "Самовлюбленный"));
        znac.add(new zodiac.znac("Virgo", "Честный"));
        znac.add(new zodiac.znac("Libra", "Робкий"));
        znac.add(new zodiac.znac("Scorpio", "Справедливый"));
        znac.add(new zodiac.znac("Sagitarius", "Очаровательный"));
        znac.add(new zodiac.znac("Capricorn", "Дружелюбный"));
        znac.add(new zodiac.znac("Aquarius", "Доброжелательный"));
        znac.add(new zodiac.znac("Pisces", "Верный"));
        SearchName(znac);
        ArrayList <zodiac.friend>friend1  = new ArrayList<zodiac.friend>();
        friend1.add(new zodiac.friend("Женя", 18, "Sagitarius"));
        friend1.add(new zodiac.friend("Света", 17, "Taurus" ));
        friend1.add(new zodiac.friend("Дина", 19, "Scorpio"));
        SearchFriend(friend1);

    }

    public static void SearchFriend(ArrayList<zodiac.friend> friend1) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name1 = sc1.nextLine();
        for (int i = 0; i<friend1.size(); i++) {
            if (name1.equals(friend1.get(i).name)) {
                friend1.get(i).print_friend();
            }

        }

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Введите знак зодиака чтобы найти друзей: ");
        String d = sc5.nextLine();
        for (int i = 0; i<friend1.size(); i++) {
            if (d.equals(friend1.get(i).znac)) {
                friend1.get(i).print_friend();
            }
            else {
                System.out.println("Друзей с таким наком нет");
            break;
            }
        }
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Если хотите вывести информацию о друзьях, нажмите 1");
        System.out.println("Если хотите завершить работу нажмите 2");
        String a = sc2.nextLine();
        for (int i = 0; i<friend1.size(); i++) {
            if (a.equals("1")) {
                friend1.get(i).print_friend();
            }
            else if (a.equals("2")) {
                System.exit(0);
            }
        }
    }
  }



