package problema1;

import static java.lang.Math.max;

public class PerecheNumere {
    private int a;
    private int b;
    public PerecheNumere(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }
    public PerecheNumere() {}
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public String toString() {
        return "PerecheNumere [a=" + a + ", b=" + b + "]";
    }
  public  boolean Fibonaci() {
        int fib1=0, fib2=1;
        int aux=0;
        while(fib2<= Math.max(this.a,this.b)){
            if ((fib1 == this.a && fib2 == this.b) || (fib1 == this.b && fib2 == this.a))
            return true;
            aux=fib1;
            fib1=fib2;
            fib2=aux+fib1;
        }
        return false;
    }
  public  int cmmmc(){
        int x=this.a;
        int y=this.b;
        //calculam cel mai mare divizor comun
        while(x!=y){
            if(x>y)
                x=x-y;
            else
                y=y-x;
        }
        return (this.a*this.b)/x;
    }
   public boolean SumCif(){
        int x=this.a;
        int y=this.b;
        int s1=0,s2=0;
        while(x!=0){
            s1=s1+x%10;
            x=x/10;
        }
        while(y!=0){
            s2=s2+y%10;
            y=y/10;
        }
        if(s1==s2){
            return true;
        }
        return false;
    }
    public boolean CifPare(){
        int x=this.a;
        int y=this.b;
        int nr1=0,nr2=0;
        while(x!=0){
            if((x%10)%2==0){
                nr1++;
            }
            x=x/10;
        }
            while(y!=0){
                if((y%10)%2==0){
                    nr2++;
                }
                y=y/10;
            }
            if(nr1==nr2){
                return true;
            }
            return false;
    }
}
