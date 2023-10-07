package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }
    @Test
    void sixtyShouldReturnD(){
        var grader = new Grader();
        assertEquals('D', grader.determineLetterGrade(60));
    }

    @Test
    void negativeOneShouldReturnIllegalARgumentException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () ->{ grader.determineLetterGrade(-1);});

    }



}