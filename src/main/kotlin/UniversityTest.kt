import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UniversityTest {

    @Test
    fun testAddStudent() {
        var university = University()
        val student = Student("0", "emma", "comp sci", 0)
        university.addStudent(student)
        assertEquals(1, university.studentList.size)
        assertEquals("0" , university.studentList[0].id)
    }

    @Test
    fun findStudentByID() {

    }

}