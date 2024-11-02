package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.Lista.Lista;
import model.IPredio;
import model.Morador;

public class PredioController implements IPredio {

	 Lista <Morador>[] tabelaHashMorador;
	
	 public void inicializaTabela() {
		
		tabelaHashMorador=new Lista[10];
		
		int tamanho=tabelaHashMorador.length;
		
		for (int i=0;i<tamanho;i++) {
			tabelaHashMorador[i]=new Lista<Morador>();
		}

	}
	public void cadastraModaror() throws Exception {
			
		Morador m=new Morador(0," "," "," "," ");		
			m.setCorcarro(" ");
			m.setModcarro(" ");
			m.setNumapto(0);
			m.setPlacacarro(" ");
			m.setNome(" ");
			
		 cadastro(m);		 
		 JOptionPane.showMessageDialog(null,m.getNome()+" Cadastrado","Sucesso ao cadastrar",JOptionPane.INFORMATION_MESSAGE);
		
		}	
	private void cadastro(Morador m) throws Exception {
	
		int posicao=m.hashCode();
		
		
		tabelaHashMorador[posicao].addFirst(m);
		
		
	}
	@Override
	public void consultaMorador(int andar) throws Exception {
		
		Morador aux=new Morador(andar, null, null, null, null);
		int pos=aux.hashCode();
		
		int tamanho=tabelaHashMorador[pos].size();
		
		System.out.println(tamanho+" Modarores do "+andar+" º Andar" );
		for(int i=0;i<tamanho;i++) {
		  aux=tabelaHashMorador[pos].get(i);
		 	System.out.println(aux );
		}
		
		}	

	@Override
	public void excluirMorador(int apto) throws Exception {
		Morador aux=new Morador(apto, null, null, null, null);
		
		int busca=aux.hashCode();
		int tamanho=tabelaHashMorador[busca].size();
		int remover=0;
		
		for(int i=0;i<tamanho;i++) {
		 aux=tabelaHashMorador[busca].get(i);
		 	if(apto==aux.getNumapto()) {
		 		remover=i;
		 	}
		}
		JOptionPane.showMessageDialog(null,aux.getNome()+", excluido do sistema","Exclusão de Morador",JOptionPane.ERROR_MESSAGE);
	 	tabelaHashMorador[busca].remove(remover);
	 	
	}
	
	

	
}
