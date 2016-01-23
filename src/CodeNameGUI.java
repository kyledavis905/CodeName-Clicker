import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class CodeNameGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodeNameGui frame = new CodeNameGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CodeNameGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 550);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(btnExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 140, 0), new Color(255, 215, 0), new Color(255, 165, 0), new Color(205, 133, 63)));
		scrollPane.getViewport().setBackground(new Color (153, 101, 21));
		

		
		JLabel label = DefaultComponentFactory.getInstance().createTitle(String.valueOf("0"));
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Images/Vox.png"));
		
		JButton btnNewButton = new JButton("");
		
		JLabel Aowned = new JLabel("0");

		
		ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();

		ses.scheduleAtFixedRate(new Runnable() {
		    @Override
		    public void run() {
		    	label.setText(String.valueOf(Integer.parseInt(label.getText()) +Integer.parseInt(Aowned.getText())  )) ;
		    }
		}, 0, 1, TimeUnit.SECONDS);
		
		btnNewButton.addActionListener(new ActionListener() {
			int money = Integer.parseInt(label.getText());
			public void actionPerformed(ActionEvent arg0) {
				money = Integer.parseInt(label.getText());
				money +=  1;
				label.setText(String.valueOf(money));
			}
		});
		
		
		
		btnNewButton.setIcon(new ImageIcon("Images/Glowcube.jpg"));
		
		JButton btnTestButton = new JButton("Test Button");
		btnTestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(Integer.parseInt(label.getText()));
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(63)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(95)
									.addComponent(btnTestButton))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label)))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(123)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
							.addComponent(btnTestButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(label)
									.addGap(18))
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)))
					.addGap(49))
		);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(184, 134, 11));
		scrollPane.setViewportView(panel);
		

		
		JLabel lblUpgrade = new JLabel("");
		lblUpgrade.setIcon(new ImageIcon("C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\Aqueous_Accumulator.png"));
		
		JButton btnAccumulator = new JButton("Accumulator $15");
		btnAccumulator.addActionListener(new ActionListener() {
			int AccO = Integer.parseInt(Aowned.getText()); 
			public void actionPerformed(ActionEvent arg0) {
				if (Integer.parseInt(label.getText()) >= 15){
					
					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 15));
					AccO += 1;
					Aowned.setText(String.valueOf(AccO));
					
				}
				
			}
		});
		
		JLabel lblOwned = new JLabel("Owned:");
		

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblUpgrade, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAccumulator)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblOwned)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Aowned)))
					.addContainerGap(516, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUpgrade, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAccumulator)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblOwned)
								.addComponent(Aowned))))
					.addContainerGap(635, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
