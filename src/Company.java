
public class Company extends CompanyAbstraction {

    private String companyCountry;

    public Company(String companyCountry, long id, String companyName) {
        super(id, companyName);
        this.companyCountry = companyCountry;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    public boolean addEmployee(Employee employee) {
        if (!isEmployeeAdded(employee)) {
            return this.getEmployees().add(employee);
        }
        return false;
    }

    private boolean isEmployeeAdded(Employee employee) {
        return this.getEmployees().contains(employee);
    }



}
