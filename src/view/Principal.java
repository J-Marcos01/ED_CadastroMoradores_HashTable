package view;

import javax.swing.JOptionPane;

import controller.PredioController;

public class Principal {

	public static void main(String[] args) throws Exception {

		PredioController predcont = new PredioController();
		predcont.inicializaTabela();	
	int opc=0;
	
	while(opc!=9) {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"\n1- Para cadastrar morador"
				+ "\n2-Para consultar morador\n3-Para Excluir morador\n9-Fim.","Digite uma opção :",JOptionPane.INFORMATION_MESSAGE));
		switch (opc) {
		case 1: {
		
			predcont.cadastraModaror();
			
			break;
		}
		case 2: {
			int andar=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o Andar","Pesquisar moradores",JOptionPane.INFORMATION_MESSAGE));
			predcont.consultaMorador(andar);		
			break;
		}
		case 3: {
			int apto=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o apto","Excluir morador",JOptionPane.INFORMATION_MESSAGE));
			predcont.excluirMorador(apto);
			break;
		}
		case 9: {
			JOptionPane.showMessageDialog(null,"Obrigado , Fim","Saindo do sistema", JOptionPane.ERROR_MESSAGE);
			break;
		}
		default:
			JOptionPane.showMessageDialog(null,"Valor inválido");
		}
	}
		
	}

}
