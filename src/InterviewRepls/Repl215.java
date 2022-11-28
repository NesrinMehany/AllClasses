package InterviewRepls;

public class Repl215 {


    public static void main(String[] args) {
        System.out.println( isBalanced(")))))"));
    }



    public static boolean Balanced(String s){
        boolean isItbalanced;
        if (s.length()%2==0)
        {
            isItbalanced=true;
        }else{
            isItbalanced=false;
        }
    return isItbalanced;}



    public static boolean isBalanced(String s) {
        boolean balanced;

    int x=0;
    int z=0;
    for(int i=0; i<s.length(); i++){
    if(s.charAt(i)=='('){
        x++;
    }else if(s.charAt(i)==')'){
        z++;
    }
    }

    if (x==z){balanced=true;}
    else {balanced= false;}
   return balanced; }

    }


