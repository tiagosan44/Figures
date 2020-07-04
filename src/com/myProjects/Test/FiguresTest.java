package com.myProjects.Test;

import com.myProjects.Figure;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FiguresTest {

    @Test
    public void drawSquare() {
        StringBuilder square = new StringBuilder()
                .append("*****").append(Figure.LINE_BREAK)
                .append("*****").append(Figure.LINE_BREAK)
                .append("*****").append(Figure.LINE_BREAK)
                .append("*****").append(Figure.LINE_BREAK)
                .append("*****").append(Figure.LINE_BREAK);
        assertThat(square.toString(), is(Figure.square(5)));
    }

    @Test
    public void drawTriangle(){
        StringBuilder triangle = new StringBuilder()
                .append("    *").append(Figure.LINE_BREAK)
                .append("   ***").append(Figure.LINE_BREAK)
                .append("  *****").append(Figure.LINE_BREAK)
                .append(" *******").append(Figure.LINE_BREAK)
                .append("*********").append(Figure.LINE_BREAK);
        assertThat(triangle.toString(), is(Figure.triangle(5)));
    }

    @Test
    public void drawDiamond(){
        StringBuilder diamond = new StringBuilder()
                .append("    *").append(Figure.LINE_BREAK)
                .append("   ***").append(Figure.LINE_BREAK)
                .append("  *****").append(Figure.LINE_BREAK)
                .append(" *******").append(Figure.LINE_BREAK)
                .append("*********").append(Figure.LINE_BREAK)
                .append(" *******").append(Figure.LINE_BREAK)
                .append("  *****").append(Figure.LINE_BREAK)
                .append("   ***").append(Figure.LINE_BREAK)
                .append("    *").append(Figure.LINE_BREAK);
        assertThat(diamond.toString(), is(Figure.diamond(5)));
    }
}
