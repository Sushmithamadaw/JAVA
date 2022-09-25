package stack;

public class dynamicStack implements stack {
    private char[] data;
    private int top;
    dynamicStack(int size){
     data=new char[size];
     top=0;
    } 
     public void push(char ch){
         if(top==data.length){
             char [] t=new char[data.length*2];
             for(int i=0;i<top;i++)
             {
                t[i]=data[i];
                data=t;
             }
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
     public boolean isEmpty(){
        return top==0;
     }
 public boolean isFull(){
  return false;
 }
     }
 
