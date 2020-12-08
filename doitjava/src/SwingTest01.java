import javax.swing.JFrame;

public class SwingTest01 {
	public static void main(String[] args) {
		JFrame f = new JFrame("응용프로그램");
		f.setBounds(200, 200, 500, 300);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	
	}
}