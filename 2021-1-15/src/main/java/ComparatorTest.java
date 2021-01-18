import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        String[] str = new String[5];
        str[0] = "abc";
        str[1] = "bcdd";
        str[2] = "ddddddd";
        str[3] = "acccc";
        str[4] = "dsadasda";
        Arrays.sort(str, (first, second) ->
            first.length() - second.length()
        );
        for (String s : str) {
            System.out.println(s);
        }
    }
}

/**
 * 按照长度从小到大排序
 */
//class LengthComparator implements Comparator<String> {
//    public int compare(String first, String second) {
//        return first.length() - second.length();
//    }
//}
