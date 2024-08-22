package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list;

    @BeforeEach
    void init(){
       list = new StudentList();
    }

    @Test
    void checkAddNewStudent(){
        list.addNewStudent("6610402078", "M");
        assertNotNull(list.findStudentById("6610402078"));
        list.addNewStudent("6510402078", "Tan");
        assertNull(list.findStudentById("6690402078"));
    }

    @Test
    void checkFindStudentById(){
        list.addNewStudent("6610402078", "M");
        assertNotNull(list.findStudentById("6610402078"));
        assertNull(list.findStudentById("6650402333"));
    }

    @Test
    void checkGiveScoreToId(){
        list.addNewStudent("6610402078", "M");
        list.giveScoreToId("6610402078", 100);
        assertEquals("A", list.viewGradeOfId("6610402078"));
        list.addNewStudent("6650402078", "Jate");
        list.giveScoreToId("6690402078", 500);
        assertEquals("F", list.viewGradeOfId("6650402078"));
    }

    @Test
    void checkViewGradeOfId(){
        list.addNewStudent("6610402078", "M", 30);
        list.giveScoreToId("6610402078", 90);
        assertEquals("A", list.viewGradeOfId("6610402078"));
        list.addNewStudent("6650402078", "Jate", 10);
        assertEquals("F", list.viewGradeOfId("6650402078"));
        assertNull(list.viewGradeOfId("66504020799"));
    }

    @Test
    void checkGetStudent(){
        assertEquals(0, list.getStudents().size());
        list.addNewStudent("6610402078", "M");
        list.addNewStudent("5510903978", "Tan");
        assertEquals(2, list.getStudents().size());
    }
}