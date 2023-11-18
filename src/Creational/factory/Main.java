package Creational.factory;

import Creational.factory.classes.Customer;
import Creational.factory.classes.Student;

public class Main {
    public static void main(String[] args) {
        Student student = (Student) Factory.getFactory().getInstance(Factory.FactoryType.STUDENT);
        Customer customer = (Customer) Factory.getFactory().getInstance(Factory.FactoryType.CUSTOMER);

        System.out.println(student.getStudent());
        System.out.println(customer.getCustomer());
    }
}
