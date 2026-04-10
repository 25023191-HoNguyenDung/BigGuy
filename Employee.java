//Employee
class My_Date {
    public int day;
    public int month;
    public int year;
    
    public My_Date(int day,int month,int year) {
        this.set_Month(month);
        this.set_Day(day);
        this.set_Year(year);
    }

    public My_Date(My_Date other){
        this.day = other.day;
        this.month = other.month;
        this.year= other.year;
    }

    public void set_Month(int check) {
        if (check < 0 || check > 12 ) {
            System.out.println(" the Date is invalid, check the month");
        } else {
            this.month = check;
        }
    }

    public void set_Day(int check) {
        if ( (month == 2) && (check < 0 || check > 29) ) { System.out.println("The date is invalid, check the day");}
        else if (check < 0 || check > 31) { System.out.println("The date is invalid, check the day");}
        else {this.day = check;}
    }    
    public void set_Year(int check) {
            if (check < 0) { System.out.println("The date is invalid, check the year");}
            else { this.year = check; }
    }
}    


public class Employee {

    public String name;
    public My_Date birthday;

    public Employee(String name, My_Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Employee(Employee other) {
        this.name = other.name;
        this.birthday =new My_Date(other.birthday);
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("NVA", new My_Date(1, 1, 2000));
        Employee emp2 = new Employee(emp1);

        emp1.birthday = new My_Date(2, 2, 2000);
        System.out.println(emp2.birthday.day + "/" + emp2.birthday.month +"/"+ emp2.birthday.year);
    }
}
