package Creational.factory;

import Creational.factory.classes.CustomerImpl;
import Creational.factory.classes.StudentImpl;
import Creational.factory.classes.SuperFactory;

public class Factory {
    private static Factory factory;

    private Factory(){

    }

    public static Factory getFactory(){
        return factory == null ? new Factory() : factory;
    }

    public enum FactoryType{
        STUDENT,CUSTOMER
    }

    public SuperFactory getInstance(FactoryType type){
        switch (type){
            case CUSTOMER:
                return new CustomerImpl();
            case STUDENT:
                return new StudentImpl();
            default:
                return null;
                //check branch
        }
    }
}
