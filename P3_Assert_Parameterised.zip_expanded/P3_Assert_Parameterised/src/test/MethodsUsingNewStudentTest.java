package test;

import static org.junit.Assert.*;

import org.junit.Test;

import application.MethodsUsingNewStudent;
import application.NewStudent;

public class MethodsUsingNewStudentTest {

	MethodsUsingNewStudent muns = new MethodsUsingNewStudent();
	
	@Test
	public void testFindStudentWithNameYes() {
		NewStudent[] stuArray = new NewStudent[4];
		stuArray[0] = new NewStudent("Peter Lee", 30);
		stuArray[1] = new NewStudent("Tan Ah Kow", 40);
		stuArray[2] = new NewStudent("Chris Goh", 20);
		stuArray[3] = new NewStudent("Yap Ah Lian", 10);
		
		String startStr = "P";
		NewStudent AR = muns.findStudentWithName(stuArray, startStr);
		assertEquals("Found name", stuArray[0], AR);
	}
	
	@Test
	public void testFindStudentWithNameNo() {
		NewStudent[] stuArray = new NewStudent[4];
		stuArray[0] = new NewStudent("Peter Lee", 30);
		stuArray[1] = new NewStudent("Tan Ah Kow", 40);
		stuArray[2] = new NewStudent("Chris Goh", 20);
		stuArray[3] = new NewStudent("Yap Ah Lian", 10);
		
		String startStr = "K";
		NewStudent AR = muns.findStudentWithName(stuArray, startStr);
		assertNull("Student not found", AR);
	}
	
	@Test
	public void testFindOverAgedStudents() {
		NewStudent[] stuArray = new NewStudent[4];
		stuArray[0] = new NewStudent("Peter Lee", 30);
		stuArray[1] = new NewStudent("Tan Ah Kow", 40);
		stuArray[2] = new NewStudent("Chris Goh", 20);
		stuArray[3] = new NewStudent("Yap Ah Lian", 10);
		
		int ageLimit = 20;
		
		NewStudent[] studArray = new NewStudent[2];
		studArray[0] = new NewStudent("Peter Lee", 30);
		studArray[1] = new NewStudent("Tan Ah Kow", 40);
		NewStudent[] AR = muns.findOverAgedStudents(stuArray, ageLimit);
		assertArrayEquals(studArray, AR);
	}
	

}
