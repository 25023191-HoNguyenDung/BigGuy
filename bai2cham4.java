class MyDate {
    int day;
    int month;
    int year;
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(MyDate other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }
}
class Employee {
    String name;
    MyDate birthday;
    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }    
    public Employee(Employee other) {
        this.name = other.name;
        this.birthday = new MyDate(other.birthday);
    }
}
public class bai2cham4 {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(1,1,2000);
        Employee emp1 = new Employee("Anh", d1);
        Employee emp2 = new Employee(emp1);
        emp1.birthday = new MyDate(2,2,2022);
        System.out.println(
            emp2.birthday.day + "/" +
            emp2.birthday.month + "/" +
            emp2.birthday.year
        );
    }
}