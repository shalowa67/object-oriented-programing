package com.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    @Test
    void testUpdateGrade() {
        // Arrange
        Student student = new Student("Alice", 80);

        // Act
        student.updateGrade(150);

        // Assert
        assertEquals(100, student.getGrade());
    }
}
