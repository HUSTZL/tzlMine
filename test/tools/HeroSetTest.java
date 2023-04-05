package tools;

import bean.HeroBean;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class HeroSetTest {
    @Before
    public void beforeTest() {
        StaticTool.treeSetC = new TreeSet<HeroBean>();
        StaticTool.treeSetZ = new TreeSet<HeroBean>();
        StaticTool.treeSetG = new TreeSet<HeroBean>();
    }

    @Test
    public void test1(){
        StaticTool.setLevel(1, 0, 0, 0);
        StaticTool.HeroSet(new HeroBean(300, "Fengxuan"));
        StaticTool.HeroSet(new HeroBean(200, "Mingchen"));
        StaticTool.HeroSet(new HeroBean(100, "Haofei"));

        assertEquals(StaticTool.treeSetC.size(), 3);
        int i = 0;
        for (Iterator iter = StaticTool.treeSetC.iterator(); iter.hasNext(); ) {
            i += 1;
            if (i == 1) {
                HeroBean heroBean = (HeroBean)iter.next();
                assertEquals(heroBean.getTime(), 100);
                assertEquals(heroBean.getName(), "Haofei");
            }
            else if (i == 2) {
                HeroBean heroBean = (HeroBean)iter.next();
                assertEquals(heroBean.getTime(), 200);
                assertEquals(heroBean.getName(), "Mingchen");
            }
            else if (i == 3) {
                HeroBean heroBean = (HeroBean)iter.next();
                assertEquals(heroBean.getTime(), 300);
                assertEquals(heroBean.getName(), "Fengxuan");
            }
        }
    }

    @Test
    public void test2(){
        StaticTool.setLevel(2, 0, 0, 0);
        StaticTool.HeroSet(new HeroBean(300, "Fengxuan"));
        StaticTool.HeroSet(new HeroBean(200, "Mingchen"));
        StaticTool.HeroSet(new HeroBean(100, "Haofei"));

        assertEquals(StaticTool.treeSetZ.size(), 3);
        int i = 0;
        for (Iterator iter = StaticTool.treeSetZ.iterator(); iter.hasNext(); ) {
            i += 1;
            if (i == 1) {
                HeroBean heroBean = (HeroBean)iter.next();
                assertEquals(heroBean.getTime(), 100);
                assertEquals(heroBean.getName(), "Haofei");
            }
            else if (i == 2) {
                HeroBean heroBean = (HeroBean)iter.next();
                assertEquals(heroBean.getTime(), 200);
                assertEquals(heroBean.getName(), "Mingchen");
            }
            else if (i == 3) {
                HeroBean heroBean = (HeroBean)iter.next();
                assertEquals(heroBean.getTime(), 300);
                assertEquals(heroBean.getName(), "Fengxuan");
            }
        }
    }

    @Test
    public void test3(){
        StaticTool.setLevel(3, 0, 0, 0);
        StaticTool.HeroSet(new HeroBean(300, "Fengxuan"));
        StaticTool.HeroSet(new HeroBean(200, "Mingchen"));
        StaticTool.HeroSet(new HeroBean(100, "Haofei"));

        assertEquals(StaticTool.treeSetG.size(), 3);
        int i = 0;
        for (Iterator iter = StaticTool.treeSetG.iterator(); iter.hasNext(); ) {
            i += 1;
            if (i == 1) {
                HeroBean heroBean = (HeroBean)iter.next();
                assertEquals(heroBean.getTime(), 100);
                assertEquals(heroBean.getName(), "Haofei");
            }
            else if (i == 2) {
                HeroBean heroBean = (HeroBean)iter.next();
                assertEquals(heroBean.getTime(), 200);
                assertEquals(heroBean.getName(), "Mingchen");
            }
            else if (i == 3) {
                HeroBean heroBean = (HeroBean)iter.next();
                assertEquals(heroBean.getTime(), 300);
                assertEquals(heroBean.getName(), "Fengxuan");
            }
        }
    }
}
