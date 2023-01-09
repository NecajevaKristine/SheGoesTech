package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {

        //hashSet
        HashSet<String>names=new HashSet<>();
         //add elements
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");
        names.add("Anna");

        //print all elements
        System.out.println(names);

        //remove element
        names.remove("Bob");
        System.out.println(names);

        //get size
        System.out.println(names.size());

        //contains
        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Bob"));

        //iterate
        for (String str:names){
            System.out.println(str);
        }

        /*Iterator<String>i= names.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }*/

        //Example 2
        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("intSet1 : " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);

        System.out.println("intSet2 : " + intSet2);

        //find union
        HashSet<Integer>union = new HashSet<>(intSet1);
        System.out.println("Union before: " + union);
        union.addAll(intSet2);
        System.out.println("Union after: "+ union);

        //find intersection
        HashSet<Integer>interSection = new HashSet<>(intSet1);
        interSection.retainAll(intSet2);
        System.out.println("Intersection: " + interSection);

        //find unique for intSet1
        HashSet<Integer>unique1 = new HashSet<>(intSet1);
        unique1.removeAll(intSet2);
        System.out.println("Unique intSet1 " + unique1);

        //find unique for intSet2
        HashSet<Integer>unique2 = new HashSet<>(intSet2);
        unique2.removeAll(intSet1);
        System.out.println("Unique intSet2 " + unique2);

        //find all differences
        HashSet<Integer>diffAll = new HashSet<>(unique1);
        diffAll.addAll(unique2);
        System.out.println("All differences" + diffAll);

        //linkedHashSet
        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Lithuania");
        linkedHashSet.add("Latvia");
        System.out.println(linkedHashSet);

        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);


    }
}
