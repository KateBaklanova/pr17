public class Demo {

        public static void main(String[] args) {

            Employee model = retriveEmployeeFromDatabase();

            EmployeeView view = new EmployeeView();
            EmployeeController controller = new
                    EmployeeController(model, view);
            controller.updateView();
            //update model data
            controller.setEmployeeName("Igor");
            System.out.println("nAfter updating, Employee Details are as follows");
            controller.updateView();
        }
        private static Employee
        retriveEmployeeFromDatabase(){
            Employee Employee = new Employee();
            Employee.setName("Peter");
            Employee.setId("01");
            Employee.setCategory("Programming");
            return Employee;
        }
    }

