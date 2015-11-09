import java.util.*;

/**
 * Created by ycao on 9/11/2015.
 */
public class reverseWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String str = scanner.nextLine();
            ArrayList<String> words = new ArrayList<>();
            for (String word : str.split("\n")) {
                words.add(word);
            }
            String newStr = "";
            for (int i = words.size() - 1; i >= 0; i--) {
                newStr = new StringBuilder(words.get(i)).reverse() + " ";
            }
            System.out.println(newStr);
        }
    }
}
