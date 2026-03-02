package FactoryPattern.EmployeePattern;

public class EmployeePattern {
    public static Employee GetSalary(String s){
        Employee e=null;
        if(s.equalsIgnoreCase("AndriodDeveloper")){
            e=new AndriodDeveloper();
        }else if (s.equalsIgnoreCase("WebDeveloper")){
            e=new WebDeveloper();
        }
        return e;
    }
}
