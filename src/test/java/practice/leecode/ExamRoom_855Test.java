package practice.leecode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExamRoom_855Test {

    @Test
    public void seat() {
        ExamRoom_855 examRoom = new ExamRoom_855(10);
        assertEquals(0, examRoom.seat());
        assertEquals(9, examRoom.seat());
        assertEquals(4, examRoom.seat());
        assertEquals(2, examRoom.seat());

        int in = examRoom.getIn();
        examRoom.leave(4);
        assertEquals(in - 1, examRoom.getIn());

        assertEquals(5, examRoom.seat());
    }

    @Test
    public void leave() {
    }
}