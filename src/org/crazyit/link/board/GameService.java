package org.crazyit.link.board;

import org.crazyit.link.object.LinkInfo;
import org.crazyit.link.view.Piece;

public interface GameService {   
    void start();  
    Piece[][] getPieces();    
    boolean hasPieces();   
    Piece findPiece(float touchX, float touchY);   
    LinkInfo link(Piece p1, Piece p2);  
}  
