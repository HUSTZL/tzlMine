package tools;

import bean.MineLable;
import org.junit.Test;

import static org.junit.Assert.*;

public class computeBombTest {
    private MineLable[][] createLabels(int row, int col) {
        MineLable[][] labels = new MineLable[row][col];
        for (int i = 0; i < labels.length; i++) {
            for (int j = 0; j < labels[i].length; j++) {
                labels[i][j] = new MineLable(i, j);
            }
        }
        return labels;
    }

    @Test
    public void test1(){
        StaticTool.allrow = 2; StaticTool.allcol = 2;
        MineLable[][] labels = createLabels(StaticTool.allrow, StaticTool.allcol);
        labels[0][0].setMineTag(true);
        labels[1][1].setMineTag(true);

        MineLable[][] results = LayBomb.computeBomb(labels);

        assertEquals(results[0][0].getCounAround(), 0);
        assertEquals(results[0][1].getCounAround(), 2);
        assertEquals(results[1][0].getCounAround(), 2);
        assertEquals(results[1][1].getCounAround(), 0);
    }

    @Test
    public void test2(){
        StaticTool.allrow = 4; StaticTool.allcol = 4;
        MineLable[][] labels = createLabels(StaticTool.allrow, StaticTool.allcol);
        labels[0][0].setMineTag(true);
        labels[1][0].setMineTag(true);
        labels[1][1].setMineTag(true);
        labels[3][2].setMineTag(true);

        MineLable[][] results = LayBomb.computeBomb(labels);

        assertEquals(results[0][0].getCounAround(), 0);
        assertEquals(results[1][1].getCounAround(), 0);
        assertEquals(results[0][1].getCounAround(), 3);
        assertEquals(results[2][1].getCounAround(), 3);
        assertEquals(results[1][2].getCounAround(), 1);
        assertEquals(results[2][3].getCounAround(), 1);
        assertEquals(results[3][0].getCounAround(), 0);
    }
}
