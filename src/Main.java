import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    class LinkedList1 {
        Object value;
        LinkedList1 next;
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        List<String> list = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        list.add("2345");
        list.add("6789");
        list.add("078");
        System.out.println("list: " + list);

        arrayList.add(100);
        arrayList.add(1);
        System.out.println("arrayList: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("arrayList: " + arrayList);

        Map<String, String> map = new HashMap<>();
        map.put("name", "Nikita");
        map.put("age", "22");
        System.out.println(map);
        System.out.println(map.get("Nikita"));


        Map<Integer, Human> malesMap = new HashMap<>();
        malesMap.put(1, new Human("Victor", 12));
        malesMap.put(2, new Human("Ivan", 17));
        malesMap.put(3, new Human("George", 14));
        System.out.println(malesMap);

        Map<Integer, Human> femalesMap = new HashMap<>();
        femalesMap.put(1, new Human("Victoria", 15));
        femalesMap.put(2, new Human("Vika", 15));
        System.out.println(femalesMap);

        Map<String, Map<Integer, Human>> mapInMap = Map.of(
                "males", malesMap,
                "females", femalesMap
        );

        System.out.println(mapInMap);
    }
}
