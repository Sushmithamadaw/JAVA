package stack;

public class fixedLength implements stack {
   private char[] data;
   private int top;
   fixedLength(int size){
    data=new char[size];
    top=0;
   } 
    public void push(char ch){
        if(isFull()){
            System.out.print("s full");
            return;
        }
        data[top]=ch;
        top++;
    }
        public char pop() {
            if(isEmpty()){
            System.out.print("s empty"); 
            return(char)0;
        }
        top--;
        return data[top];
    }
public boolean isFull(){
    return top==data.length;
}
public boolean isEmpty(){
    return top==0;
}
    }

