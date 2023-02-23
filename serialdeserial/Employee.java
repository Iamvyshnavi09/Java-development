package serialdeserial;

import java.io.Serializable;

public class Employee implements  Serializable {
int id;
String name;
double salary;
transient int password;
Employee(int id,String str,double salary, int password){
	this.id= id;
	this.name = str;
	this.password= password;
	this.salary = salary;
	
	
}
	

}
