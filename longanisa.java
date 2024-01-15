import java.util.HashMap;
import java.util.Map;

public class longanisa {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("date", "1699382499488");

        String dateString = map.get("date").toString();
        System.out.println(dateString);
        long millis = Long.parseLong(dateString);
        System.out.println("Milliseconds: " + millis);
    }
}
