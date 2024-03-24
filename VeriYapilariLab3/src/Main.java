public class Main {
    public static void main(String[] args) {
        Stack myStack=new Stack();
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.yazdir();
        System.out.println("-----------------------------");
        System.out.println(myStack.pop()+ "silindi.");
        System.out.println(myStack.pop()+  "silindi.");
        myStack.yazdir();
        System.out.println("-----------------------------");
        myStack.push(60);
        myStack.push(70);
        myStack.yazdir();
        System.out.println("-----------------------------");
        System.out.println(myStack.peek());
        myStack.bosMu();
        myStack.elemanSay();
        Stack myStack2=new Stack();
        Stack myStack3=myStack;
        while (myStack3.head!=null){
            myStack2.push(myStack3.pop());
        }
        myStack2.yazdir();

    }
}