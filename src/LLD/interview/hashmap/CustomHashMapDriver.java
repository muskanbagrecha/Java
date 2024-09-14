package src.LLD.interview.hashmap;

public class CustomHashMapDriver {
    public static void main(String[] args){
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(1, "Muskan");
        map.put(3, "Rahul");
        map.put(5, "Kriti");
        map.put(7, "Pooja");
        map.put(9, "dfg");
        map.put(11, "Hehe");
        map.put(13, "Haha");
        map.put(15, "Hoho");
        map.put(17, "Huhu");
        map.put(19, "Haha");
        map.put(21, "Hoho");
        map.put(23, "Huhu");
        map.put(25, "Haha");
        map.put(27, "Hoho");
        map.put(29, "Huhu");
        map.put(31, "Haha");
        map.put(33, "Hoho");
        map.put(35, "Huhu");
        map.put(37, "Haha");
        map.put(39, "Hoho");
        map.put(41, "Huhu");

        map.put(1, "dsf");
        String name = map.get(1);
        System.out.println(name);
    }
}
