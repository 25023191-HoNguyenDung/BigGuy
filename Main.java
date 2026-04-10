import  java.util.*;
public class Main {
    public static void main(String[] args) {
        String text = "Hello! This is an emxample instead of a page of Word. Hello again!";
        System.out.println("Dong chu ban dau: " + text);
        text = text.toLowerCase();
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace("!", "");
        text = text.replace("?", "");
        text = text.replace("/", "");
        HashMap<String, Integer> count = new HashMap<>();
        String [] words = text.split(" ");
        System.out.println("Dong chu sau khi chuan hoa: " + text);
        for (String w : words) {
            if (!count.containsKey(w)) {
                count.put(w, 1);
            }
            else {
                int oldvalue = count.get(w);
                count.put(w, oldvalue + 1);
            }
        }
        System.out.println("So lan xuat hien cua tung tu: ");
        ArrayList<Integer> values = new ArrayList<>();
        for (String key : count.keySet()) {
            values.add(count.get(key));
            System.out.println(key + ": " + count.get(key));
        }
        values.sort(Integer::compareTo);
        int maxvalue = values.get(values.size() - 1);
        System.out.println("Tu xuat hien nhieu nhat: ");
        for (String key : count.keySet()) {
            if (count.get(key) == maxvalue) {
                System.out.println(key);
            }
        }
        System.out.println("Cac tu xuat hien 1 lan: ");
        for (String key : count.keySet()) {
            if (count.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}