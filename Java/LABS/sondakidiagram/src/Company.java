public class Company {

    Employee[] employees;
    CompanyName cName;

    public Company(Employee[] emps , CompanyName cName)
    {
        this.employees = emps;
        this.cName = cName;
    }

    public CompanyName getCompanyName(){

        return cName;
    }

}
