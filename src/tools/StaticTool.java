package tools;

import java.util.TreeSet;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import bean.HeroBean;
import bean.MineLable;

public class StaticTool {

	public static int allcount = 10;
	public static int allcol = 9;
	public static int allrow = 9;
	public static int timecount = 0;
	public static int bombCount = allcount;

	public static boolean isStart = false;
	public static boolean isHole = false;

	public static Icon[] num = new Icon[10];
	public static Icon[] time = new Icon[11];

	public static ImageIcon imageIcon = new ImageIcon("./image/icon.gif");
	public static Icon iconBlank = new ImageIcon("./image/blank.gif");
	public static Icon bloodIcon = new ImageIcon("./image/blood.gif");
	public static Icon icon0 = new ImageIcon("./image/0.gif");
	public static Icon clickIcon = new ImageIcon("./image/face2.gif");
	public static Icon smileIcon = new ImageIcon("./image/face0.gif");
	public static Icon faultFaceIcon = new ImageIcon("./image/face3.gif");
	public static Icon winFaceIcon = new ImageIcon("./image/face4.gif");
	public static Icon flagIcon = new ImageIcon("./image/flag.gif");
	public static Icon askIcon = new ImageIcon("./image/ask.gif");
	public static Icon askPressIcon = new ImageIcon("./image/ask1.gif");
	public static Icon downSmileIcon = new ImageIcon("./image/face1.gif");
	public static Icon errorBombIcon = new ImageIcon("./image/error.gif");
	public static Icon blackBombIcon = new ImageIcon("./image/mine.gif");
	public static Icon holeIcon = new ImageIcon("./image/hole.gif");

	static {

		for (int i = 0; i < num.length; i++) {
			num[i] = new ImageIcon("./image/" + i + ".gif");
		}
		for (int j = 0; j <= num.length; j++) {
			time[j] = new ImageIcon("./image/d" + j + ".gif");
		}

	}

	public static TreeSet<HeroBean> treeSetC = new TreeSet<HeroBean>();
	public static TreeSet<HeroBean> treeSetZ = new TreeSet<HeroBean>();
	public static TreeSet<HeroBean> treeSetG = new TreeSet<HeroBean>();

	public static void HeroSet(HeroBean heroBean) {
		if (getLevel() == 1){
			treeSetC.add(heroBean);
		}
		else if (getLevel() == 2) {
			treeSetZ.add(heroBean);
		}
		else if (getLevel() == 3) {
			treeSetG.add(heroBean);
		}
	}

	static {

		treeSetC.add(new HeroBean(999, "ÄäÃû"));
		treeSetZ.add(new HeroBean(999, "ÄäÃû"));
		treeSetG.add(new HeroBean(999, "ÄäÃû"));

	}

	public static void setLevel(int level, int row, int col, int mine) {
		if (level == 1) {
			StaticTool.allrow = 9;
			StaticTool.allcol = 9;
			StaticTool.allcount = 10;
		}
		else if (level == 2) {
			StaticTool.allrow = 16;
			StaticTool.allcol = 16;
			StaticTool.allcount = 40;
		}
		else if (level == 3) {
			StaticTool.allrow = 16;
			StaticTool.allcol = 30;
			StaticTool.allcount = 99;
		}
		else if (level == 0) {
			StaticTool.allrow = row;
			StaticTool.allcol = col;
			StaticTool.allcount = mine;
		}
	}

	public static int getLevel() {
		if (allrow == 9 && allcol == 9 && allcount == 10) {
			return 1;
		} else if (allrow == 16 && allcol == 16 && allcount == 40) {
			return 2;
		} else if (allrow == 16 && allcol == 30 && allcount == 99) {
			return 3;
		} else {
			return 0;
		}
	}

	public static boolean checkWin(MineLable[][] lable) {
		int needCount = allrow * allcol - allcount;
		int expendCount = 0;

		for (int i = 0; i < lable.length; i++) {
			for (int j = 0; j < lable[i].length; j++) {
				if (lable[i][j].isExpendTag()) {
					expendCount++;
				}
			}
		}

		return needCount == expendCount;
	}

}
