
public class Main {
    public static void main(String[] args) {
        Company franceCompany = new Company("FRANCE", 18, "Peugeot");
        Company germanyCompany = new Company("GERMANY", 15, "Volkswagen");
        Company tunisiaCompany = new Company("TUNISIA", 10, "Carthage Motors");
        Company belgiumCompany = new Company("BELGIUM", 12, "Brussels Automotive");
        Company denmarkCompany = new Company("DENMARK", 8, "Copenhagen Cars");

        franceCompany.addEmployee(new Employee(2, "Sophie", "Martin", 2000));
        franceCompany.addEmployee(new Employee(3, "Luc", "Dubois", 5000));

        germanyCompany.addEmployee(new Employee(4, "Max", "Schmidt", 5500));
        germanyCompany.addEmployee(new Employee(5, "Anna", "Müller", 3450));

        tunisiaCompany.addEmployee(new Employee(6, "Ahmed", "Ben Ali", 3500));
        tunisiaCompany.addEmployee(new Employee(7, "Houccem", "Gran", 4000));

        belgiumCompany.addEmployee(new Employee(8, "Eva", "Van Damme", 2600));
        belgiumCompany.addEmployee(new Employee(9, "Michel", "Lefevre", 6000));

        denmarkCompany.addEmployee(new Employee(10, "Lars", "Jensen", 7000));
        denmarkCompany.addEmployee(new Employee(11, "Mette", "Andersen", 6500));


        CompanyBuilder.buildCompany(franceCompany);
        CompanyBuilder.buildCompany(germanyCompany);
        CompanyBuilder.buildCompany(tunisiaCompany);
        CompanyBuilder.buildCompany(belgiumCompany);
        CompanyBuilder.buildCompany(denmarkCompany);

        CompanyBuilder.printCompanies();

        var employees = CompanyBuilder.getEmployees();
        System.out.println("------------------------------------");
        System.out.println(employees);
        System.out.println("------------------------------------");


        System.out.println("===================================");
        System.out.println(CompanyBuilder.getMaxSalaryOfEmployees(employees));
        System.out.println("===================================");

        CompanyBuilder.removeEmployees((employee -> employee.salary() < 5000), employees);
        System.out.println("*************************************");
        System.out.println(employees);
        System.out.println("*************************************");

    }
}