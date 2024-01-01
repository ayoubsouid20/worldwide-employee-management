import java.util.Comparator;

record Employee(long id, String firstName, String lastName, double salary
) implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Long.compare(o1.id, o2.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}