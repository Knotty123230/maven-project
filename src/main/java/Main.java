import com.google.gson.Gson;
import dto.User;

public class Main {
    public static void main(String[] args) {
        String user = new Gson().newBuilder().setPrettyPrinting()
               .create()
               .toJson(new User("Vitaliy", 20));
        System.out.println(user);
    }
}
