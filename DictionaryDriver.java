package homework;
import java.util.ArrayList;
import java.util.HashMap;
public class DictionaryDriver {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Terms>> hash = Terms.createHash();
        Dictionary.processSearch(hash);
    }
}
