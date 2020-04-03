package websystique.model;

import java.time.LocalDateTime;

public class Employee {
	String employeeName;
	LocalDateTime checkIn;
	LocalDateTime checkOut;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public LocalDateTime getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(LocalDateTime checkIn) {
		this.checkIn = checkIn;
	}
	
	public LocalDateTime getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(LocalDateTime checkOut) {
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Employee[employeeName"+employeeName+", checkIn"+checkIn+", checkOut"+checkOut+"]";
	}
}
