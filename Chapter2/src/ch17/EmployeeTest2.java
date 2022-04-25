package ch17;

public class EmployeeTest2 {

    public EmployeeTest2(){

    }

    public static void main(String[] args) {

        System.out.println("시작 번호는 " + Employee2.getSerialNum());
        System.out.println();

        Employee2 employeeLee = new Employee2();
        employeeLee.setEmployeeName("이순신");

        Employee2 employeeKim = new Employee2();
        employeeKim.setEmployeeName("김유신");


        System.out.println(employeeLee.getEmployeeName() + "의 사번은 " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "의 사번은 " + employeeKim.getEmployeeId());
    }

}
