import java.util.*;
public class Main
{
    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();
    static void Queue(int a){
        if(st1.isEmpty()){
            st1.push(a);
            return;
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st2.push(a);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }
    static int Dequeue(){
        int value = st1.pop();
        return value;
    }
	public static void main(String[] args) {
		Queue(1);
		Queue(2);
		Queue(3);
		Queue(4);
		System.out.println(Dequeue());
		System.out.println(Dequeue());
		System.out.println(Dequeue());
		System.out.println(Dequeue());
	}
}