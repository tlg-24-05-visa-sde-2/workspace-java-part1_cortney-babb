package com.hr.client;

import com.hr.Employee;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) /*throws DestinationUnreachableException*/ {
        Employee emp = new Employee("Cortney");

//        emp.goToWork();

        // OPTION 2 & 3 ( from Employee ) - w.o a catch
//        try {
//            emp.goToWork();
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e);
//        }
           try {
                emp.goToWork();
        } catch (WorkException e) {
//            System.out.println(e);
//               System.out.println(e.getMessage()); // extract "reason string"
//               System.out.println(e.getCause()); // extract the nested 'cause'
               e.printStackTrace();
        }


    }
}