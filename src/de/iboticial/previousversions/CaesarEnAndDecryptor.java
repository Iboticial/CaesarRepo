package de.iboticial.previousversions;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class CaesarEnAndDecryptor extends JFrame {

	private JPanel contentPane;
	private JButton ZumVlr;
	private JButton ZumEsl;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea2;
	private JTextArea textArea3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					CaesarEnAndDecryptor frame = new CaesarEnAndDecryptor();
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
	HashMap<String, String> ZahlenstringstL = new HashMap<String, String>();
	TreeMap<Double, String> TMAW = new TreeMap<Double, String>();
	private JTextField textField_1;
	private JTextField DummyField;

	public CaesarEnAndDecryptor() {
		setResizable(false);
		setTitle(" Caesar Tools 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		HashMap<String, Integer> EintragposHM = new HashMap<String, Integer>();
		EintragposHM.put("Wert", 0);

		JButton button_1 = new JButton("<<");
		button_1.setEnabled(true);
		button_1.setVisible(false);
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int WertEpos = (EintragposHM.get("Wert"));
				WertEpos = WertEpos - 1;
				if (WertEpos < 0) {

					WertEpos = TMAW.size() - 1;
				}

				else {
					if (WertEpos >= TMAW.size()) {
						WertEpos = 0;
					}
				}
				EintragposHM.put("Wert", WertEpos);
				Object key = TMAW.keySet().toArray(new Object[TMAW.size()])[WertEpos];
				String keyS = String.valueOf(key);
				Object value = TMAW.get(key);
				String valueS = String.valueOf(value);
				textArea_1.setText(valueS);
				textField.setText("        " + keyS);

			}
		});
		button_1.setBounds(10, 258, 58, 23);
		contentPane.add(button_1);

		JButton button_2 = new JButton(">>");
		button_2.setEnabled(true);
		button_2.setVisible(false);
		button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int WertEpos = (EintragposHM.get("Wert"));
				WertEpos = WertEpos + 1;

				if (WertEpos < 0) {

					WertEpos = WertEpos + 26;

				} else if (WertEpos >= TMAW.size()) {

					WertEpos = 0;

				}

				EintragposHM.put("Wert", WertEpos);
				Object key = TMAW.keySet().toArray(new Object[TMAW.size()])[WertEpos];
				String keyS = String.valueOf(key);
				Object value = TMAW.get(key);
				String valueS = String.valueOf(value);
				textArea_1.setText(valueS);
				textField.setText("        " + keyS);

			}
		});
		button_2.setBounds(368, 258, 58, 23);
		contentPane.add(button_2);

		JLabel lblVerschlsseltenTextEingeben = new JLabel("Verschl\u00FCsselten Text eingeben");
		lblVerschlsseltenTextEingeben.setBounds(146, 5, 152, 14);
		contentPane.add(lblVerschlsseltenTextEingeben);
		lblVerschlsseltenTextEingeben.setVisible(false);

		JLabel TextEingebenderVerschluesseltwerdensoll = new JLabel("Text, der verschl\u00FCsselt werden soll");
		TextEingebenderVerschluesseltwerdensoll.setBounds(127, 5, 179, 14);
		contentPane.add(TextEingebenderVerschluesseltwerdensoll);
		TextEingebenderVerschluesseltwerdensoll.setVisible(false);

		JLabel lblDurchschnitllicheAbweichung = new JLabel("Durchschnitlliche Abweichung:");
		lblDurchschnitllicheAbweichung.setBounds(98, 234, 157, 14);
		lblDurchschnitllicheAbweichung.setVisible(false);
		contentPane.add(lblDurchschnitllicheAbweichung);

		JLabel Verschiebungum = new JLabel("Verschiebung um");
		Verschiebungum.setBounds(98, 234, 86, 14);
		Verschiebungum.setVisible(false);
		contentPane.add(Verschiebungum);

		JLabel Buchstaben = new JLabel("Buchstabe (n)");
		Buchstaben.setBounds(265, 234, 69, 14);
		contentPane.add(Buchstaben);
		Buchstaben.setVisible(false);

		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setBounds(36, 25, 364, 78);
		contentPane.add(textArea);
		textArea.setColumns(10);
		textArea.setLineWrap(true);
		textArea.setVisible(false);

		textArea_1 = new JTextArea();
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEnabled(true);
		textArea_1.setEditable(false);
		textArea_1.setVisible(false);
		textArea_1.setColumns(10);
		textArea_1.setBounds(36, 146, 364, 78);
		contentPane.add(textArea_1);
		textArea_1.setLineWrap(true);

		textArea2 = new JTextArea();
		textArea2.setWrapStyleWord(true);
		textArea2.setBounds(36, 25, 364, 78);
		contentPane.add(textArea2);
		textArea2.setColumns(10);
		textArea2.setLineWrap(true);
		textArea2.setVisible(false);

		textArea3 = new JTextArea();
		textArea3.setWrapStyleWord(true);
		textArea3.setEnabled(true);
		textArea3.setEditable(false);
		textArea3.setVisible(false);
		textArea3.setColumns(10);
		textArea3.setBounds(36, 146, 364, 78);
		contentPane.add(textArea3);
		textArea3.setLineWrap(true);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(248, 232, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);

		JLabel lblEntschlsselterText = new JLabel("Entschl�sselter Text");
		lblEntschlsselterText.setBounds(171, 125, 127, 14);
		contentPane.add(lblEntschlsselterText);
		lblEntschlsselterText.setVisible(false);

		JLabel lblVerschlsselterText = new JLabel("Verschl�sselter Text");
		lblVerschlsselterText.setBounds(171, 125, 127, 14);
		contentPane.add(lblVerschlsselterText);
		lblVerschlsselterText.setVisible(false);

		JButton btnEntschlsseln = new JButton("Entschl\u00FCsseln");
		btnEntschlsseln.setVisible(false);
		btnEntschlsseln.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				long currentTime = System.currentTimeMillis();
				String VT = textArea.getText();
				if (VT.equals("")) {

					JOptionPane.showMessageDialog(null, "Es wurden keine g�ltigen Buchstaben eingegeben!", "Fehler",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					TMAW.clear();
					EintragposHM.put("Wert", 0);
					textField.setVisible(true);
					button_1.setVisible(true);
					button_2.setVisible(true);
					lblDurchschnitllicheAbweichung.setVisible(true);

					char letter;
					int Sz891 = 0;

					while (Sz891 < 26) {
						int i = 0;

						ByteArrayOutputStream baos = new ByteArrayOutputStream();
						PrintStream ps = new PrintStream(baos);
						// IMPORTANT: Save the old System.out!
						PrintStream old = System.out;
						// Tell Java to use your special stream
						System.setOut(ps);
						// Print some output: goes to your special stream

						while (i < VT.length()) {

							letter = VT.charAt(i);
							int li = letter;
							// LetterInt
							if (letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z') {
								if (letter >= 'A' && letter <= 'Z') {
									li = li + Sz891;
									if (li > 90) {
										li = li - 26;
										System.out.print(Character.toString((char) li));
									}

									else {

										System.out.print(Character.toString((char) li));
									}

								}
								if (letter >= 'a' && letter <= 'z') {
									li = li + Sz891;
									if (li > 122) {
										li = li - 26;
										System.out.print(Character.toString((char) li));
									}

									else {

										System.out.print(Character.toString((char) li));
									}

								}
							} else {

								System.out.print(letter);

							}

							i++;
						}

						System.out.flush();
						System.setOut(old);
						String Zahl = baos.toString();
						ZahlenstringstL.put("Zahlenstringtl+" + Sz891, Zahl);
						System.out.println("Zahlenstringtl+" + Sz891 + "     " + Zahl);

						System.out.println();
						Sz891++;
					}

					int Sz907 = 0;

					while (Sz907 < 26) {
						Sz907++;
						int Sz904 = Sz907 - 1;
						double[] count = new double[26];

						System.out.println(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904));
						count[0] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'A'));
						count[1] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'B'));
						count[2] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'C'));
						count[3] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'D'));
						count[4] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'E'));
						count[5] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'F'));
						count[6] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'G'));
						count[7] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'H'));
						count[8] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'I'));
						count[9] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'J'));
						count[10] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'K'));
						count[11] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'L'));
						count[12] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'M'));
						count[13] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'N'));
						count[14] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'O'));
						count[15] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'P'));
						count[16] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'Q'));
						count[17] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'R'));
						count[18] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'S'));
						count[19] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'T'));
						count[20] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'U'));
						count[21] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'V'));
						count[22] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'W'));
						count[23] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'X'));
						count[24] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'Y'));
						count[25] = (countLetter(ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904), 'Z'));

						double Insg = count[0] + count[1] + count[2] + count[3] + count[4] + count[5] + count[6]
								+ count[7] + count[8] + count[9] + count[10] + count[11] + count[12] + count[13]
								+ count[14] + count[15] + count[16] + count[17] + count[18] + count[19] + count[20]
								+ count[21] + count[22] + count[23] + count[24] + count[25];

						double[] D = new double[26];

						D[0] = 6.51;
						D[1] = 1.89;
						D[2] = 3.06;
						D[3] = 5.08;
						D[4] = 17.40;
						D[5] = 1.66;
						D[6] = 3.01;
						D[7] = 4.76;
						D[8] = 7.55;
						D[9] = 0.27;
						D[10] = 1.21;
						D[11] = 3.44;
						D[12] = 2.53;
						D[13] = 9.78;
						D[14] = 2.51;
						D[15] = 0.79;
						D[16] = 0.02;
						D[17] = 7.00;
						D[18] = 7.27;
						D[19] = 6.15;
						D[20] = 4.35;
						D[21] = 0.67;
						D[22] = 1.89;
						D[23] = 0.03;
						D[24] = 0.04;
						D[25] = 1.13;

						double[] A0 = new double[26];
						double[] A = new double[26];

						int sz304 = 0;
						int Azfsp = 0;
						do {
							if (count[sz304] != 0) {
								Azfsp++;

							}
							sz304++;

						} while (sz304 < 26);

						System.out.println("Azfsp: " + Azfsp);

						int i = 0;
						int ArrayZ1 = 0;
						double[] DurchAArray = new double[Azfsp];
						do {
							if (count[i] != 0) {
								A0[i] = count[i] / Insg * 100;
								if (D[i] > A0[i]) {
									A[i] = D[i] - A0[i];
									A[i] = Math.round(A[i] * 100) / 100.0;
									System.out.println("A" + i + ":" + A[i]);
									DurchAArray[ArrayZ1] = A[i];
									ArrayZ1++;
								}

								if (D[i] < A0[i]) {
									A[i] = A0[i] - D[i];
									A[i] = Math.round(A[i] * 100) / 100.0;
									System.out.println("A" + i + ":" + A[i]);
									DurchAArray[ArrayZ1] = A[i];
									ArrayZ1++;
								}

							}

							i++;

						} while (i < 26);

						int Azsf = Azfsp;
						int Sz504 = 0;
						double DurchsAW = 0;
						System.out.println(Azsf);

						do {
							DurchsAW = DurchsAW + DurchAArray[Sz504];

							Sz504++;

						} while (Sz504 < Azsf);

						DurchsAW = DurchsAW / Azsf;
						DurchsAW = Math.round(DurchsAW * 100) / 100.0;
						System.out.println("Durchschnittliche Abweichung: " + DurchsAW);
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println();

						TMAW.put(DurchsAW, ZahlenstringstL.get("Zahlenstringtl" + "+" + Sz904));

					}

					Object key = TMAW.keySet().toArray(new Object[TMAW.size()])[0];
					Object value = TMAW.get(key);
					String valueS = String.valueOf(value);
					String keyS = String.valueOf(key);
					textArea_1.setText(valueS);
					textField.setText("        " + keyS);

					long currentTimeAfter = System.currentTimeMillis();
					System.out.println(currentTimeAfter - currentTime);

					// TODO:EXCEPTIONS, APP, ENTER, TAB

				}

			}
		});
		btnEntschlsseln.setEnabled(true);
		btnEntschlsseln.setBounds(171, 258, 97, 23);
		contentPane.add(btnEntschlsseln);

		JButton btnVerschlsseln = new JButton("Verschl�sseln");
		btnVerschlsseln.setVisible(false);
		btnVerschlsseln.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String VT = textArea2.getText();
				String Verschiebungszahl = textField_1.getText();

				if (VT.equals("") && Verschiebungszahl.equals("")) {

					JOptionPane.showMessageDialog(null,
							"Es wurden keine g�ltigen Buchstaben und kein g�ltiger Zahlenwert eingegeben!", "Fehler",
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					if (VT.equals("")) {

						JOptionPane.showMessageDialog(null, "Es wurden keine g�ltigen Buchstaben eingegeben!", "Fehler",
								JOptionPane.INFORMATION_MESSAGE);

					} else {

						if (Verschiebungszahl.equals("")) {

							JOptionPane.showMessageDialog(null, "Es wurde kein g�ltiger Zahlenwert eingegeben!",
									"Fehler", JOptionPane.INFORMATION_MESSAGE);

						} else {
							int VerschiebungszahlInt = Integer.parseInt(Verschiebungszahl);

							while (VerschiebungszahlInt > 26) {

								VerschiebungszahlInt = VerschiebungszahlInt - 26;

							}

							char letter;

							int i = 0;

							ByteArrayOutputStream baos = new ByteArrayOutputStream();
							PrintStream ps = new PrintStream(baos);
							// IMPORTANT: Save the old System.out!
							PrintStream old = System.out;
							// Tell Java to use your special stream
							System.setOut(ps);
							// Print some output: goes to your special stream

							while (i < VT.length()) {

								letter = VT.charAt(i);
								int li = letter;
								// LetterInt
								if (letter >= 'A' && letter <= 'Z' || letter >= 'a' && letter <= 'z') {
									if (letter >= 'A' && letter <= 'Z') {
										li = li + VerschiebungszahlInt;
										if (li > 90) {
											li = li - 26;
											System.out.print(Character.toString((char) li));
										}

										else {

											System.out.print(Character.toString((char) li));
										}

									}
									if (letter >= 'a' && letter <= 'z') {
										li = li + VerschiebungszahlInt;
										if (li > 122) {
											li = li - 26;
											System.out.print(Character.toString((char) li));
										}

										else {

											System.out.print(Character.toString((char) li));
										}

									}
								} else {

									System.out.print(letter);

								}

								i++;
							}

							System.out.flush();
							System.setOut(old);
							String Zahl = baos.toString();
							System.out.println("Zahlenstringtl" + "    " + Zahl);

							System.out.println();
							textArea3.setText(Zahl);

						}

					}

				}
			}

		});

		JButton btnZumVerschlssler = new JButton("Zum Verschl�ssler");
		btnZumVerschlssler.setEnabled(true);
		btnZumVerschlssler.setVisible(false);

		JButton button = new JButton("Zum Entschl�ssler");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				btnZumVerschlssler.setVisible(true);
				btnVerschlsseln.setVisible(false);
				btnEntschlsseln.setVisible(true);
				textArea2.setVisible(false);
				textArea3.setVisible(false);
				TextEingebenderVerschluesseltwerdensoll.setVisible(false);
				button.setVisible(false);
				lblVerschlsselterText.setVisible(false);
				Verschiebungum.setVisible(false);
				Buchstaben.setVisible(false);
				textField_1.setVisible(false);
				textArea2.setText("");
				textArea3.setText("");
				textField_1.setText("");
				textArea.setVisible(true);
				textArea_1.setVisible(true);
				textField.setVisible(true);
				textArea.requestFocus();
				button_1.setVisible(false);
				button_2.setVisible(false);
				lblEntschlsselterText.setVisible(true);
				lblDurchschnitllicheAbweichung.setVisible(true);
				lblVerschlsseltenTextEingeben.setVisible(true);

			}
		});
		button.setEnabled(true);
		button.setVisible(false);
		button.setBounds(317, 1, 117, 23);
		contentPane.add(button);

		btnVerschlsseln.setEnabled(true);
		btnVerschlsseln.setBounds(171, 258, 97, 23);
		contentPane.add(btnVerschlsseln);

		btnZumVerschlssler.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				btnZumVerschlssler.setVisible(false);
				btnVerschlsseln.setVisible(true);
				btnEntschlsseln.setVisible(false);
				textArea2.setVisible(true);
				textArea3.setVisible(true);
				textArea2.requestFocus();
				TextEingebenderVerschluesseltwerdensoll.setVisible(true);
				button.setVisible(true);
				lblVerschlsselterText.setVisible(true);
				Verschiebungum.setVisible(true);
				Buchstaben.setVisible(true);
				textField_1.setVisible(true);
				textArea.setText("");
				textArea_1.setText("");
				textField.setText("");
				textArea.setVisible(false);
				textArea_1.setVisible(false);
				textField.setVisible(false);
				button_1.setVisible(false);
				button_2.setVisible(false);
				lblEntschlsselterText.setVisible(false);
				lblDurchschnitllicheAbweichung.setVisible(false);
				lblVerschlsseltenTextEingeben.setVisible(false);

			}
		});
		btnZumVerschlssler.setBounds(317, 1, 117, 23);
		contentPane.add(btnZumVerschlssler);

		JButton ZumEsl = new JButton("Zum Entschl\u00FCssler");
		ZumEsl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ZumEsl.setEnabled(true);
				ZumEsl.setVisible(false);
				ZumVlr.setEnabled(true);
				ZumVlr.setVisible(false);
				btnEntschlsseln.setVisible(true);
				btnEntschlsseln.setEnabled(true);
				btnZumVerschlssler.setVisible(true);
				lblVerschlsseltenTextEingeben.setVisible(true);
				lblEntschlsselterText.setVisible(true);

				textArea.setEnabled(true);
				textArea.setVisible(true);
				textArea_1.setEnabled(true);
				textArea_1.setVisible(true);
				textArea.requestFocus();
			}
		});
		ZumEsl.setBounds(251, 25, 152, 243);
		contentPane.add(ZumEsl);

		ZumVlr = new JButton("Zum Verschl\u00FCssler");
		ZumVlr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnVerschlsseln.setVisible(true);
				textArea2.setVisible(true);
				textArea3.setVisible(true);
				ZumEsl.setVisible(false);
				ZumVlr.setVisible(false);
				TextEingebenderVerschluesseltwerdensoll.setVisible(true);
				button.setVisible(true);
				lblVerschlsselterText.setVisible(true);
				Verschiebungum.setVisible(true);
				Buchstaben.setVisible(true);
				textField_1.setVisible(true);

			}
		});
		ZumVlr.setBounds(36, 25, 152, 243);
		contentPane.add(ZumVlr);

		textField_1 = new JTextField();
		textField_1.setBounds(183, 231, 74, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setVisible(false);

	}

	private static int countLetter(String str, char letter) {
		str = str.toLowerCase();
		letter = Character.toLowerCase(letter);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char currentLetter = str.charAt(i);
			if (currentLetter == letter)
				count++;
		}

		return count;

	}
}