package mainPakage;


public class Current_Rates {

    public double below_1_crore(int no_of_days, int age) {

        double current_rate = 0;

        try {
            if (no_of_days < 0) {
                throw new Exception("Invalid Number of days. Please enter correct values.");
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
            return current_rate;
        }


        try {
            if (age < 18) {
                throw new Exception("Invalid holder Age. Please enter correct values.");
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
            return current_rate;
        }


        if ((no_of_days >= 7 && no_of_days <= 14)) {
            if (age <= 59) {
                current_rate = 4.50;
            } else {
                current_rate = 5.00;
            }

        } else if ((no_of_days >= 15 && no_of_days <= 29)) {
            if (age <= 59) {
                current_rate = 4.75;
            } else {
                current_rate = 5.25;
            }
        } else if ((no_of_days >= 30 && no_of_days < 45)) {
            if (age <= 59) {
                current_rate = 5.50;
            } else {
                current_rate = 6.00;
            }
        } else if ((no_of_days >= 45 && no_of_days <= 60)) {
            if (age <= 59) {
                current_rate = 7;
            } else {
                current_rate = 7.50;
            }
        } else if ((no_of_days >= 61 && no_of_days <= 184)) {
            if (age <= 59) {
                current_rate = 7.50;
            } else {
                current_rate = 8.00;
            }

        } else {
            if (age <= 59) {
                current_rate = 8.00;
            } else {
                current_rate = 8.50;
            }
        }

        return current_rate;
    }


    public double above_1_crore(int no_of_days, int age) {

        double current_rate = 0;

        try {
            if (no_of_days < 0) {
                throw new Exception("Invalid Number of days. Please enter correct values.");
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
            return current_rate;
        }


        try {
            if (age < 18) {
                throw new Exception("Invalid holder Age. Please enter correct values.");
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
            return current_rate;
        }





        if ((no_of_days >= 7 && no_of_days <= 14)) {

            current_rate=6.50;

        } else if ((no_of_days >= 15 && no_of_days <= 29)) {

            current_rate=6.75;

        } else if ((no_of_days >= 30 && no_of_days < 45)) {

            current_rate=6.75;

        } else if ((no_of_days >= 45 && no_of_days <= 60)) {

            current_rate=8;

        } else if ((no_of_days >= 61 && no_of_days <= 184)) {

            current_rate=8.50;

        } else {

            current_rate=10.00;
        }



        return current_rate;
    }



    public double RD_Current_Rate(int no_of_month,int age){
        double current_rate=0;
        try {
            if (no_of_month < 0) {
                throw new Exception("Invalid Number of month. Please enter correct values.");
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
            return current_rate;
        }


        try {
            if (age < 18) {
                throw new Exception("Invalid holder Age. Please enter correct values.");
            }

        } catch (Exception e) {
            System.out.print(e.getMessage());
            return current_rate;
        }




        if(no_of_month>=6 && no_of_month<9){

            if (age <= 59) {
                current_rate = 7.50;
            } else {
                current_rate = 8.00;
            }

        }else if(no_of_month>=9 && no_of_month<12){

            if (age <= 59) {
                current_rate = 7.75;
            } else {
                current_rate = 8.25;
            }

        }else if(no_of_month>=12 && no_of_month<15){

            if (age <= 59) {
                current_rate = 8.00;
            } else {
                current_rate = 8.50;
            }

        }else if(no_of_month>=15 && no_of_month<18){

            if (age <= 59) {
                current_rate = 8.25;
            } else {
                current_rate = 8.75;
            }

        }else if(no_of_month>=18 && no_of_month<21){

            if (age <= 59) {
                current_rate = 8.50;
            } else {
                current_rate = 9.00;
            }

        }else {
            if (age <= 59) {
                current_rate = 8.75;
            } else {
                current_rate = 9.25;
            }
        }



        return current_rate;

    }



}