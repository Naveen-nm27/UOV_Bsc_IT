import javax.swing.*;
class ImageButton
{
	ImageButton(){
		JFrame frame = new JFrame("Image example");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JButton btn = new JButton(new ImageIcon("btn.png"));
		btn.setBounds(100,10,200,40);
		frame.add(btn);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String args[]){ñ
		new ImageButton();
	}
}