package studentAssignment1;

import java.util.List;
import studentAssignment.Student;
import studentException.DataNotPresentException;
import studentException.StudentNotFoundException;

public interface StudentDAO {

	// Add student
	// Access Modifier Return Type Name of the method
	// (Method accepts Student type argument)
	public String addStudent(Student student) throws DataNotPresentException;

	// Read All Students
	public List<Student> getAllStudents();

	// Display student city name sorted
	public List<Student> getStudentByCity(String city) throws StudentNotFoundException;

	// display or get students on the basis of given student id method and handle
	// student not found exception
	public Student getStudentById(Integer id) throws StudentNotFoundException;
}
 