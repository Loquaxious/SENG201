import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class SpaceAgency {
	
	static boolean worksInEngineering(SpaceEmployee employee) {
		if (employee.getDepartment() == "engineering") {
				return true;
		} else {
			return false;
		}
	}
	
	public Stream<SpaceEmployee> findEngineers(Collection<SpaceEmployee> employees) {
		return employees.stream()
				.filter(SpaceAgency::worksInEngineering);
		
	}
	
	static String describeEmployee(SpaceEmployee employee) {
		return String.format("%s works in the %s department", employee.getName(), employee.getDepartment());
	}
	
	public Stream<String> listEmployees(Collection<SpaceEmployee> employees) {
		return employees.stream()
					.map(SpaceAgency::describeEmployee);
	}
	
	public List<SpaceEmployee> getSalarySortedEmployees(Stream<SpaceEmployee> empStream) {
		return empStream.sorted(Comparator.comparing(SpaceEmployee::getSalary).reversed())
						.collect(Collectors.toList());
	}
	

	
	public double totalPay(Stream<SpaceEmployee> empStream) {
		return empStream.map(SpaceEmployee::getSalary)
						.reduce(0.0, (o1, o2) -> o1 + o2);
	}
	
	public static void main(String[] args) {
		ArrayList<SpaceEmployee> employees = new ArrayList<>();
		employees.add(new SpaceEmployee( "Jeff", "engineering", 90000.0));
		employees.add(new SpaceEmployee( "Kate", "astronaut", 130000.0));
		employees.add(new SpaceEmployee( "Luke", "mission control", 82000.0));
		employees.add(new SpaceEmployee( "Jess", "engineering", 96000.0));

		SpaceAgency spaceAgency = new SpaceAgency();
		spaceAgency.getSalarySortedEmployees(employees.stream()).forEach(emp -> System.out.printf("%s with %s/year%n", emp.getName(), emp.getSalary()));
		System.out.printf("Total pay is %s", spaceAgency.totalPay(employees.stream()));
	}

}
