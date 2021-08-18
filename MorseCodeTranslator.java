import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeTranslator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<String,String> morse=new HashMap<>(){{put( ".-","A");put( "-...","B");put( "-.-.","C");put( "-..","D");put( ".","E");
            put( "..-.","F");put( "--.","G");put( "....","H");put("..","I");put( ".---","J");put( "-.-","K");put( ".-..","L");
            put( "--","M");put( "-.","N");put( "---","O");put( ".--.","P");put( "--.-","Q");put( ".-.","R");put( "...","S");
            put( "-","T");put( "..-","U");put( "...-","V");put( ".--","W");put( "-..-","X");put( "-.--","Y");put( "--..","Z");}};

        String[]input=scan.nextLine().split("\\s+\\|\\s+");

        Arrays.stream(input).forEach(s -> {
            StringBuilder output = new StringBuilder();
            String[] splitInput = s.split("\\s+");
            Arrays.stream(splitInput).map(morse::get).forEach(output::append);
            System.out.printf("%s ", output);
        });
    }
}