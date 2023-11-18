package Behavioural.stratogy;

public class Context {
    private Stratorgy stratorgy;

    public Context(Stratorgy stratorgy){
        this.stratorgy = stratorgy;
    }

    public int minasStratorgy(int num1,int num2){
        return stratorgy.decimalNumber(num1,num2);
    }
}
