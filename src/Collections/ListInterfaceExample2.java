package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        //example 1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List 1: " +list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List: " +list2);

        //example 2
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");

        //for loop
        for (int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        //for each
        for(String str:arrayList){
            System.out.print(str + " ");
        }
        System.out.println();

        //linkedList
        LinkedList<String>car=new LinkedList<>();
        car.add("Audi");
        car.add("Opel");
        car.add("Toyota");
        System.out.println(car);

        //last element
        System.out.println(car.get(car.size()-1));
        System.out.println(car.getLast());

        //get first element
        System.out.println(car.get(0));
        System.out.println(car.getFirst());

        //create a new LinkedList object (int)
        //populate the list with values from 1 to 100
        //print all elements in the console

        LinkedList<Integer>linkedList=new LinkedList<>();
        for (int i=1; i<=100; i++){
            linkedList.add(i);

        }
        System.out.println(linkedList);



    }
}
