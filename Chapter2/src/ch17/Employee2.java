package ch17;

public class Employee2 {

    private static int serialNum = 1; //public -> private 외부에서 변경하면 안되므로.

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee2() { // 생성자
        employeeId = serialNum; // static은 공유하기 때문에, 매번 다른 사번을 부여하는 방법.
        serialNum++; // 한 명당 +1
    }


    public static int getSerialNum() {
        int i = 0;
//        employeeName = "Lee";

        return serialNum;
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
