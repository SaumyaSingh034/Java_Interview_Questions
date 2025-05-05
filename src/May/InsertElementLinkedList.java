package May;

import java.util.LinkedList;

public class InsertElementLinkedList {
    public static void main(String[] args){
        LinkedList<String> linkedData = new LinkedList<>();
        linkedData.add("Test1");
        linkedData.add("Test1");
        linkedData.add("Test2");
        linkedData.add("Test3");
        linkedData.add("Test4");
        linkedData.add("Test5");
        System.out.println(linkedData);
       int index=  linkedData.indexOf("Test1");
       linkedData.add(index, "ReplacedTest");
       System.out.println(linkedData);
       linkedData.set(4,"SaumyaLinkedList");
        System.out.println(linkedData);

    }
}
