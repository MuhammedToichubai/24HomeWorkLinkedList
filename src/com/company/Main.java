package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /**0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
         *  Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын. Башында 0дор жана аягында 1лер.
         */
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
        }
        System.out.println("array: "+ Arrays.toString(array));
        System.out.print("sorted array: ");
        sort(array);     //Overload метод 1.
        System.out.println("_________________________________________________");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(random.nextInt(0, 2));
        }
        System.out.println("arrayList: "+arrayList);
        System.out.print("sorted array list: ");
        sort(arrayList);  //Overload мето 2.
        System.out.println("_________________________________________________");

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++){
            linkedList.push(random.nextInt(0, 2));
        }
        System.out.println("linkedList: "+linkedList);
        System.out.print("sorted linked list: ");
        sort(linkedList);  //Overload мето 3.
        System.out.println("_________________________________________________");

    }





    public static void sort(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
            Collections.sort(list);
        }
        System.out.println(list);

    }

    public static void sort(ArrayList<Integer> array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            list.add(array.get(i));
            Collections.sort(list);
        }
        System.out.println(list);

    }

    public static void sort(LinkedList<Integer> array) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < array.size(); i++) {
            list.push(array.get(i));
            Collections.sort(list);
        }
        System.out.println(list);

    }

}

















