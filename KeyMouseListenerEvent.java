import javax.swing.*;
import java.awt.event.*;


public class KeyMouseListenerEvent 
{
	public static void main(String []args)
	{
		JFrame f = new JFrame("KEY EVENT AND MOUSE EVENT");
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		JLabel keyl = new JLabel("Key Pressed : ");
		JLabel mousel = new JLabel("Mouse Event : ");

		f.add(p);
		p.add(keyl);
		p.add(mousel);

		f.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyTyped(KeyEvent e){
  				keyl.setText("Key Pressed : " + e.getKeyChar());
			}
		});

		f.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e){
  				mousel.setText("Mouse Event : Clicked at(" + e.getX() + "," + e.getY() + ")");
			}
		});

		f.setFocusable(true);
		f.requestFocusInWindow();
		f.setVisible(true);
	}
}