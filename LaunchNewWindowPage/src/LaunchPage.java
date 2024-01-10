import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	
	JFrame jFrame = new JFrame("Launch Page");
	JButton myButton = new JButton("New Window");
	
	public LaunchPage() {
		
		myButton.setBounds(150,200,200,50);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(new Dimension(500,500));
		jFrame.setLayout(null);
		jFrame.add(myButton);
		jFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==myButton){
			jFrame.dispose();
			NewWindow window = new NewWindow();
		}
	}
}
