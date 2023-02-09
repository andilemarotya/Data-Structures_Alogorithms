import java.util.*;
public class Stacks {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("FIFA 22");
        stack.push("GTA 5");
        stack.push("GOW");
        stack.push("NFS: Most Wanted");

        //System.out.println(stack.empty());     // checks if the stack is empty or not
        System.out.println(stack);
       // String myFavGame = stack.pop();   //removes last added game and stores it in the variable
       // System.out.println(myFavGame);
       // System.out.println(stack.peek());  // checks the top most item in my stacks

        System.out.println(stack.search("GTA 5"));   //returns position number from 1 to nth or -1 when not in stack





    }
}
