package websystique.util;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import websystique.model.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeName(rs.getString("employee_name"));
		employee.setCheckIn(rs.getTimestamp("check_in").toLocalDateTime());
		System.out.println("Blah: "+ employee.getCheckIn());
		employee.setCheckOut(rs.getTimestamp("check_out").toLocalDateTime());
		
		return employee;
	}
}
