package colores;

import java.awt.EventQueue;

import java.awt.Frame;



import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;



public class colors {



	private JFrame frame;

	private JButton btnCian;

	private JLabel lblColor;





	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					colors window = new colors();

					window.frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}





	public colors() {

		initialize();

	}





	private void initialize() {

		frame = new JFrame();

		frame.setBounds(100, 100, 450, 300);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setTitle("Colores");

		frame.setLocationRelativeTo(frame);

		frame.getContentPane().setLayout(null);

		

		

		

		btnCian = new JButton("Cian");

		btnCian.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColor.setBackground(Color.cyan);

			}

		});

		btnCian.setBounds(25, 147, 89, 23);

		frame.getContentPane().add(btnCian);

		

		JButton btnMagenta = new JButton("Magenta");

		btnMagenta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColor.setBackground(Color.magenta);

			}

		});

		btnMagenta.setBounds(25, 45, 89, 23);

		frame.getContentPane().add(btnMagenta);

		

		JButton btnVerde = new JButton("Verde");

		btnVerde.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColor.setBackground(Color.green);

			}

		});

		btnVerde.setBounds(25, 113, 89, 23);

		frame.getContentPane().add(btnVerde);

		

		JButton btnNaranja = new JButton("Naranja");

		btnNaranja.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColor.setBackground(Color.orange);

			}

		});

		btnNaranja.setBounds(336, 79, 89, 23);

		frame.getContentPane().add(btnNaranja);

		

		JButton btnNegro = new JButton("Negro");

		btnNegro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColor.setBackground(Color.black);

			}

		});

		btnNegro.setBounds(336, 113, 89, 23);

		frame.getContentPane().add(btnNegro);

		

		JButton btnRosa = new JButton("Rosa");

		btnRosa.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColor.setBackground(Color.pink);

			}

		});

		btnRosa.setBounds(25, 79, 89, 23);

		frame.getContentPane().add(btnRosa);

		

		JButton btn = new JButton("Amarillo");

		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				lblColor.setBackground(Color.yellow);

			}

		});

		btn.setBounds(336, 45, 89, 23);

		frame.getContentPane().add(btn);

		

		lblColor = new JLabel("");

		lblColor.setOpaque(true);

		lblColor.setBorder(new LineBorder(new Color(255, 255, 255), 6));

		lblColor.setBounds(118, 23, 208, 203);

		frame.getContentPane().add(lblColor);

	}

}