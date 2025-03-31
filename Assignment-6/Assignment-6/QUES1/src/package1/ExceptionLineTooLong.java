package package1;
import java.util.Scanner;
public class ExceptionLineTooLong extends Exception{
	public String invalidfield;
	public int invalidvalue;
	
	public ExceptionLineTooLong() {
		
	}
	
	public ExceptionLineTooLong(String invalidField , int invalidValue) {
		this.invalidfield = invalidField;
		this.invalidvalue = invalidValue;
	}
	
	public void setInvalidField(String invalidField) {
		this.invalidfield = invalidField;
	}
	
	public String getInvalidField() {
		return this.invalidfield;
	}
	
	public void setInvalidValue(int invalidValue) {
		this.invalidvalue = invalidValue;
	}
	
	public int getInvalidValue() {
		return this.invalidvalue;
	}
	
	public String getMessage() {
		return String.format("%s----%d",this.invalidfield,this.invalidvalue);
	}

}
