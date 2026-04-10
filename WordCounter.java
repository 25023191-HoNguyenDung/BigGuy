import java.util.*;
public class WordCounter {
    String text = "Hello world. This is a java program. Hello java, hello world.";
    HashMap<String, Integer> countMap = new HashMap<>();
    ArrayList<String> wordlist = new ArrayList<>(); 
    public void analyze(String text) {
        text = text.toLowerCase();
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace("!", "");
        text = text.replace("?", "");
        text = text.replace("/", "");
        String[] words = text.split(" ");
        for (String w : words) {
            if (w != null) {
                wordlist.add(w);
            }
        }
    }
    public void resultArray() {
        System.out.println("Ket qua ArrayList");
        String maxword = null;
        int maxcount = 0;
        ArrayList<String> resultList = new ArrayList<>();
        for (String r : wordlist) {
            if(!resultList.contains(r)) {
                int count = 0;
                for (String w : wordlist) {
                    if (w.equals(r)) {
                        count++;
                    }
                }
                System.out.println(r + ": " + count);
                resultList.add(r);
                if (count > maxcount) {
                    maxcount = count;
                    maxword = r;
                }
                if (count == 1) {
                    int unique = count;
                }
            }
        }
        System.out.println("Cac tu xuat hien nhieu nhat: " + maxword);
        System.out.println("Cac tu xuat hien 1 lan: ");
        for (String r : resultList) {
            int count = 0;
            for (String w : wordlist) {
                if(w.equals(r)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(r);
            }
        }
    }
    public void resultHashMap() {
        for (String w : wordlist) {
            if (!countMap.containsKey(w)) {
                countMap.put(w, 1);
            }
            else {
                int oldvalue = countMap.get(w);
                countMap.put(w, oldvalue + 1);
            }
        }
        System.out.println("So lan xuat hien cua tung tu: ");
        ArrayList<Integer> values = new ArrayList<>();
        for (String key : countMap.keySet()) {
            values.add(countMap.get(key));
            System.out.println(key + ": " + countMap.get(key));
        }
        values.sort(Integer::compareTo);
        int maxvalue = values.get(values.size() - 1);
        System.out.println("Tu xuat hien nhieu nhat: ");
        for (String key : countMap.keySet()) {
            if (countMap.get(key) == maxvalue) {
                System.out.println(key);
            }
        }
        System.out.println("Cac tu xuat hien 1 lan: ");
        for (String key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        wc.analyze(wc.text);
        wc.resultArray();
        wc.resultHashMap();
    }
}
