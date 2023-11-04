public class bankAccount {

        public static double Interest (double borrowed,double rate, double time ){
            
            return borrowed*Math.pow(1+rate, time);
    
    
        }
        
    public static void main(String[] args){
        
         double depo= 500000;
         double percentage= 0.18;
         double timePeriod= 3;
         double SInterest = Interest(depo, percentage, timePeriod);
            System.out.println("compound interest of the borrowed amount is: " + SInterest);
        
        }
}
      
