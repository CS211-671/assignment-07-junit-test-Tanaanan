package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6xxxxxxx", "kong");
    }

    @Test
    void testAddScore(){
//        Student s1 = new Student("6xxxxxxxxx", "kong");
        s1.addScore(40);
        assertEquals(40, s1.getScore());
        s1.addScore(30);
        assertEquals(70, s1.getScore());
    }

    @Test
    void TestCalculateGrade(){
//        Student s1 = new Student("6xxxxxxx", "kong", 50);
        s1.addScore(40);
        assertEquals("F", s1.grade());
        s1.addScore(10);
        assertEquals("D", s1.grade());
        s1.addScore(10);
        assertEquals("C", s1.grade());
        s1.addScore(10);
        assertEquals("B", s1.grade());
        s1.addScore(10);
        assertEquals("A", s1.grade());
    }

    @Test
    void TestChangeName(){
        s1.changeName("Jatesada");
        assertEquals("Jatesada", s1.getName());
    }


}