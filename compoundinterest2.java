public class compoundinterest2 {
    
    double deposit;
    public compoundinterest2(double d){
        deposit=d;
        
    }
    public double Amount( double rate, int time){
        return deposit*Math.pow(1+rate/100/12, time*12);
    }
    

        public static void main(String[] args) {

            compoundinterest2 myInterest= new compoundinterest2(500000);
            double newAmount=myInterest.Amount( 18, 3);
            System.out.println("the compound interest is: " + newAmount);

            
        }
}
