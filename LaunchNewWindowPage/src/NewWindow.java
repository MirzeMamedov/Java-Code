import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame = new JFrame("New Window");
	JLabel label = new JLabel("Hello");
	
	NewWindow() {
		
		label.setBounds(200,200,100,50);
		label.setFont(new Font(null,Font.PLAIN,25));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
