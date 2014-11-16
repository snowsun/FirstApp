package org.crazyit.link.view;

import android.graphics.Point;


public class Piece 
{ 
	private PieceImage image;
	private int beginX;
	private int beginY;
	private int indexX;
	private int indexY;
	
	public Piece(int indexX , int indexY){
		this.indexX = indexX;
		this.indexY = indexY;
	}
	
	public int getBeginX(){
		return beginX;
	}
	public void setBeginX(int beginX){
		this.beginX = beginX;
	}
	
	public boolean isSameImage(Piece other){
		if(image == null){
			if(other.image != null)
				return false;
		}
		
		return image.getImageId() == other.image.getImageId();
	}

	public PieceImage getImage() {
		return image;
	}

	public void setImage(PieceImage image) {
		this.image = image;
	}

	public int getBeginY() {
		return beginY;
	}

	public void setBeginY(int beginY) {
		this.beginY = beginY;
	}

	public int getIndexX() {
		return indexX;
	}

	public void setIndexX(int indexX) {
		this.indexX = indexX;
	}

	public int getIndexY() {
		return indexY;
	}

	public void setIndexY(int indexY) {
		this.indexY = indexY;
	}
	
	public Point getCenter()  
	{     
	     //Piece对象的中心是该图片的宽高+该图片对应的左上角的x、y坐标  
	    return new Point(getImage().getImage().getWidth() / 2  
	          + getBeginX(), getBeginY()  
	          + getImage().getImage().getHeight() / 2);  
    }   

}
