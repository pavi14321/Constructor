
class Emp1 {
    String emp_name;
    int emp_id;
    double emp_sal;

    Emp1(String emp_name, int emp_id, double emp_sal) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.emp_sal = emp_sal;
    
    }

    public static void main(String[] args) {
        Emp1 e = new Emp1("praveen", 123 , 20000000.00);
    System.out.println("employee name is: "+e.emp_name);
    System.out.println("employee sal is: "+e.emp_sal);
    System.out.println("employee id is: "+e.emp_id);
    

    }
    
}