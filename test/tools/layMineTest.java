package tools;

import bean.MineLable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class layMineTest {
    private int countMine(MineLable[][] lable) {
        int count = 0;
        for (int i = 0; i < lable.length; i++) {
            for (int j = 0; j < lable[i].length; j++) {
                if (lable[i][j].isMineTag() == true) {
                    count ++;
                }
            }
        }
        return count;
    }

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
        MineLable[][] labels = createLabels(StaticTool.allrow, StaticTool.allcol);
        MineLable[][] results = LayBomb.lay(labels, 0, 0);
        assertEquals(StaticTool.allcount, countMine(results));
        assertFalse(results[0][0].isMineTag());
    }

    @Test
    public void test2(){
        MineLable[][] labels = createLabels(StaticTool.allrow, StaticTool.allcol);
        MineLable[][] results = LayBomb.lay(labels, 4, 5);
        assertEquals(StaticTool.allcount, countMine(results));
        assertFalse(results[4][5].isMineTag());
    }
}
