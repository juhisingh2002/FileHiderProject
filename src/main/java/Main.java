import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import views.Welcome;

public class Main {
    public static void main(String[] args) {
        Welcome w =new Welcome();
        do {
            w.welcomeScreen();
        } while (true);
    }
}
