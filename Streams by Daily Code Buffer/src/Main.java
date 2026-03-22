import static java.util.Arrays.stream;

void main() {

    List<Employee> employees = new ArrayList<>();

    employees.add(
            new Employee("Shabbir", "Dawoodi", 5000.0, List.of("Project 1","Project 2"))
    );

    employees.add(
            new Employee("Nikhil", "Gupta", 6000.0, List.of("Project 1","Project 3"))
    );

    employees.add(
            new Employee("Shivam", "Kumar", 5500.0, List.of("Project 3","Project 4"))
    );

    //foreach
    employees.stream().forEach(employee -> System.out.println(employee));


    //map -> increase salary of every employee by 10%
    Set<Employee> increasedSal = employees.stream().map(employee -> new Employee(employee.getFirstName(),
                                                employee.getLastName(),
                                                employee.getSalary() * 1.10,
                                                employee.getProjects())).collect(Collectors.toSet());

    System.out.println(increasedSal);


    //filter - increase
    List<Employee> employeeList =  employees.stream().filter(employee -> employee.getSalary() > 5000)
            .map(employee -> new Employee(employee.getFirstName(),
            employee.getLastName(),
            employee.getSalary() * 1.10,
            employee.getProjects())).toList();

    System.out.println(employeeList);


    //findfirst
    Employee firstEmployee =
            employees
                    .stream()
                    .filter(employee -> employee.getSalary() > 7000.0)
                    .map(employee -> new Employee(
                            employee.getFirstName(),
                            employee.getLastName(),
                            employee.getSalary()  * 1.10,
                            employee.getProjects()
                    ))
                    .findFirst()
                    .orElse(null);
    System.out.println(firstEmployee);

    //flatmap
    String projects =  employees.stream().
            map(employee -> employee.getProjects())
            .flatMap(strings -> strings.stream())
            .collect(Collectors.joining(","));

    System.out.println(projects);


    //shortcircuit operators
   List<Employee> employees1   = employees.stream().skip(1).limit(1).toList();
    System.out.println(employees1);


    //infinite to finite data
    Stream.generate(Math::random)
            .limit(5)
            .forEach(value -> System.out.println(value));


    //sort
    List<Employee>  sortedEmpList = employees.stream().sorted((o1, o2) ->
            o1.getFirstName().compareToIgnoreCase(o2.getFirstName())).toList();

    System.out.println(sortedEmpList);


    //min or max
    employees
            .stream()
            .max(Comparator.comparing(Employee::getSalary))
            .orElseThrow(NoSuchElementException::new);

    //reduce
    Double totalSal =
            employees
                    .stream()
                    .map(employee -> employee.getSalary())
                    .reduce(0.0,Double::sum);
    System.out.println(totalSal);

}
