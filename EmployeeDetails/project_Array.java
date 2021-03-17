package project_array;


import java.util.Scanner;

public class project_Array {

    static String Employee_details[][];
    static int rows,row;
    private static Scanner sc;


    private static String emp_no,emp_name,join_date,deig_code,dept,basic,hra,it;

    public static void main(String[] args) {


        sc = new Scanner(System.in);

        System.out.println("Enter the number of row of Employee");
        row = sc.nextInt();

        if(row<=0){
            System.out.println("Nothing to show");
        }else{
            input_employee_details(row);
        }





        int DA=0;
        String Degination="";
        if(row<=0){
            System.out.println("Nothing to show");
        }else{
            System.out.println("Enter the Employee no to find the details");
            rows=sc.nextInt();
            if(rows>=row){

                System.out.println("There is no employee with empid : "+rows);
            }else{
                DA= find_DA(Employee_details[rows][3]);
                Degination= find_Degination(Employee_details[rows][3]);
                if(DA<0 && !Degination.equals("")){
                    System.out.println("There is no employee with empid :"+rows);
                }else{
                    int Sal = find_Salary(Employee_details[rows][5],Employee_details[rows][6],Employee_details[rows][7],DA);
                    System.out.println("Emp No.: "+rows);
                    System.out.println("Emp Name: "+Employee_details[rows][1]);
                    System.out.println("Department: "+Employee_details[rows][2]);
                    System.out.println("Designation: "+Degination);
                    System.out.println("Salary: "+Sal);

                }

            }

        }








    }

    private static void input_employee_details(int row) {

        Employee_details = new String[row][];

        for(int i=0;i<row;i++){
            System.out.println("This is employee: "+i);

            System.out.println("Enter the name of "+i+" Employee:");
            emp_name=sc.next();

            System.out.println("Enter the join date of "+i+" Employee:");
            join_date=sc.next();

            System.out.println("Enter the degination code of "+i+" Employee:");
            deig_code=sc.next();

            System.out.println("Enter the department of "+i+" Employee:");
            dept=sc.next();

            System.out.println("Enter the basic of "+i+" Employee:");
            basic=sc.next();

            System.out.println("Enter the Hra of "+i+" Employee:");
            hra=sc.next();

            System.out.println("Enter the It of "+i+" Employee:");
            it = sc.next();


            employee_details employeeDetails = new employee_details(String.valueOf(i),emp_name,join_date,deig_code,dept,basic,hra,it);


            Employee_details[i]= new String[]{

                    String.valueOf(i),
                    employeeDetails.getEmp_name(),
                    employeeDetails.getJoin_date(),
                    employeeDetails.getDeig_code(),
                    employeeDetails.getDept(),
                    employeeDetails.getBasic(),
                    employeeDetails.getHra(),
                    employeeDetails.getIt()
            };


        }



        System.out.println("+--------+----------+------------+---------- +-------+-----+----+");
        System.out.println("| EMP_NO | EMP_NAME | DEPARTMENT | DEGI_CODE | BASIC | HRA | IT |");
        System.out.println("+--------+----------+------------+-----------+-------+-----+----+");
        for(int i=0;i<Employee_details.length;i++) {

            for(int j=0;j<Employee_details[i].length;j++){
                System.out.print(Employee_details[i][j]+"  |  ");

            }
            System.out.println();

        }

        System.out.println("+--------+----------+------------+-----------+-------+-----+----+");


    }

    private static int find_Salary(String s, String s1, String s2, int da) {
        int sal=0;
        if(da<0){
            System.out.println("Wrong input , you are violate the rule and regulation of typecasting, this is not be acceptable!!!");
        }else{
            int basic = Integer.parseInt(s);
            int hra = Integer.parseInt(s1);
            int it = Integer.parseInt(s2);

            sal = basic+hra+da-it;
        }
        return sal;
    }

    private static String find_Degination(String s) {
        String degination;

        if(rows<row){
            switch(s){
                case "e":
                    degination="Engineer";
                    break;
                case "c":
                    degination="Consultant";
                    break;
                case "k":
                    degination="Clerk";
                    break;
                case "r":
                    degination="Receptionist";
                    break;
                case "m":
                    degination="Manager";
                    break;
                default:
                    degination="NA";
                    System.out.println("For this desination code there is no records available in database");

            }
        }else{
            degination="";
        }
        return degination;
    }

    private static int find_DA(String s) {

        int da;

        if(rows<row){
            switch(s){
                case "e":
                    da=20000;
                    break;
                case "c":
                    da=32000;
                    break;
                case "k":
                    da=12000;
                    break;
                case "r":
                    da=15000;
                    break;
                case "m":
                    da=40000;
                    break;
                default:
                    da=0;
                    System.out.println("For this desination code there is no records available in database");

            }
        }else{
            da=-1;
        }
        return da;
    }


}
