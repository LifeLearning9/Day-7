import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()%2!=0){
        System.out.println("false");  //if the length is odd it rejects intitally
        return ;
        }
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray())
            {
                if(ch=='(' || ch=='{' || ch=='[') // all the opening brackets are added until the closing bracket found
                 st.push(ch);
                else
                  {
                      if(st.isEmpty())
                      {
                          System.out.println("false"); // when there is closing braces intitally 
                          return;
                      }
                      char top=st.pop();
                      if((ch==')' && top!='(')||(ch=='}' && top!='{')||(ch==']'&& top!='['))  // top element is compared with the each closing bracket
                      {
                       System.out.println("false");
                       return;
                      }
                  }
                 
            }
            System.out.print(st.isEmpty());  // if stack becomes empty then it is valid
        }
}
