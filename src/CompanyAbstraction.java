import java.util.ArrayList;
import java.util.List;

public abstract class CompanyAbstraction {

    private long id;
    private String companyName;
    private List<Employee> employees;

    public CompanyAbstraction(long id, String companyName) {
        this.id = id;
        this.companyName = companyName;
        this.employees = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }



    public List<Employee> getEmployees() {
        return employees;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyAbstraction that = (CompanyAbstraction) o;

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }


    @Override
    public String toString() {
        return this.getCompanyName();
    }
}
