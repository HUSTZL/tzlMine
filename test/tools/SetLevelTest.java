package tools;

import bean.HeroBean;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SetLevelTest {
    @Test
    public void test1(){
        StaticTool.setLevel(1, 0, 0, 0);
        assertEquals(StaticTool.allcol, 9);
        assertEquals(StaticTool.allrow, 9);
        assertEquals(StaticTool.allcount, 10);
        assertEquals(StaticTool.getLevel(), 1);
    }

    @Test
    public void test2(){
        StaticTool.setLevel(2, 0, 0, 0);
        assertEquals(StaticTool.allrow, 16);
        assertEquals(StaticTool.allcol, 16);
        assertEquals(StaticTool.allcount, 40);
        assertEquals(StaticTool.getLevel(), 2);
    }

    @Test
    public void test3(){
        StaticTool.setLevel(3, 0, 0, 0);
        assertEquals(StaticTool.allrow, 16);
        assertEquals(StaticTool.allcol, 30);
        assertEquals(StaticTool.allcount, 99);
        assertEquals(StaticTool.getLevel(), 3);
    }

    @Test
    public void test4(){
        StaticTool.setLevel(0, 5, 6, 10);
        assertEquals(StaticTool.allrow, 5);
        assertEquals(StaticTool.allcol, 6);
        assertEquals(StaticTool.allcount, 10);
        assertEquals(StaticTool.getLevel(), 0);
    }
}
