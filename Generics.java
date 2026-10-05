import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
public class Generics{
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        
        List<String> names = new ArrayList<>();
        Set<String> uniqueNames = new HashSet<>();
        Queue<String> nameQueue = new LinkedList<>();

        //String name = items.get(0);

        Bag<String> b = new Bag();
        b.addItem("Hello");
        System.out.println(b.getItem());
        Bag<Integer> b2 = new Bag();
        b2.addItem(42);
        System.out.println(b2.getItem());
    }

}