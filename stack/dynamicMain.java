package stack;

public class dynamicMain {
    public static void main(String[] args) {
        fixedLength f= new fixedLength(15);
        dynamicStack d=new dynamicStack(25);
        stack iStack;
        iStack=f;
        System.out.print("Fixed \n");
        for(int i=0;i<15;i++){
            f.push((char)('A'+i));
        }
        for(int i=0;i<15;i++)
        {
            System.out.print(f.pop()+"\t"); 
        }
        iStack=d;
        System.out.print("\ndyn \n");
        for(int i=0;i<25;i++){
            d.push((char)('A'+i));
        }
        for(int i=0;i<25;i++)
        {
            System.out.print(d.pop()+"\t"); 
        }
    }
}
