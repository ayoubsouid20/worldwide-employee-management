import java.util.*;
import java.util.function.Predicate;

public class CompanyBuilder {

    public static Map<Country, List<Company>> companies = new EnumMap<>(Country.class);


    public static void buildCompany(Company company) {

        companies.merge(Country.valueOf(company.getCompanyCountry()), new ArrayList<>(List.of(company)), (oldValue, newValue) -> {
            oldValue.add(company);
            return oldValue;
        });

    }

    public static boolean removeEmployees(Predicate<Employee> predicate, List<Employee> employees) {
        var iterator = employees.listIterator();
        boolean isRemoved = false;
        while (iterator.hasNext()) {
            if (Utils.<Employee>isOperationValid(predicate, iterator.next())) {
                iterator.remove();
                isRemoved =  true;
            }
        }
        return isRemoved;
    }

    public static Employee getMaxSalaryOfEmployees(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::salary));
        return employees.get(employees.size() - 1);
    }


    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        companies.forEach((key, value) -> {
            for (Company company : value) {
                employees.addAll(company.getEmployees());
            }
        });
        return employees;
    }

    public static void printCompanies() {
        companies.forEach((key, value) -> {
            System.out.println("****************************************");
            System.out.println("County: " + key);
            System.out.println("****************************************");
            System.out.println("Companies in: " + key);
            System.out.println("========================================");
            value.forEach((company) -> {
                System.out.println("Employees of company: " + company);
                company.getEmployees().forEach(System.out::println);
            });
        });
    }
}
