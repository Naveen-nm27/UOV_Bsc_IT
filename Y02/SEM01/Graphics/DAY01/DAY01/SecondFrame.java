import javax.swing.*;

class SecondFrame{
	public static void main(String args[]){
		JFrame frame = new JFrame();
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(new java.awt.Point(100,300));
		frame.setTitle("2nd Frames");
		
		JButton btn =  new JButton("Press Me");
		JButton btn2 = new JButton("Hello");
		btn.setBounds(130,100,100,40);
		btn2.setBounds(10,100,100,40);
		
		frame.add(btn);
		frame.add(btn2);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}