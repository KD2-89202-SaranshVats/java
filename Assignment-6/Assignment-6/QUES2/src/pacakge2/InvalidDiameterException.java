package pacakge2;
import java.util.Scanner;
public class InvalidDiameterException extends Exception{
	private String invalidField;
	private double invalidValue;
	
	public InvalidDiameterException() {
		
	}
	
	public InvalidDiameterException(String invalidField , double invalidValue) {
		this.invalidField = invalidField;
		this.invalidValue = invalidValue;
	}
	
	public void setInvalidField(String invalidField) {
		this.invalidField = invalidField;
	}
	
	public String getInvalidField() {
		return this.invalidField;
	}
	
	public void setInvalidValue(double invalidValue) {
		this.invalidValue = invalidValue;
	}
	
	public double getInvalidValue() {
		return this.invalidValue;
	}
	
	public String getMessage() {
		return String.format("%s------- =%f",this.invalidField,this.invalidValue);
	}
}
