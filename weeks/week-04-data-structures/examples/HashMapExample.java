import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Ana");
        usuarios.put(2, "Carlos");

        System.out.println(usuarios.get(1));
    }
}