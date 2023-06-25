import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class AlinkedList {

    public static void main(String[] args) {
        System.out.println("---------------------Linked List------------");
        LinkedList<String> list = new LinkedList<>();
        list.add("Zabrze");
        list.add("Augustów");
        list.add("Płock");
        list.add("Warszawa");
        list.add("Pruszków");


        System.out.println(list);

        Collections.sort(list);
        System.out.println("------------ sort ABC---------");
        display(list);
        Collections.reverse(list);
        System.out.println("---------Odwrócona lista-----------");
        display(list);

    }
    public static void display(LinkedList<String> list){
        for (String e: list){
            System.out.println(e);
        }


    }

}
