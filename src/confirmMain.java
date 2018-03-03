import javax.swing.JFrame;

public class confirmMain {
	public static void main (String args []) {
		confirmDialog confirm = new confirmDialog();
		confirm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		confirm.setSize(500, 350);
		confirm.setVisible(true);
	}

}
