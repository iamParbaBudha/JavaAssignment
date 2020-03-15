import java.awt.*;
import javax.swing.JFrame;

class HouseDemo extends Canvas
{
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
 
		int x[] = {315, 80, 550, 120, 120, 250, 250, 350, 350, 500, 500, 550, 315};
		int y[] = {50, 300, 300, 300, 600, 600, 450, 450, 600, 600, 300, 300, 50};			// outer body of the house
		
			g.setColor(Color.GREEN);
			g.fillPolygon(x, y, 13);

			g.setColor(new Color(155, 105, 35));
			g.fillPolygon(x, y, 3);

			
			g.setColor(Color.BLACK);
			
			g.fillRect(150, 350 , 70, 70);
			g.fillRect(390, 350, 70, 70);

			
			g.fillRect(250, 450, 100, 150);

	}

	public static void main(String[] args) 
	{
		HouseDemo house = new HouseDemo();
		Frame frame = new Frame();

			frame.setSize(800, 800);
			frame.setVisible(true);
			frame.add(house);	
	}
}