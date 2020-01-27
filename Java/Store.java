import java.util.*;

public class Store extends Cookies {
    private static Class<Integer> integer;

    public Store(String string) {
        super(string, integer, integer);
        // TODO Auto-generated constructor stub
    }

    // public static String[] getStringArray(ArrayList<Cookies> arr) {
    // Object[] objArr = arr.toArray();
    // String[] str = Arrays.copyOf(objArr, objArr.length, String[].class);

    // return str;
    // }

    public static void main(String[] args) {
        ArrayList<Cookies> cookies = new ArrayList<Cookies>();

        Cookies item1 = new Cookies("Girl Scout S'mores", 8, 20);
        Cookies item2 = new Cookies("Lemonades", 9, 12);
        Cookies item3 = new Cookies("Shortbread", 12, 3);
        Cookies item4 = new Cookies("Thin Mints", 6, 10);
        Cookies item5 = new Cookies("Peanut Butter Patties", 15, 30);
        Cookies item6 = new Cookies("Caramel deLites", 15, 30);
        Cookies item7 = new Cookies("Peanut Butter Sandwich", 60, 30);

        cookies.add(item1);
        cookies.add(item2);
        cookies.add(item3);
        cookies.add(item4);
        cookies.add(item5);
        cookies.add(item6);
        cookies.add(item7);

        System.out.println("Good Morning.");
        System.out.println("Would you like to buy any girl scout cookies? ");

        brand = (ListIterator<Cookies>) cookies.listIterator();

        System.out.println("\n Options are: ");

        while (brand.hasNext()) {
            System.out.println(brand.next());
        }
    }
}