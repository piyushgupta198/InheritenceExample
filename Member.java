
public class Member {

    public String name;
    public int age;
    public long phone_no;
    public String address;
    public int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    public String getName() {
        System.out.println("Name :" + name);
        return name;
    }

    public int getAge() {
        System.out.println("Age :" + age);
        return age;
    }

    public long getPhone_no() {
        System.out.println("Phone number :" + phone_no);
        return phone_no;
    }

    public String getAddress() {
        System.out.println("Address :" + address);
        return address;
    }

    public int getSalary() {
        System.out.println("Salary :" + salary);
        return salary;
    }
}

class Employee extends Member {

    public String specialization;
    public String department;

    public String getSpecialization() {
        System.out.println("specialization :" + specialization);
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        System.out.println("Department :" + department);
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

class Manager extends Member {

    public String specialization;
    public String department;

    public String getSpecialization() {
        System.out.println("specialization :" + specialization);
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        System.out.println("Department :" + department);
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        Manager manager = new Manager();

        employee.setName("Wask");
        employee.setAge(28);
        employee.setAddress("Bandhare wali gali, HaddapaPuri");
        employee.setPhone_no(73847934);
        employee.setSalary(34999);
        employee.setSpecialization("Typing");
        employee.setDepartment("Depo");

        manager.setName("Maska");
        manager.setAge(24);
        manager.setAddress("Mahulla , HaddapaPuri");
        manager.setPhone_no(9845794);
        manager.setSalary(36999);
        manager.setSpecialization("Dancing");
        manager.setDepartment("Acedemy");

        manager.getName();
        manager.getAge();
        manager.getPhone_no();
        manager.getAddress();
        manager.getSalary();
        manager.getSpecialization();
        manager.getDepartment();

        employee.getName();
        employee.getAge();
        employee.getPhone_no();
        employee.getAddress();
        employee.getSalary();
        employee.getSpecialization();
        employee.getDepartment();
    }
}
