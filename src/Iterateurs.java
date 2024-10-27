import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Iterateurs {


    public static void main(String[] args) {
        ArrayList<String> noms = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        noms.add("Orange");
        noms.add("Pomme");
        noms.add("Cerise");
        noms.add("Raisin");
        noms.add("Fraise");
        noms.add("Pamplemousse");
        noms.add("Pastèque");

        Iterator<String> it = noms.iterator();
        String f = sc.nextLine();
        boolean trouve = false;


        while (it.hasNext()) {
            String n = it.next();
            if (n.equals(f)) {
                System.out.println("Fruit: " + f + " trouvé");
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Fruit: " + f + " introuvable");

        }
    }
}

