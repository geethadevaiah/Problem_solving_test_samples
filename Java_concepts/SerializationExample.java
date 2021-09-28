package Java_concepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample
{

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Employee empObj = new Employee("Shanti", "Prasad", "Sharma", 25, "IT");
        System.out.println("Object before serialization  => " + empObj.toString());

        // Serialization
        serialize(empObj);

        // Deserialization
        Employee deserialisedEmpObj = deserialize();
        System.out.println("Object after deserialization => " + deserialisedEmpObj.toString());
    }

    // Serialization code
    static void serialize(Employee empObj) throws IOException
    {
        try (FileOutputStream fos = new FileOutputStream("data.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(empObj);
        }
    }

    // Deserialization code
    static Employee deserialize() throws IOException, ClassNotFoundException
    {
        try (FileInputStream fis = new FileInputStream("data.obj");
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            return (Employee) ois.readObject();
        }
    }

    // If we use Serializable interface, static and transient variables do not get serialized
    static class Employee implements Serializable
    {
        // This serialVersionUID field is necessary for Serializable as well as Externalizable to provide version control,
        // Compiler will provide this field if we do not provide it which might change if we modify class structure of our class, and we will get InvalidClassException,
        // If we provide a value to this field and do not change it, serialization-deserialization will not fail if we change our class structure.
        private static final long serialVersionUID = 2L;

        private final String firstName; // Serialization process do not invoke the constructor but it can assign values to final fields
        private transient String middleName; // transient variables will not be serialized, serialised object holds null
        private String lastName;
        private int age;
        private static String department; // static variables will not be serialized, serialised object holds null

        public Employee(String firstName, String middleName, String lastName, int age, String department)
        {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.age = age;
            Employee.department = department;

            validateAge();
        }

        private void validateAge()
        {
            System.out.println("Validating age.");

            if (age < 18 || age > 70)
            {
                throw new IllegalArgumentException("Not a valid age to create an employee");
            }
        }

        // Custom serialization logic,
        // This will allow us to have additional serialization logic on top of the default one e.g. encrypting object before serialization
        private void writeObject(ObjectOutputStream oos) throws IOException
        {
            System.out.println("Custom serialization logic invoked.");
            oos.defaultWriteObject(); // Calling the default serialization logic
        }

        // Custom deserialization logic
        // This will allow us to have additional deserialization logic on top of the default one e.g. decrypting object after deserialization
        private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException
        {
            System.out.println("Custom deserialization logic invoked.");

            ois.defaultReadObject(); // Calling the default deserialization logic

            // Age validation is just an example but there might some scenario where we might need to write some custom deserialization logic
            validateAge();
        }

        @Override
        public String toString()
        {
            return String.format("Employee {firstName='%s', middleName='%s', lastName='%s', age='%s', department='%s'}", firstName, middleName, lastName, age, department);
        }
    }
}