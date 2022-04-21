package ch16;

public class EmployeeTest {

    public EmployeeTest(){

    }

    public static void main(String[] args) {

        System.out.println("시작 번호는 " + Employee.serialNum);
        System.out.println();

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");


        System.out.println(employeeLee.getEmployeeName() + "의 사번은 " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "의 사번은 " + employeeKim.getEmployeeId());
    }

}
