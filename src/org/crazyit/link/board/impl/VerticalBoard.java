package org.crazyit.link.board.impl;

import java.util.ArrayList;
import java.util.List;

import org.crazyit.link.board.AbstractBoard;
import org.crazyit.link.object.GameConf;
import org.crazyit.link.view.Piece;

public class VerticalBoard extends AbstractBoard{

	@Override
	public List<Piece> createPieces(GameConf config, Piece[][] pieces) {
		// TODO Auto-generated method stub
		List<Piece> notNullPieces = new ArrayList<Piece>();
		for(int i=1 ;i<pieces.length ; i++){
			for(int j=1 ; j<pieces.length ; j++){
				if(i%2==0){
					Piece piece = new Piece(i,j);
					notNullPieces.add(piece);
				}
			}
		}
		return notNullPieces;
	}
}
