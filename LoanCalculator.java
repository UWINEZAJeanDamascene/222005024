
    public class LoanCalculator {
         double borrowed;
         double rate;
         int time;
    
        public LoanCalculator(double borrowed, double rate, int time) {
            borrowed = 50000;
            rate = 18 ;
            time = 3; 
        }
    
        public double calculateTotalAmount() {
            double compoundInterest = borrowed * Math.pow(1 +rate, time) - borrowed;
            return borrowed + compoundInterest;
        }
    
        public static void main(String[] args) {
            double borrowed = 500000;
            double rate = 0.18;
            int loanPeriod = 3;
    
            LoanCalculator loan = new LoanCalculator(borrowed, rate, loanPeriod);
    
            double totalAmountPaid = loan.calculateTotalAmount();
    
            System.out.println("Total amount bob will pay " + loanPeriod + " years: frw" + totalAmountPaid);
            } 
    }   

