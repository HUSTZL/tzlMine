package tools;

import bean.MineLable;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckWinTest {
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
        StaticTool.allrow = 2; StaticTool.allcol = 2; StaticTool.allcount = 2;
        MineLable[][] labels = createLabels(StaticTool.allrow, StaticTool.allcol);
        labels[1][0].setMineTag(true);
        labels[0][1].setMineTag(true);
        labels[0][0].setExpendTag(true);
        labels[1][1].setExpendTag(true);

        assertTrue(StaticTool.checkWin(labels));
    }

    @Test
    public void test2(){
        StaticTool.allrow = 4; StaticTool.allcol = 4; StaticTool.allcount = 8;
        MineLable[][] labels = createLabels(StaticTool.allrow, StaticTool.allcol);
        labels[2][0].setMineTag(true);
        labels[2][1].setMineTag(true);
        labels[2][2].setMineTag(true);
        labels[1][2].setMineTag(true);
        labels[0][2].setMineTag(true);
        labels[2][2].setMineTag(true);
        labels[3][3].setMineTag(true);
        labels[3][1].setMineTag(true);
        labels[0][0].setExpendTag(true);
        labels[0][1].setExpendTag(true);
        labels[1][0].setExpendTag(true);
        labels[1][1].setExpendTag(true);
        labels[3][2].setExpendTag(true);

        assertFalse(StaticTool.checkWin(labels));
    }
}
