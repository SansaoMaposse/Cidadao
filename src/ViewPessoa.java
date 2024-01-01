import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewPessoa extends JFrame {

	private JFrame frame;
	
	private JTextField textFieldId, textFieldNome, textFieldIdade;
    private JComboBox<String> comboBoxGenero, comboBoxEstadoCivil;
    private DefaultTableModel tableModel;
    private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPessoa frame = new ViewPessoa();
					frame.frame.setVisible(true);
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewPessoa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		// Configura��o da janela principal
        setTitle("Cadastro de Pessoas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel para os campos de entrada
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(new JLabel("ID:"));
        textFieldId = new JTextField();
        inputPanel.add(textFieldId);
        inputPanel.add(new JLabel("Nome:"));
        textFieldNome = new JTextField();
        inputPanel.add(textFieldNome);
        inputPanel.add(new JLabel("G�nero:"));
        String[] generos = {"Masculino", "Feminino", "Outro"};
        comboBoxGenero = new JComboBox<>(generos);
        inputPanel.add(comboBoxGenero);
        inputPanel.add(new JLabel("Estado Civil:"));
        String[] estadosCivis = {"Solteiro", "Casado", "Divorciado", "Vi�vo"};
        comboBoxEstadoCivil = new JComboBox<>(estadosCivis);
        inputPanel.add(comboBoxEstadoCivil);
        inputPanel.add(new JLabel("Idade:"));
        textFieldIdade = new JTextField();
        inputPanel.add(textFieldIdade);

        // Painel para os bot�es
        JPanel buttonPanel = new JPanel();
        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarPessoa();
            }
        });
        buttonPanel.add(btnAdicionar);

        JButton btnListar = new JButton("Listar");
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente a l�gica para listar os dados
            }
        });
        buttonPanel.add(btnListar);

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente a l�gica para atualizar os dados
            }
        });
        buttonPanel.add(btnAtualizar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implemente a l�gica para remover os dados
            }
        });
        buttonPanel.add(btnRemover);

        // Tabela para exibir os dados
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Nome");
        tableModel.addColumn("G�nero");
        tableModel.addColumn("Estado Civil");
        tableModel.addColumn("Idade");
        table = new JTable(tableModel);

        // Adicionando os componentes � janela principal
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(new JScrollPane(table), BorderLayout.SOUTH);
    }

    private void adicionarPessoa() {
        // Implemente a l�gica para adicionar uma pessoa � tabela
        String id = textFieldId.getText();
        String nome = textFieldNome.getText();
        String genero = comboBoxGenero.getSelectedItem().toString();
        String estadoCivil = comboBoxEstadoCivil.getSelectedItem().toString();
        String idade = textFieldIdade.getText();

        // Adiciona os dados � tabela
        tableModel.addRow(new Object[]{id, nome, genero, estadoCivil, idade});

        // Limpa os campos de entrada
        textFieldId.setText("");
        textFieldNome.setText("");
        comboBoxGenero.setSelectedIndex(0);
        comboBoxEstadoCivil.setSelectedIndex(0);
        textFieldIdade.setText("");
    }

}
