import java.util.HashMap;

public class Telefonkatalog {
    public static void main(String[] args) {
        HashMap<String, String> katalog = new HashMap<>();
    
        katalog.put("Johan", "070-123 45 98");
        katalog.put("Rick", "987-6543");
        katalog.put("Isak", "072-223 95 86");
        katalog.put("Mamma ICE", "073-458 34 23");
    

        String person = "Johan";
        System.out.printf("%ss nummer är %s\n", person, katalog.get(person));
    }
}
