public class SimpleInterest {
    public static double Interest (double deposit,double rate, double time ){
        
        return deposit*rate*time;


    }
    

    public static void main(String[] args) {
     double depo= 100000;
     double percentage= 0.05;
     double timePeriod= 5;
     double SInterest = Interest(depo, percentage, timePeriod);
     System.out.println("The simple interest of the deposited amount: " + SInterest);
        
    }
}
