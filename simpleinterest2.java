 class simpleinterest2 {
    double deposit;
    public simpleinterest2(double d){
        deposit=d;
        
    }
    public double Amount( double rate, int time){
        return deposit*rate*time;
    }
    

        public static void main(String[] args) {

            simpleinterest2 myInterest= new simpleinterest2(100000);
            double SAmount=myInterest.Amount( 0.05, 5);
            System.out.println("the interest is: " + SAmount);

            
        }
    }

