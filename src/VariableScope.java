public class VariableScope {
    
    static int x = 3; // CLASS SCOPE
    
    public static void main(String[] args){

        // variable scope = where a variable can be accessed

        int x = 1; // LOCAL SCOPE

        System.out.println(x);

        doSomething();

    }
    static void doSomething(){
        
        int x = 2; // LOCAL SCOPE

        System.out.println(x);
    }
}
