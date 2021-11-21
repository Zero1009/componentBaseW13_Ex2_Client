/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentbasew13_ex2_client;

import java.util.List;

/**
 *
 * @author Theerakan
 */
public class ComponentBaseW13_Ex2_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int std = insertStudent(61050959, "John Doe", 3.00);
      //String std = updateStudent(61050959, "John Doe", 2.00);
       //services.Student std = findStudentById(61050210);
       //String std = removeStudent(61050959);
       System.out.println(std);
       
        
    }
    
    private static services.Student findStudentById(int id){
        
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.findStudentById(id);
    }
    
    private static int insertStudent(int id, String name, double gpa){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.insertStudent(id, name, gpa);
    }
    
    private static String updateStudent(int id, String name, double gpa){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.updateStudent(id, name, gpa);
    }
    
    private static String removeStudent(int id){
        services.StudentWebService_Service service = new services.StudentWebService_Service();
        services.StudentWebService port = service.getStudentWebServicePort();
        return port.removeStudent(id);
    }
    
   
    
    
    
}
