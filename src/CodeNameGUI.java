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
		setBounds(100, 100, 750, 650);

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
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 140, 0), new Color(255, 215, 0),
				new Color(255, 165, 0), new Color(205, 133, 63)));
		scrollPane.getViewport().setBackground(new Color(153, 101, 21));

		JLabel label = DefaultComponentFactory.getInstance().createTitle(String.valueOf("0"));
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\Vox.png"));

		JButton btnNewButton = new JButton("");
		
		JLabel QGowned = new JLabel("0");
		
		JLabel SPowned = new JLabel("0");

		JLabel GTowned = new JLabel("0");
		
		JLabel Aowned = new JLabel("0");

		JLabel WWowned = new JLabel("0");
		
		JLabel WMowned = new JLabel("0");
		
		JLabel FRowned = new JLabel("0");
		
		JLabel NRowned = new JLabel("0");
		
		JLabel BHowned = new JLabel("0");

		ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();

		ses.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				label.setText(String.valueOf(Integer.parseInt(label.getText()) + Integer.parseInt(Aowned.getText())
						+ (Integer.parseInt(WWowned.getText()) * 3) + (Integer.parseInt(WMowned.getText()) * 9)
						+ (Integer.parseInt(SPowned.getText()) * 27) + (Integer.parseInt(GTowned.getText()) * 81)
						+ (Integer.parseInt(NRowned.getText()) * 243) + (Integer.parseInt(FRowned.getText()) * 729)
						+ (Integer.parseInt(BHowned.getText()) * 2187) + (Integer.parseInt(QGowned.getText()) * 6561)));
			}
		}, 0, 1, TimeUnit.SECONDS);

		btnNewButton.addActionListener(new ActionListener() {
			int money = Integer.parseInt(label.getText());

			public void actionPerformed(ActionEvent arg0) {
				money = Integer.parseInt(label.getText());
				money += 1;
				label.setText(String.valueOf(money));
			}
		});

		btnNewButton.setIcon(new ImageIcon("Images/Glowcube.jpg"));

		JButton btnTestButton = new JButton("Cheater button");
		btnTestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText("100000000");
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(63).addComponent(btnNewButton,
										GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup().addGap(113)
										.addComponent(btnTestButton))))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(23).addComponent(lblNewLabel).addGap(18)
								.addComponent(label)))
				.addContainerGap(438, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup().addGap(123)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 207,
												GroupLayout.PREFERRED_SIZE)
										.addGap(99).addComponent(btnTestButton))
						.addGroup(Alignment.LEADING,
								gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel)
												.addGroup(gl_contentPane.createSequentialGroup().addGap(31)
														.addComponent(label)))
										.addGap(18).addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 365,
												GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(539, Short.MAX_VALUE)));

		JButton btnWindMill = new JButton("Wind Mill $115");

		btnWindMill.setToolTipText("9/Wind Mill");

		JLabel lblWMowned = new JLabel("Owned:");

		JButton btnSolarPanel = new JButton("Solar Panel $345");



		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setBackground(new Color(184, 134, 11));

		JLabel lblUpgrade1 = new JLabel("");
		lblUpgrade1.setIcon(new ImageIcon(
				"C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\Aqueous_Accumulator.png"));

		JButton btnAccumulator = new JButton("Accumulator $15");
		btnAccumulator.setToolTipText("1/Accumulator");
		btnAccumulator.addActionListener(new ActionListener() {
			int AccO = Integer.parseInt(Aowned.getText());

			public void actionPerformed(ActionEvent arg0) {
				if (Integer.parseInt(label.getText()) >= 15) {

					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 15));
					AccO += 1;
					Aowned.setText(String.valueOf(AccO));

				}

			}
		});

		JLabel lblACowned = new JLabel("Owned:");

		JLabel lblUpgrade2 = new JLabel("");
		lblUpgrade2.setIcon(
				new ImageIcon("C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\Waterwheel.png"));

		JLabel lblWW = new JLabel("Owned:");

		JButton btnWaterWheel = new JButton("Water Wheel $40");
		btnWaterWheel.setToolTipText("3/Water Wheel");
		btnWaterWheel.addActionListener(new ActionListener() {
			int WWo = Integer.parseInt(WWowned.getText());

			public void actionPerformed(ActionEvent arg0) {
				if (Integer.parseInt(label.getText()) >= 40) {

					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 40));
					WWo += 1;
					WWowned.setText(String.valueOf(WWo));

				}

			}
		});

		JLabel lblUpgrade3 = new JLabel("");
		lblUpgrade3
				.setIcon(new ImageIcon("C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\WindMill.png"));

		btnWindMill.addActionListener(new ActionListener() {
			int WMo = Integer.parseInt(WMowned.getText());

			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(label.getText()) >= 115) {
					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 115));
					WMo += 1;
					WMowned.setText(String.valueOf(WMo));
				}
			}
		});

		JLabel lblUpgrade4 = new JLabel("");
		lblUpgrade4.setIcon(
				new ImageIcon("C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\SolarPanel.png"));

		btnSolarPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(label.getText()) >= 115) {
					int SPo = Integer.parseInt(SPowned.getText());

					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 345));
					SPo += 1;
					SPowned.setText(String.valueOf(SPo));

				}

			}
		});

		btnSolarPanel.setToolTipText("27/Solar Panel");

		JLabel lblSPowned = new JLabel("Owned:");

		JLabel lblUpdate5 = new JLabel("");
		lblUpdate5.setIcon(new ImageIcon(
				"C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\Geothermal Generator.png"));

		JButton btnGeothermal = new JButton("Geothermal $1035");
		btnGeothermal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(label.getText()) >= 1035) {
					int GTo = Integer.parseInt(GTowned.getText());

					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 1035));
					GTo += 1;
					GTowned.setText(String.valueOf(GTo));
				}
			}
		});
		btnGeothermal.setToolTipText("81/Generator");

		JLabel lblGTowned = new JLabel("Owned:");

		JLabel lblUpgrade5 = new JLabel("");
		lblUpgrade5.setIcon(
				new ImageIcon("C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\maxresdefault.png"));

		JButton btnReactor = new JButton("Reactor $3100");
		btnReactor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Integer.parseInt(label.getText()) >= 3100) {
					int NRo = Integer.parseInt(GTowned.getText());

					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 3100));
					NRo += 1;
					NRowned.setText(String.valueOf(NRo));
				}
				
				
			}
		});
		btnReactor.setToolTipText("243/Reactor");

		JLabel lblNRowned = new JLabel("Owned:");

		JLabel lblUpgrade6 = new JLabel("");
		lblUpgrade6.setIcon(new ImageIcon("C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\Fusion.png"));

		JButton btnFusion = new JButton("Fusion Reactor $9300");
		btnFusion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Integer.parseInt(label.getText()) >= 9300) {
					int FRo = Integer.parseInt(GTowned.getText());

					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 9300));
					FRo += 1;
					FRowned.setText(String.valueOf(FRo));
				}
				
			}
		});
		btnFusion.setToolTipText("729/Reactor");

		JLabel lbFRowned = new JLabel("Owned:");

		JLabel lblUpgrade7 = new JLabel("");
		lblUpgrade7.setIcon(new ImageIcon("C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\BlackHole.png"));

		JButton btnBlackHole = new JButton("Black Hole $27900");
		btnBlackHole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Integer.parseInt(label.getText()) >= 27900) {
					int BHo = Integer.parseInt(GTowned.getText());

					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 27900));
					BHo += 1;
					BHowned.setText(String.valueOf(BHo));
				}
				
			}
		});
		btnBlackHole.setToolTipText("6561/QG");

		JLabel lblBHowned = new JLabel("Owned:");
		lblBHowned.setToolTipText("");

		JLabel lblUpgrade8 = new JLabel("");
		lblUpgrade8.setIcon(
				new ImageIcon("C:\\Users\\Gebri\\Documents\\GitHub\\CodeName-Clicker\\Images\\Quantum_Generator.png"));

		JButton btnQuantum = new JButton("Quantum Generator $83700");
		btnQuantum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Integer.parseInt(label.getText()) >= 83700) {
					int QGo = Integer.parseInt(GTowned.getText());

					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 83700));
					QGo += 1;
					QGowned.setText(String.valueOf(QGo));
				}
				
			}
		});
		btnQuantum.setToolTipText("27/Solar Panel");

		JLabel lbQGowned = new JLabel("Owned:");

		

		JLabel lblUpgrade9 = new JLabel("");

		JButton btnHistory = new JButton("Erase History! $250000");
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Integer.parseInt(label.getText()) >= 250000) {
					label.setText(String.valueOf(Integer.parseInt(label.getText()) - 250000));
					
					dispose();
					gameOver lastScreen = new gameOver();
					lastScreen.setLocationRelativeTo(null);  
					lastScreen.setVisible(true);
					
				}
				
			}
		});
		btnHistory.setToolTipText("You have to press it...");

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addComponent(lblUpgrade1,
										GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(btnAccumulator)
										.addGroup(gl_panel.createSequentialGroup().addComponent(lblACowned)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(Aowned))))
						.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblUpgrade2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(lblWW, GroupLayout.PREFERRED_SIZE, 44,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(WWowned))
										.addComponent(btnWaterWheel)))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblUpgrade3, GroupLayout.PREFERRED_SIZE, 95,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(lblWMowned, GroupLayout.PREFERRED_SIZE, 44,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(WMowned))
												.addComponent(btnWindMill, GroupLayout.DEFAULT_SIZE, 165,
														Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblUpgrade4, GroupLayout.PREFERRED_SIZE, 95,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(lblSPowned, GroupLayout.PREFERRED_SIZE, 44,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(SPowned, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED, 100,
																Short.MAX_VALUE))
												.addComponent(btnSolarPanel, GroupLayout.DEFAULT_SIZE, 165,
														Short.MAX_VALUE)))))
						.addGap(200))
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblUpgrade5, GroupLayout.PREFERRED_SIZE, 95,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_panel.createSequentialGroup()
																.addComponent(lblNRowned, GroupLayout.PREFERRED_SIZE,
																		50, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(NRowned, GroupLayout.PREFERRED_SIZE, 21,
																		GroupLayout.PREFERRED_SIZE))
												.addComponent(btnReactor, GroupLayout.DEFAULT_SIZE, 167,
														Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblUpgrade6, GroupLayout.PREFERRED_SIZE, 107,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(lbFRowned, GroupLayout.PREFERRED_SIZE, 44,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(FRowned, GroupLayout.PREFERRED_SIZE, 23,
																GroupLayout.PREFERRED_SIZE)
														.addGap(64))
												.addComponent(btnFusion, GroupLayout.DEFAULT_SIZE, 167,
														Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblUpgrade7, GroupLayout.PREFERRED_SIZE, 95,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(lblBHowned, GroupLayout.PREFERRED_SIZE, 44,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(BHowned, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE)
														.addGap(54))
												.addComponent(btnBlackHole, GroupLayout.DEFAULT_SIZE, 167,
														Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblUpgrade8, GroupLayout.PREFERRED_SIZE, 95,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(lbQGowned, GroupLayout.PREFERRED_SIZE, 44,
																GroupLayout.PREFERRED_SIZE)
														.addGap(6).addComponent(QGowned, GroupLayout.PREFERRED_SIZE, 15,
																GroupLayout.PREFERRED_SIZE))
												.addComponent(btnQuantum)))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(lblUpgrade9, GroupLayout.PREFERRED_SIZE, 95,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(btnHistory)))
						.addGroup(Alignment.LEADING,
								gl_panel.createSequentialGroup().addComponent(lblUpdate5, GroupLayout.PREFERRED_SIZE,
										95, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblGTowned, GroupLayout.PREFERRED_SIZE, 44,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(GTowned,
														GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnGeothermal))))
						.addGap(198)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUpgrade1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup().addContainerGap()
										.addComponent(btnAccumulator).addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblACowned).addComponent(Aowned))))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblUpgrade2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup().addGap(13).addComponent(btnWaterWheel)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lblWW)
												.addComponent(WWowned))))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUpgrade3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup().addGap(8).addComponent(btnWindMill)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(WMowned)
												.addComponent(lblWMowned)))))
						.addGroup(gl_panel.createSequentialGroup().addGap(186)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup().addComponent(btnSolarPanel)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
														.addComponent(SPowned).addComponent(lblSPowned)))
								.addComponent(lblUpgrade4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUpdate5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup().addComponent(btnGeothermal)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblGTowned)
										.addComponent(GTowned))))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUpgrade5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup().addGap(11).addComponent(btnReactor)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNRowned)
										.addComponent(NRowned))))
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(19).addComponent(btnFusion)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(FRowned)
										.addComponent(lbFRowned)))
						.addGroup(gl_panel.createSequentialGroup().addGap(6).addComponent(lblUpgrade6,
								GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUpgrade7, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup().addGap(8).addComponent(btnBlackHole)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(BHowned)
										.addComponent(lblBHowned))))
				.addGap(6)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUpgrade8, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup().addGap(13).addComponent(btnQuantum)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lbQGowned)
										.addComponent(QGowned))))
				.addGap(6)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUpgrade9, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnHistory))
				.addContainerGap(658, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
