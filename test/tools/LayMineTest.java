package tools;

import bean.MineLable;
import org.junit.Test;

import static org.junit.Assert.*;

public class LayMineTest {
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
        StaticTool.allrow = 9; StaticTool.allcol = 9; StaticTool.allcount = 10;
        MineLable[][] labels = createLabels(StaticTool.allrow, StaticTool.allcol);
        MineLable[][] results = LayBomb.lay(labels, 0, 0);
        assertEquals(StaticTool.allcount, countMine(results));
        assertFalse(results[0][0].isMineTag());
    }

    @Test
    public void test2(){
        StaticTool.allrow = 9; StaticTool.allcol = 9; StaticTool.allcount = 10;
        MineLable[][] labels = createLabels(StaticTool.allrow, StaticTool.allcol);
        MineLable[][] results = LayBomb.lay(labels, 4, 5);
        assertEquals(StaticTool.allcount, countMine(results));
        assertFalse(results[4][5].isMineTag());
    }
}
