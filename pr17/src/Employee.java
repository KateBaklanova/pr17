import java.util.Random;

public class Employee {

    private String EmployeeName;
    private String EmployeeId;
    private String EmployeeCategory;
    public String getId() {
        return EmployeeId;
    }
    public void setId(String id) {
        this.EmployeeId = id;
    }
    public String getName() {
        return EmployeeName;
    }
    public void setName(String name) {
        this.EmployeeName = name;
    }
    public String getCategory() {
        return EmployeeCategory;
    }
    public void setCategory(String category) {
        this.EmployeeCategory = category;
    }

}

