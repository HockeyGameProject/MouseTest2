import java.awt.*;
import java.awt.event.MouseEvent;

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

    public Controller(){
        ui      = new UI("Hockey");


        // Moving objects
        // CREATING PLAYERS AND GOALIES
        p1   = new Player(0,new Point(480, 275), 5, 3*Math.PI - 0.523599, 20, Color.RED);


        p2   = new Player(1,new Point(690, 370), 5, 3*Math.PI - 0.523599, 20, Color.GREEN);
        p3   = new Player(2,new Point(320, 170), 5, 4*Math.PI - 0.523599, 20, Color.MAGENTA);
        p4   = new Player(3,new Point(530, 275), 5, 4*Math.PI - 0.523599, 20, Color.BLUE);

        rink    = new Rink(p1);
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

      ;
        // added moving objects

        ui.add(rink);
        ui.pack();
        ui.setVisible(true);

    }


}
