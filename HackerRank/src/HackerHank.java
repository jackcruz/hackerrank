import java.util.HashSet;
import java.util.Set;

public class HackerHank {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line =sc.nextLine();
        String s = "We promptly judged antique ivory buckles for the prize";
        
        pangram(s);
        
    }

    
    public static void pangram (String input) {
        input = input.toLowerCase().replaceAll(" ", "").trim();
        
        char arr[] = input.toCharArray();
        
        Set<String> alphabet = new HashSet<String>();
        
        for (int i = 0; i < arr.length; i++) {
            alphabet.add(String.valueOf(arr[i]));
        }
        
        if (alphabet.size() == 26) {
            System.out.println("pangram");
        }
        else {
            System.out.println("not pangram");
        }
    }
    
}
