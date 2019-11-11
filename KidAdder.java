import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/* String name
 * nice boolean
 * String present
 */
public class KidAdder extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private SantasLists BigS = new SantasLists();
	
	/** Panels **/
	JPanel panel0 = new JPanel(); //Header for kid name
	JPanel panel1 = new JPanel(); //Kid text field
	JPanel panel2 = new JPanel(); //Header for nice boolean
	JPanel panel3 = new JPanel(); //nice boolean
	JPanel panel4 = new JPanel(); //Header for present
	JPanel panel5 = new JPanel(); //text field for present
	JPanel panel6 = new JPanel(); //add kid button
	
	/** Headers **/
	JLabel Header0 = new JLabel();
	JLabel Header1 = new JLabel();
	JLabel Header2 = new JLabel();
	
	/** Text field and radio **/
	JTextField kidName = new JTextField();
	ButtonGroup nGroup = new ButtonGroup();
	JRadioButton nice = new JRadioButton("Nice");
	JRadioButton naughty = new JRadioButton("Naughty");
	JTextField present = new JTextField();
	
	/** Add kid button **/
	JButton addKid = new JButton("Create kid");
	
	public KidAdder(String title) {
		super(title);
		
		/** Set headers **/
		Header0.setText("Kid's name:");
		Header0.setHorizontalAlignment(JLabel.LEFT);
		Header1.setText("Nice?");
		Header1.setHorizontalAlignment(JLabel.LEFT);
		Header2.setText("Requested present:");
		Header2.setHorizontalAlignment(JLabel.LEFT);
		
		panel0.add(Header0);
		panel2.add(Header1);
		panel4.add(Header2);
		
		/** Set Buttons **/
		kidName.setEditable(true);
		kidName.setText("		");
		present.setEditable(true);
		present.setText("		");
		
		nGroup.add(nice);
		nGroup.add(naughty);
		
		
		panel1.add(kidName);
		panel3.add(nice);
		panel3.add(naughty);
		panel5.add(present);
		panel6.add(addKid);
		
		/** Add panels **/
		setLayout(new GridLayout(6, 0));
		
		add(panel0);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		
		/** Create Kid method **/
		addKid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean nn = false;
				
				if(nice.isSelected()) {
					nn = true;
				}
				
				BigS.addEntry(new Kid(kidName.getText(), present.getText(), nn));
				
				kidName.setText("		");
				present.setText("		");
			}
		});
		
		pack();
		setSize(400, 400);
		setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
        new KidAdder("Kid Adder");
    }

}
