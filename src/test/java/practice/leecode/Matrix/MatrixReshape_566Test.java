package practice.leecode.Matrix;

import org.junit.Test;
import practice.leecode.Matrix.MatrixReshape_566;

import static org.junit.Assert.*;

public class MatrixReshape_566Test {

    @Test
    public void matrixReshape_1() {
        MatrixReshape_566 matrixReshape_566 = new MatrixReshape_566();
        assertArrayEquals(new int[][]{{1,2,3,4}}, matrixReshape_566.matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4));
    }

    @Test
    public void matrixReshape_2() {
        MatrixReshape_566 matrixReshape_566 = new MatrixReshape_566();
        assertArrayEquals(new int[][]{{1,2},{3,4}}, matrixReshape_566.matrixReshape(new int[][]{{1,2},{3,4}}, 2, 4));
    }

}