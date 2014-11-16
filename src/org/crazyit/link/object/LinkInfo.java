package org.crazyit.link.object;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Point;

public class LinkInfo {
	//集合保存连接点
	private List<Point> points = new ArrayList<Point>();
	//提供第一个构造器，表示两个Point可以直接相连，没有转折点
	public LinkInfo(Point p1 , Point p2){
		points.add(p1);
		points.add(p2);
	}
	
	public LinkInfo(Point p1 , Point p2 , Point p3){
		points.add(p1);
		points.add(p2);
		points.add(p3);
	}
	
	public LinkInfo(Point p1 , Point p2 , Point p3 ,Point p4){
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
	}
	
	public List<Point> getLinkPoints(){
		return points;
	}
}
