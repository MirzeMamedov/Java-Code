import java.util.HashMap;
//dictionary.keySet() , dictionary.clear() , dictionary.size() , dictionary.get("book") , dictionary.put("book","kitab")

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("book","kitab");dictionary.put("table","stol");dictionary.put("computer","kopyuter");
        System.out.println(dictionary.get("book"));

        for(String item : dictionary.keySet()) System.out.println("key-" +item + " " + "value-" + dictionary.get(item));

        System.out.println(dictionary.size());
        //dictionary.clear();
        dictionary.remove("table");
        System.out.println(dictionary.size());
    }
}