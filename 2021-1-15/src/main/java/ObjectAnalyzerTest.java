import java.util.ArrayList;
import java.util.List;

public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        List<Integer> squares = new ArrayList<>();
        for(int i = 1;i<=5;i++){
            squares.add(i*i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}

