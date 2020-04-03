package websystique.processor;

import java.time.Duration;

import org.springframework.batch.item.ItemProcessor;

import websystique.model.Employee;

public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee employee) throws Exception {
		
		long inTime = Duration.between(employee.getCheckIn(), employee.getCheckOut()).toHours();
		System.out.println("In time of "+ employee+" is "+ inTime);
		
		if (inTime<6) {
			return employee;
		}
		
		return null;
	}
}
