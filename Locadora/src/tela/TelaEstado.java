package tela;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import banco.DAOGenerico;
import entidade.Estado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEstado extends JInternalFrame {
	private JTextField txtNomeEstado;
	private JTextField txtSigla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstado frame = new TelaEstado();
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
	public TelaEstado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setClosable(true);
		setVisible(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblCadastroDeEstados = new JLabel("Cadastro de Estados");
		lblCadastroDeEstados.setBounds(130, 12, 148, 15);
		getContentPane().add(lblCadastroDeEstados);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 37, 40, 15);
		getContentPane().add(lblNome);

		txtNomeEstado = new JTextField();
		txtNomeEstado.setBounds(53, 35, 114, 19);
		getContentPane().add(txtNomeEstado);
		txtNomeEstado.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAOGenerico<Estado> daoGenerico = new DAOGenerico<>(Estado.class);
				Estado estado = new Estado();
				estado.setNome(txtNomeEstado.getText());
				estado.setSigla(txtSigla.getText());
				daoGenerico.salvar(estado);
			}
		});
		btnCadastrar.setBounds(53, 112, 117, 25);
		getContentPane().add(btnCadastrar);

		JLabel lblSigla = new JLabel("Sigla");
		lblSigla.setBounds(12, 64, 40, 15);
		getContentPane().add(lblSigla);

		txtSigla = new JTextField();
		txtSigla.setColumns(10);
		txtSigla.setBounds(53, 62, 114, 19);
		getContentPane().add(txtSigla);

	}
}
