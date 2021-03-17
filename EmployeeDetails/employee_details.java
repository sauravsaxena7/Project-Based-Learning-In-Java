package project_array;

public class employee_details{

    public String emp_no,emp_name,join_date,deig_code,dept,basic,hra,it;


    public employee_details(String emp_no, String emp_name, String join_date,
                            String deig_code, String dept,
                            String basic, String hra, String it) {
        this.emp_no = emp_no;
        this.emp_name = emp_name;
        this.join_date = join_date;
        this.deig_code = deig_code;
        this.dept = dept;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }


    public String getEmp_no() {
        return emp_no;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getJoin_date() {
        return join_date;
    }

    public String getDeig_code() {
        return deig_code;
    }

    public String getDept() {
        return dept;
    }

    public String getBasic() {
        return basic;
    }

    public String getHra() {
        return hra;
    }

    public String getIt() {
        return it;
    }
}
