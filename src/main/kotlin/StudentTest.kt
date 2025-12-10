import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StudentTest {

    @Test
    fun testSetter0() {
        val student = Student("0", "emma", "comp sci", 0)
        assertEquals(0, student.mark)
    }

    @Test
    fun testSetter1() {
        val student = Student("0", "emma", "comp sci", 1)
        assertEquals(1, student.mark)
    }

    @Test
    fun testSetter100() {
        val student = Student("0", "emma", "comp sci", 100)
        assertEquals(100, student.mark)
    }

    @Test
    fun testSetter101() {
        val student = Student("0", "emma", "comp sci", 101)
        assertEquals(0, student.mark)
    }

    @Test
    fun testGetGrade0() {
        val student = Student("0", "emma", "comp sci", 0)
        assertEquals("Fail", student.getGrade())
    }

    @Test
    fun testGetGrade39() {
        val student = Student("0", "emma", "comp sci", 39)
        assertEquals("Fail", student.getGrade())
    }

    @Test
    fun testGetGrade40() {
        val student = Student("0", "emma", "comp sci", 40)
        assertEquals("Third", student.getGrade())
    }

    @Test
    fun testGetGrade49() {
        val student = Student("0", "emma", "comp sci", 49)
        assertEquals("Third", student.getGrade())
    }

    @Test
    fun testGetGrade50() {
        val student = Student("0", "emma", "comp sci", 50)
        assertEquals("2/2", student.getGrade())
    }

    @Test
    fun testGetGrade59() {
        val student = Student("0", "emma", "comp sci", 59)
        assertEquals("2/2", student.getGrade())
    }

    @Test
    fun testGetGrade60() {
        val student = Student("0", "emma", "comp sci", 60)
        assertEquals("2/1", student.getGrade())
    }

    @Test
    fun testGetGrade69() {
        val student = Student("0", "emma", "comp sci", 69)
        assertEquals("2/1", student.getGrade())
    }

    @Test
    fun testGetGrade70() {
        val student = Student("0", "emma", "comp sci", 70)
        assertEquals("First", student.getGrade())
    }

    @Test
    fun testGetGrade100() {
        val student = Student("0", "emma", "comp sci", 100)
        assertEquals("First", student.getGrade())
    }
}