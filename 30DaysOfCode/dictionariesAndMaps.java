import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * dictionariesAndMaps
 */
public class dictionariesAndMaps {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone); // Add New Contacts to PhoneBook
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            // Verify whether the contact exists, if yes, print required val
            // otherwise "Not Found"
            if (phoneBook.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }
        in.close();
    }
}