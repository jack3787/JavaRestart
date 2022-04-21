package ch16;

public class Employee {

    public static int serialNum = 1;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() { // 생성자
        employeeId = serialNum; // static은 공유하기 때문에, 매번 다른 사번을 부여하는 방법.
        serialNum++; // 한 명당 +1
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
