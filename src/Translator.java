import java.util.HashMap;

public class Translator {
    HashMap<Integer,String> numericalAlpha = new HashMap<>();

    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < alphabetic.length; i++) {
            numericalAlpha.put(numeric[i],alphabetic[i]);
        }
        System.out.println(numericalAlpha);
    }
    public String translate(Integer number){
        return numericalAlpha.get(number);

    }
}
