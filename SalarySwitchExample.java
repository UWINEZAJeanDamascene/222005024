public class SalarySwitchExample {
    public static void main(String[] args) {
        int salary = 60000;
        
        switch (salary) {
            
            case 50000 :
                System.out.println("Junior Associate");
                break;
            case 40000:
            
                System.out.println("Associate");
                break;
            case 10000:
            
               System.out.println("Senior Associate");
                break;
            case 100000:
            
                System.out.println("Manager");
                break;
            default:
                System.out.println("Senior Manager or above");
                break;
        }

    }
}
