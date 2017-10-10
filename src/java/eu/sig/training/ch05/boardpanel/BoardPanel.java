package eu.sig.training.ch05.boardpanel;

import java.awt.Graphics;
import java.util.List;

public class BoardPanel {
  
    private void render(Square square, Graphics g, Point xy, Point wh) {
        square.getSprite().draw(g, xy, wh);
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, xy, wh);
        }
    }
   

    private class Sprite {
        public void draw(Graphics g, Point xy, Point wh) {

        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }

    }

}
