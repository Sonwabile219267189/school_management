//package za.ac.cput.school_management.repository;
//
//import za.ac.cput.school_management.domain.user.Employee;
//import za.ac.cput.school_management.domain.user.Name;
//import za.ac.cput.school_management.repository.user.IEmployeeRepository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class EmployeeRepository implements IEmployeeRepository {
//
//    public static EmployeeRepository repository = null;
//
//    private List<Employee> employeeDB = null;
//
//    private EmployeeRepository(){
//        employeeDB = new ArrayList<>();
//    }
//
//    public static EmployeeRepository getRepository(){
//        if(repository == null){
//            repository = new EmployeeRepository();
//        }
//        return repository;
//    }
//
//
//    public Employee save(Employee employee){
//        Employee readEmployee = (read(employee.getStaffId()));
//        if (readEmployee != null){
//            employeeDB.remove(readEmployee);
//            employeeDB.add(employee);
//        }
//        this.employeeDB.add(employee);
//        return employee;
//    }
//
//    public Employee read(String staffId) {
//        Employee readEmployee = employeeDB.stream().filter(emp -> emp.getStaffId()
//                        .equals(staffId))
//                        .findAny()
//                        .orElse(null);
//        return readEmployee;
//
//    }
//
//
//
//    public Employee delete(Employee employee){
//        Employee deleteEmployee = read(employee.getStaffId());
//        if(deleteEmployee != null){
//            employeeDB.remove(deleteEmployee);
//        }
//        return null;
//    }
//
//
//    public List<Employee> getAll(){
//        return employeeDB;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        return null;
//    }
//}
