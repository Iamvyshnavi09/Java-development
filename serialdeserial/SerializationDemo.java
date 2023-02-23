package serialdeserial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos;
		ObjectOutputStream Os;
		fos = new FileOutputStream("C:\\Users\\hp\\Documents\\Employee");
		Os = new ObjectOutputStream(fos);
		Employee emp = new Employee(19,"Vyshnavi",30000,5486);
		Os.writeObject(emp);
		System.out.println("Employee object is serializable");

	}

}
