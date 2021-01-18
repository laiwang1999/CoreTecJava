import javax.swing.*;
import java.net.URL;

public class ResourceTest {
    public static void main(String[] args) {
        Class cl = ResourceTest.class;
        URL aboutURL= cl.getResource("about.txt");
        ImageIcon icon = new ImageIcon(aboutURL);
    }
}
