package collections;

import java.util.*;

public class noob {
    public static void main(String[] args) {
//       List<Integer> values = new ArrayList<>();
//       values.add(1);
//       values.add(2);
//       values.add(3);
//       List<Integer> stack = new Stack<>();
//        stack.add(1);
//        stack.add(2);
//        stack.add(3);
//
//       // iterate list using iterator
//       Iterator<Integer> iterator = values.iterator();
//       while(iterator.hasNext()){
//           System.out.println(iterator.next());
//
//       }
//
//       // iterate list using for loop
//       for(int a: values){
//           System.out.println(a);
//       }
//
//
//       /*
//       * LAMBDA EXPRESSION IN JAVA :
//       *
//       *
//       *
//       * */
//
//       // iterate list using for each loop
//       values.forEach(System.out::println);
//
//        /*
//        * STREAM AND PARELLEL STREAM IN JAVA :
//        *
//        *
//        *
//        *
//        * */
//
//
//        // Collections is a utility class, which expose certain methods to do in a collection, like sorting, binary searhc, shuffle, min, max, rotate
//
//        Collections.reverse(values);
//        Collections.max(values);
//
//        // USEFULE METHODS OF COLLECTION
//        values.size();
//        values.isEmpty();
//        values.contains(2);
//        values.remove(2); // remove by index
//        values.remove(Integer.valueOf(3)); // remove by value
//        values.addAll(stack);
//        values.containsAll(stack);
//        values.removeAll(stack);
//        values.clear();
//

        // priority queue
        /*
        * by default its min heap.
        *
        * time complexity for priority queue : O(1)[Add and Offer], O(1)[Peak], O(logn)[Poll and remove head element], O(n)[remove arbitrary element]
        *
        * */
        Queue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(2);
        pq.add(1);
       // pq.forEach((Integer e)->{System.out.print(pq.poll());});
        while(!pq.isEmpty()){
            int val =  pq.poll();
            System.out.print(val);
        }

        /*
        * Comparable and Comparator both provides a way to sort the collection of onjects.
        * 1. Comparator - functional interface
        *  int compare (T obj1, T obj2) -> abstract method
        * sorting algorithm uses this compare method of Comparator to comapre 2 variables, and decide whether to swap the variables or not.
        * Method returns : 1 , 0, -1 (greater, equal, lesser)
        * Mostly in algorithm, if this method return 1, it swap the values.
        * */

         Integer[] arr = {2, 4, 2, 2, 4};
         Arrays.sort(arr, (Integer val1, Integer val2) -> val2.compareTo(val1));

    }
}
