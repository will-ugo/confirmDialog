import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class confirmDialog extends JFrame {
	private JPanel panel;
	private JButton toButton;
	private JLabel label1;
	private JLabel label2;
	private JList inventory;
	private JList foods;
	String[] list = {"Wire", "Fudge", "Toothbrush", "Ketchup", 
			"Telephone", "Bottle", "Burger", "Potato", 
			"Television", "Taco"};
	
	public confirmDialog() {
		super("Confirm Dialog Demo");
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		getContentPane().setBackground(Color.ORANGE);
		add(panel);
		
		label1 = new JLabel("Inventory List");
		label1.setFont(new Font("Castellar", Font.BOLD, 15));
		label1.setBounds(30, 21, 200, 20);
		add(label1);
		
		inventory = new JList(list);
		inventory.setBackground(Color.YELLOW);
		inventory.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		inventory.setBounds(40, 55, 120, 190);
		add(inventory);
		
		toButton = new JButton("Add to Foods");
		toButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						int option = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm Dialog Box", 
								JOptionPane.YES_NO_OPTION);
						if (option == JOptionPane.YES_OPTION)
							foods.setListData(inventory.getSelectedValues());
					}
				}
				);
		toButton.setBounds(170, 110, 110, 30);
		toButton.setBackground(Color.ORANGE);
		add(toButton);
				
		label2 = new JLabel("Foods List");
		label2.setFont(new Font("Castellar", Font.BOLD, 15));
		label2.setBounds(280, 21, 200, 20);
		add(label2);
		
		foods = new JList();
		foods.setBackground(Color.YELLOW);
		foods.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		foods.setBounds(290, 55, 120, 190);
		add(foods);	
	}
}
