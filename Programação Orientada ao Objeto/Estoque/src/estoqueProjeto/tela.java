package estoqueProjeto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextField;
import java.math.*;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class tela {

	private JFrame frame;
	private JTextField nomeProd;
	private JTextField precoProd;
	private JTextField quantidadeProd;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Estoque");
		lblNewLabel.setFont(new Font("Lucida Handwriting", Font.PLAIN, 18));
		lblNewLabel.setBounds(173, 11, 105, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do produto:");
		lblNewLabel_1.setBounds(10, 41, 87, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Preço do produto:");
		lblNewLabel_2.setBounds(10, 66, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade do produto:");
		lblNewLabel_3.setBounds(214, 41, 129, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		nomeProd = new JTextField();
		nomeProd.setBounds(107, 38, 86, 20);
		frame.getContentPane().add(nomeProd);
		nomeProd.setColumns(10);
		
		precoProd = new JTextField();
		precoProd.setBounds(107, 63, 86, 20);
		frame.getContentPane().add(precoProd);
		precoProd.setColumns(10);
		
		quantidadeProd = new JTextField();
		quantidadeProd.setBounds(338, 38, 86, 20);
		frame.getContentPane().add(quantidadeProd);
		quantidadeProd.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Obter o nome do produto
		        String nomeProduto = nomeProd.getText();

		        // Verificar se o campo de nome está vazio
		        if (nomeProduto.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Digite o nome do produto antes de adicionar.", "Erro", JOptionPane.ERROR_MESSAGE);
		            return;
		        }

		        // Obter o modelo da tabela
		        DefaultTableModel model = (DefaultTableModel) table.getModel();

		        // Verificar se o produto já existe na tabela
		        int rowCount = model.getRowCount();
		        boolean produtoExistente = false;
		        int indexProdutoExistente = -1;

		        for (int i = 0; i < rowCount; i++) {
		            if (nomeProduto.equals(model.getValueAt(i, 0))) {
		                produtoExistente = true;
		                indexProdutoExistente = i;
		                break;
		            }
		        }

		        // Se o produto existir, pedir a quantidade desejada ao usuário
		        if (produtoExistente) {
		            String quantidadeDesejada = JOptionPane.showInputDialog(null, "Digite a quantidade desejada:", "Quantidade Desejada", JOptionPane.QUESTION_MESSAGE);

		            // Verificar se a quantidade foi digitada
		            if (quantidadeDesejada == null || quantidadeDesejada.isEmpty()) {
		                JOptionPane.showMessageDialog(null, "Digite a quantidade desejada.", "Erro", JOptionPane.ERROR_MESSAGE);
		                return;
		            }

		            try {
		                // Converter a quantidade desejada para um número
		                int quantidadeNova = Integer.parseInt(quantidadeDesejada);

		                // Obter a quantidade e o preço atuais
		                int quantidadeAtual = (int) model.getValueAt(indexProdutoExistente, 1);
		                double preco = (double) model.getValueAt(indexProdutoExistente, 2);

		                // Calcular o total atualizado
		                double totalAtualizado = quantidadeNova * preco;

		                // Atualizar a tabela com a quantidade desejada e o total atualizado
		                model.setValueAt(quantidadeNova, indexProdutoExistente, 1);
		                model.setValueAt(totalAtualizado, indexProdutoExistente, 3);
		            } catch (NumberFormatException ex) {
		                JOptionPane.showMessageDialog(null, "Digite um valor numérico para a quantidade.", "Erro", JOptionPane.ERROR_MESSAGE);
		            }
		        } else {
		            // Se o produto não existir, exibir mensagem de aviso
		            JOptionPane.showMessageDialog(null, "O produto não foi encontrado na tabela.", "Aviso", JOptionPane.WARNING_MESSAGE);
		        }

		        // Limpar os campos após adicionar ou atualizar a tabela (opcional)
		        nomeProd.setText("");
		        quantidadeProd.setText("");
		        precoProd.setText("");
		    }
		});


		btnAdicionar.setBounds(177, 227, 89, 23);
		frame.getContentPane().add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nomeProdutoParaRemover = nomeProd.getText();
		        if (nomeProdutoParaRemover.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Digite o nome do produto para remover.", "Erro", JOptionPane.ERROR_MESSAGE);
		            return;
		        }

		        DefaultTableModel model = (DefaultTableModel) table.getModel();
		        int rowCount = model.getRowCount();
		        boolean produtoEncontrado = false;

		        for (int i = 0; i < rowCount; i++) {
		            if (nomeProdutoParaRemover.equals(model.getValueAt(i, 0))) {
		                // Produto encontrado, obter a quantidade a ser removida
		                String quantidadeParaRemover = JOptionPane.showInputDialog(null, "Digite a quantidade a ser removida:", "Remover Quantidade", JOptionPane.QUESTION_MESSAGE);

		                // Verificar se a quantidade foi digitada
		                if (quantidadeParaRemover == null || quantidadeParaRemover.isEmpty()) {
		                    JOptionPane.showMessageDialog(null, "Digite a quantidade a ser removida.", "Erro", JOptionPane.ERROR_MESSAGE);
		                    return;
		                }

		                try {
		                    int quantidadeRemover = Integer.parseInt(quantidadeParaRemover);

		                    // Obter a quantidade atual e calcular a nova quantidade e total
		                    int quantidadeAtual = (int) model.getValueAt(i, 1);
		                    if (quantidadeRemover >= quantidadeAtual) {
		                        // Se a quantidade a ser removida for maior ou igual à quantidade atual, remover a linha
		                        model.removeRow(i);
		                    } else {
		                        // Caso contrário, atualizar a quantidade e o total
		                        model.setValueAt(quantidadeAtual - quantidadeRemover, i, 1);
		                        double preco = (double) model.getValueAt(i, 2);
		                        model.setValueAt((quantidadeAtual - quantidadeRemover) * preco, i, 3);
		                    }

		                    produtoEncontrado = true;
		                    break;
		                } catch (NumberFormatException ex) {
		                    JOptionPane.showMessageDialog(null, "Digite um valor numérico para a quantidade.", "Erro", JOptionPane.ERROR_MESSAGE);
		                    return;
		                }
		            }
		        }

		        if (!produtoEncontrado) {
		            JOptionPane.showMessageDialog(null, "O produto não foi encontrado na tabela.", "Aviso", JOptionPane.WARNING_MESSAGE);
		        }

		        nomeProd.setText("");
		    }
		});


		
		btnRemover.setBounds(276, 227, 89, 23);
		frame.getContentPane().add(btnRemover);		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 110, 414, 89);
		frame.getContentPane().add(scrollPane);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Nome Produto", "Valor Unit\u00E1rio", "Quantidade de Produtos", "Total"
			}
		));
		scrollPane.setViewportView(table);
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeProduto = nomeProd.getText();
				String quantidadeProduto = quantidadeProd.getText();
				String precoProduto = precoProd.getText();
				// Verificar se todos os campos foram preenchidos (adapte conforme necessário)
		        if (nomeProduto.isEmpty() || quantidadeProduto.isEmpty() || precoProduto.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de cadastrar.");
		            return; // Não continue se algum campo estiver vazio
		        }

		        // Converter valores de texto para os tipos apropriados (assumindo que quantidade e preço são números)
		        int quantidade = Integer.parseInt(quantidadeProduto);
		        double preco = Double.parseDouble(precoProduto);

		        // Calcular o total
		        double total = quantidade * preco;

		        // Adicionar uma nova linha à tabela
		        DefaultTableModel model = (DefaultTableModel) table.getModel();
		        model.addRow(new Object[]{nomeProduto, quantidade, preco, total});

			}
		});
		btnCadastrar.setBounds(78, 227, 89, 23);
		frame.getContentPane().add(btnCadastrar);
	}
}
