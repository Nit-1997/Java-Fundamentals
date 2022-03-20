package StackAndQueues;

import javax.print.attribute.EnumSyntax;
import java.util.*;

public class StacksAndQueues {
    public static void main(String[] args) {
        //stack interface
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack.peek());

        //queue use offer poll and peek to avoid exceptions
        Queue<Integer> q = new LinkedList<>();
        q.offer(12);
        q.offer(13);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

        //Priority queue
        // if we do not provide the comparator then it is min heap if passed then max heap
        Queue<Integer> pq  = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(2);
        pq.offer(13232);
        pq.offer(10);
        pq.offer(1);
        System.out.println(pq);

        //Deque can add elements from front back
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(1);
        adq.offerFirst(12);
        adq.offerLast(2);

        System.out.println(adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        adq.pollFirst();
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);

        //HashSet duplicates are not allowed , order is not maintained all operations are o(1)
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(12);
        set.add(33);
        set.add(4);
        set.add(5);
        set.add(5);//will not add
        System.out.println(set);
        set.remove(4);
        System.out.println(set);
        System.out.println(set.contains(4));

        Set<Integer> linkedset = new LinkedHashSet<>();
        linkedset.add(1);
        linkedset.add(12);
        linkedset.add(33);
        linkedset.add(4);
        linkedset.add(5);
        linkedset.add(5);//will not add
        System.out.println(linkedset);
        linkedset.remove(4);
        System.out.println(linkedset);
        System.out.println(linkedset.contains(4));


        //TreeSet sorted set uses BT internally , all operations are o(log n)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        for(int i : treeSet){
            System.out.println(i);
        }


        //MAP TreeMap and HashMap
        Map<String,Integer> numbers = new HashMap<>();

        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        if(!numbers.containsKey("two")){
            numbers.put("Two",23);
        }

        for( Map.Entry<String,Integer> it : numbers.entrySet()){
            System.out.println(it.getKey()+ " : "+ it.getValue());
        }

        for( String it : numbers.keySet()){
            System.out.println(it);
        }

        for( Integer it : numbers.values()){
            System.out.println(it);
        }

        System.out.println(numbers.isEmpty());


        //TreeMap sorts based on keys

        //Arrays class on top of primitive data types
        int[] num = {1,2,3,4,5,6,7};
        int index = Arrays.binarySearch(num,4);
        System.out.println(index);
        Arrays.sort(num); // uses quick sort

        Arrays.fill(num,12);
        System.out.println(Arrays.toString(num));

    }
}
