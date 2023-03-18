package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
     public static void main(String[] args) {
        GreatestNumberPrinter g = new GreatestNumberPrinter();
        g.printGreatest(0, 0);
    }
    
    public void printGreatest(int first, int second) {
        if(first > second){
            System.out.println(first);
        }else{
            System.out.println(second);
        }
    }
}
