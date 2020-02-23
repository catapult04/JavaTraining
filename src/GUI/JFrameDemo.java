package GUI; 
import java.awt.*;
import javax.swing.*;

public class JFrameDemo {
	private JFrame  frame;
	private JButton button;
	
	//constructor
	public JFrameDemo() {
		createAndShow();
	}
	//other method
	public void createAndShow() {
		frame = new  JFrame("Máy tính bỏ túi");
		
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int i;
		for(i=9; i>=0; i--) {
			button = new JButton(""+i);
			frame.add(button);
		}
		
		frame.setLayout(new FlowLayout());
		//Hiển thị vừa đủ
		//frame.pack(); 
		
		frame.setVisible(true);
	}
	
	//Main
	public static void main(String [] args) {
		var obj = new JFrameDemo();
		//obj.createAndShow();
	}
}
