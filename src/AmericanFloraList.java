import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

/**
 * This class demonstrates the List Component
 * @Author Josh Alcoba
 * 3/31/2016
 * 
 */

public class AmericanFloraList extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JPanel floraPanel;
	private JPanel selectedFloraPanel; 
	private JList<String> floraList; 
	private JTextField selectedFlora;

	private String[] flora = { "Dionaea muscipula", "Viola sororia", "Taraxacum officinale", "Sarracenia purpurea",
			"Helonias bullata", "Vaccinium caesariense", "Pinus rigida", "Drosera spatulata",
			"Ferocactus cylindraceus" };

	public AmericanFloraList() {
		super("American flora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		buildFloraPanel();
		buildSelectedFloraPanel();
		add(floraPanel, BorderLayout.CENTER);
		add(selectedFloraPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}

	private void buildFloraPanel() {
		floraPanel = new JPanel();
		floraList = new JList<String>(flora);
		floraList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		floraList.addListSelectionListener(new ListListener());
		floraPanel.add(floraList);
	}

	private void buildSelectedFloraPanel() {
		selectedFloraPanel = new JPanel();
		label = new JLabel("You selected: ");
		selectedFlora = new JTextField(11);
		selectedFlora.setEditable(false);
		selectedFloraPanel.add(label);
		selectedFloraPanel.add(selectedFlora);
	}

	/**
	 * Private inner class that handles the event when the user selects an item from
	 * the list.
	 */

	private class ListListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			String selection = (String) floraList.getSelectedValue();
			selectedFlora.setText(selection);
			ImageIcon image1 = new ImageIcon("1.jpg");
			ImageIcon image2 = new ImageIcon("2.jpg");
			ImageIcon image3 = new ImageIcon("3.jpg");
			ImageIcon image4 = new ImageIcon("4.jpg");
			ImageIcon image5 = new ImageIcon("5.jpg");
			ImageIcon image6 = new ImageIcon("6.jpg");
			ImageIcon image7 = new ImageIcon("7.jpg");
			ImageIcon image8 = new ImageIcon("8.jpg");
			ImageIcon image9 = new ImageIcon("9.jpg");

			switch (selection) {
			case "Dionaea muscipula":
				label.setIcon(image1);
				break;
			case "Viola sororia":
				label.setIcon(image2);
				break;
			case "Taraxacum officinale":
				label.setIcon(image3);
				break;
			case "Sarracenia purpurea":
				label.setIcon(image4);
				break;
			case "Helonias bullata":
				label.setIcon(image5);
				break;
			case "Vaccinium caesariense":
				label.setIcon(image6);
				break;
			case "Pinus rigida":
				label.setIcon(image7);
				break;
			case "Drosera spatulata":
				label.setIcon(image8);
				break;
			case "Ferocactus cylindraceus":
				label.setIcon(image9);
				break;
			}

			// Remove the text from the label.
			label.setText(null);

			// Pack the frame again to accommodate the
			// new size of the label.
			pack();
		}
	}

	public static void main(String[] args) {
		new AmericanFloraList();
	}
}