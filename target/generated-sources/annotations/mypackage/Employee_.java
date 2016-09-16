package mypackage;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mypackage.Student;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-16T10:55:36")
@StaticMetamodel(Employee.class)
public class Employee_ extends Person_ {

    public static volatile SingularAttribute<Employee, String> taxClass;
    public static volatile ListAttribute<Employee, Student> supervised;
    public static volatile SingularAttribute<Employee, Integer> soSecNr;
    public static volatile SingularAttribute<Employee, Float> wage;

}