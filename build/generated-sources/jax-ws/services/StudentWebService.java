
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentWebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentWebService {


    /**
     * 
     * @param name
     * @param gpa
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateStudent", targetNamespace = "http://services/", className = "services.UpdateStudent")
    @ResponseWrapper(localName = "updateStudentResponse", targetNamespace = "http://services/", className = "services.UpdateStudentResponse")
    @Action(input = "http://services/StudentWebService/updateStudentRequest", output = "http://services/StudentWebService/updateStudentResponse")
    public String updateStudent(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "gpa", targetNamespace = "")
        double gpa);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeStudent", targetNamespace = "http://services/", className = "services.RemoveStudent")
    @ResponseWrapper(localName = "removeStudentResponse", targetNamespace = "http://services/", className = "services.RemoveStudentResponse")
    @Action(input = "http://services/StudentWebService/removeStudentRequest", output = "http://services/StudentWebService/removeStudentResponse")
    public String removeStudent(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param name
     * @param gpa
     * @param id
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertStudent", targetNamespace = "http://services/", className = "services.InsertStudent")
    @ResponseWrapper(localName = "insertStudentResponse", targetNamespace = "http://services/", className = "services.InsertStudentResponse")
    @Action(input = "http://services/StudentWebService/insertStudentRequest", output = "http://services/StudentWebService/insertStudentResponse")
    public int insertStudent(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "gpa", targetNamespace = "")
        double gpa);

    /**
     * 
     * @param id
     * @return
     *     returns services.Student
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findStudentById", targetNamespace = "http://services/", className = "services.FindStudentById")
    @ResponseWrapper(localName = "findStudentByIdResponse", targetNamespace = "http://services/", className = "services.FindStudentByIdResponse")
    @Action(input = "http://services/StudentWebService/findStudentByIdRequest", output = "http://services/StudentWebService/findStudentByIdResponse")
    public Student findStudentById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List&lt;services.Student&gt;
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllStudent", targetNamespace = "http://services/", className = "services.FindAllStudent")
    @ResponseWrapper(localName = "findAllStudentResponse", targetNamespace = "http://services/", className = "services.FindAllStudentResponse")
    @Action(input = "http://services/StudentWebService/findAllStudentRequest", output = "http://services/StudentWebService/findAllStudentResponse")
    public List<Student> findAllStudent();

}
