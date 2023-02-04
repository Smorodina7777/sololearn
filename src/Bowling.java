import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //введите код сюда
    public void getWinner() {
        Integer[] pArr = new Integer[players.size()];
        pArr = players.values().toArray(pArr);

        Arrays.sort(pArr, Collections.reverseOrder());
        int maxP = pArr[0];//что хотим найти
        Collection<String> collection = players.keySet();


        for (String key : collection) {
            int p = players.get(key);
            if (key != null) {
                if (maxP == p) {
                    System.out.println(key);
                }
            }
        }
    }
}
