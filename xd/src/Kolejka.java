import java.util.ArrayDeque;
import java.util.Queue;

public class Kolejka {
    public static void main(String[] args) {
        System.out.println("------Queue----------------");

        Queue<String> queue = new ArrayDeque<>();
        queue.add("Jeden");
        queue.add("Dwa");
        queue.add("Trzy");
        queue.add("Cztery");
        queue.add("Pięć");
        System.out.println("ilość element           "+ queue.size());
        render(queue);
        queue.poll();
        queue.poll();
        System.out.println("ilość element             "+ queue.size());
        render(queue);


    }

    static void render(Queue<String> queue) {
        for (String q: queue);
        System.out.println(queue);

    }
}
