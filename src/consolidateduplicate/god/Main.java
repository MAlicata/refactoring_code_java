package consolidateduplicate.god;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    double calculateExraSalary(){
        double result = 0;
       if(isEligibleExtraSalary()){
           result = 500;
       }
       else{
           result = 0;
       }
        sendMessage();
       return result;
    }

    private void sendMessage() {
        System.out.println("Sending message");
    }
    public boolean isEligibleExtraSalary(){
        boolean estudios = seniority<1 || education<1;
        boolean antiguedad = incidents>10 && certification;
        return estudios || antiguedad;
    }
}
