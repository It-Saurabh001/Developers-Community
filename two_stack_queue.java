import java.util.*;
public class two_stack_queue {
    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("que is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[]){
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        while(!s.isEmpty()){
            System.out.println(" " + s.peek());
            s.remove();
        }
    }
}
