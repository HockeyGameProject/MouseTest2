import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Main Controller class for the game. It calls update() and step()
 * @author Aditi Datta
 */

//test1
public class Controller {
    UI ui;
    Rink rink;
    Player p1;
    Player p2;
    Player p3;
    Player p4;

    MouseEvent e;
    ArrayList<Player> teamProfile1 = new ArrayList<>(2);
    public Controller(){
        ui      = new UI("Hockey");


        // Moving objects
        // CREATING PLAYERS AND GOALIES
        p1   = new Player(0,new Point(480, 275), 5, 3*Math.PI - 0.323599, 20, Color.RED);


        p2   = new Player(1,new Point(690, 370), 5, 3*Math.PI - 0.323599, 20, Color.GREEN);
        p3   = new Player(2,new Point(320, 170), 5, 4*Math.PI - 0.323599, 20, Color.MAGENTA);
        p4   = new Player(3,new Point(530, 275), 5, 4*Math.PI - 0.323599, 20, Color.BLUE);
        teamProfile1.add(p1);
        teamProfile1.add(p2);

        rink    = new Rink();


        //s1.setPlayer(p1);
        // GIVING PUCK REFERENCE TO GOALIES


        // ADDING OBJECTS TO THE RINK

        rink.add(p1);
       // rink.add(s2);
        rink.add(p2);
        //rink.add(s3);
        rink.add(p3);
        //rink.add(s4);
        rink.add(p4);
        //rink.add(s5);
        Rink.selectedPlayer = p1;
        rink.addMouseMotionListener(rink);
      ; rink.addKeyListener(new KBListener());
        // added moving objects

        ui.add(rink);
        ui.pack();
        ui.setVisible(true);

    }

    private class KBListener implements KeyListener {

        /**
         * Invoked when a key has been typed.
         * See the class description for {@link KeyEvent} for a definition of
         * a key typed event.
         *
         * @param e
         */
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if(c == 's' ){
                if( Rink.selectedPlayer == p1)
                    Rink.selectedPlayer = p2;
                else
                    Rink.selectedPlayer = p1;
            }
        }

        /**
         * Invoked when a key has been pressed.
         * See the class description for {@link KeyEvent} for a definition of
         * a key pressed event.
         *
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {
            char c = e.getKeyChar();
            if(c == 's' ){
                if( Rink.selectedPlayer == p1)
                    Rink.selectedPlayer = p2;
                else
                    Rink.selectedPlayer = p1;
            }
        }

        /**
         * Invoked when a key has been released.
         * See the class description for {@link KeyEvent} for a definition of
         * a key released event.
         *
         * @param e
         */
        @Override
        public void keyReleased(KeyEvent e) {
            char c = e.getKeyChar();
            if(c == 's' ){
                if( Rink.selectedPlayer == p1)
                    Rink.selectedPlayer = p2;
                else
                    Rink.selectedPlayer = p1;
            }
        }
    }


    /*private class Listener implements MouseListener {

        *//**
         * Invoked when the mouse button has been clicked (pressed
         * and released) on a component.
         *
         * @param e
         *//*
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Selected");
            //Rink.selectedPlayer = Player.this;
        }

        *//**
         * Invoked when a mouse button has been pressed on a component.
         *
         * @param e
         *//*
        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Selected");
            //Rink.selectedPlayer = Player.this;
        }

        *//**
         * Invoked when a mouse button has been released on a component.
         *
         * @param e
         *//*
        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Selected");
            //Rink.selectedPlayer = ;
        }

        *//**
         * Invoked when the mouse enters a component.
         *
         * @param e
         *//*
        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Selected");
            //Rink.selectedPlayer = ;
        }

        *//**
         * Invoked when the mouse exits a component.
         *
         * @param e
         *//*
        @Override
        public void mouseExited(MouseEvent e) {

        }
    }*/

}
