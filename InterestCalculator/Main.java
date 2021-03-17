package mainPakage;


import java.util.Scanner;

abstract class Account{

    private double interestRate;
    private double amount;



    public Account(double interestRate, double amount){
        this.amount=amount;
        this.interestRate=interestRate;

    }


    abstract double calculateInterest(double interestRate,double amount);

}




class  FD_interest extends Account{


    public FD_interest(double interestRate, double amount) {
        super(interestRate, amount);

        System.out.println("Interest gained: "+calculateInterest(interestRate,amount));
    }

    @Override
    double calculateInterest(double interestRate, double amount) {
        return (amount*interestRate)/100;
    }


}





class  RD_interests extends Account{

    public RD_interests(double interestRate, double amount) {
        super(interestRate, amount);

        System.out.println("Interest gained: "+calculateInterest(interestRate,amount));

    }



    @Override
    double calculateInterest(double interestRate, double amount) {
        return (amount*interestRate)/100;
    }


}




class SB_Account extends Account{


    public SB_Account(double interestRate, double amount) {
        super(interestRate, amount);


        System.out.println("Interest gained: "+calculateInterest(interestRate,amount));

    }



    @Override
    double calculateInterest(double interestRate, double amount) {

        return (amount*interestRate)/100;
    }


}





public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice;
        double amount;
        double interestRate;
        Current_Rates currentRates = new Current_Rates();

        int age;

        boolean true_or_false=true;
        while (true_or_false){

            System.out.println("1. Interest Calculator –SB\n" +
                    "2. Interest Calculator –FD\n" +
                    "3. Interest Calculator –RD\n" +
                    "4. Exit");


            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the Average amount in your account:");
                    amount=sc.nextDouble();
                    System.out.println("Are you Nri? y/n ");
                    String nri = sc.next();


                    if(nri.equals("y") || nri.equals("Y")){

                         interestRate=6;

                    }else{

                        interestRate=4;
                    }

                    try {
                        if(amount<0){
                            throw new Exception("Invalid amount");
                        }

                        new SB_Account(interestRate,amount);

                    }catch (Exception e){
                        System.out.print(e.getMessage());
                    }

                    break;

                case 2:

                    System.out.println("Enter the FD amount:");
                    amount=sc.nextDouble();
                    int no_of_days;
                    System.out.println("Enter the number of days:");
                    no_of_days=sc.nextInt();
                    System.out.println("Enter your age:");
                    age=sc.nextInt();

                    try {
                        if(amount<0){
                            throw new Exception("Invalid amount");
                        }


                        if(amount>=10000000){
                            interestRate=currentRates.above_1_crore(no_of_days,age);
                        }else{
                            interestRate=currentRates.below_1_crore(no_of_days,age);
                        }

                        if(interestRate==0){
                            throw new Exception("Wrong Input or output");
                        }

                        new FD_interest(interestRate,amount);


                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Enter the RD amount:");
                    amount=sc.nextDouble();
                    int no_of_month;
                    System.out.println("Enter the number of month:");
                    no_of_month=sc.nextInt();
                    System.out.println("Enter your age:");
                    age=sc.nextInt();

                    try {
                        if(amount<0){
                            throw new Exception("Invalid amount");
                        }


                        interestRate=currentRates.RD_Current_Rate(no_of_month,age);


                        if(interestRate==0){
                            throw new Exception("Wrong Input or output");
                        }

                        new RD_interests(interestRate,amount);


                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    true_or_false=false;




            }

        }



    }

}


