package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class JFCadastrarLivro extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFCadastrarLivro frame = new JFCadastrarLivro();
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
	public JFCadastrarLivro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(274, 207, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Livro");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 209, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo");
		lblTitulo.setForeground(Color.RED);
		lblTitulo.setBackground(Color.GREEN);
		lblTitulo.setBounds(10, 45, 46, 14);
		contentPane.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(10, 70, 209, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "Literatura Estrangeira", "Literatura Infantil", "Dicion\u00E1rios", "Inform\u00E1tica", "Exot\u00E9ricos"}));
		cbCategoria.setBounds(10, 131, 209, 20);
		contentPane.add(cbCategoria);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(10, 101, 89, 14);
		contentPane.add(lblCategoria);
		
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setBounds(10, 162, 257, 68);
		contentPane.add(textArea);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(229, 70, 154, 20);
		contentPane.add(formattedTextField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(229, 131, 154, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(185, 17, 46, 14);
		contentPane.add(lblNewLabel_1);
	
	}
}
