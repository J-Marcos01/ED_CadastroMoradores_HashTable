package model;

public class Morador {

	private int numapto;
	private String nome;
	private String modcarro;
	private String corcarro;
	private String placacarro;
	private static int cta;

	public Morador(int numapto, String nome, String modcarro, String corcarro, String placacarro) {
		this.numapto = numapto;
		this.nome = nome;
		this.modcarro = modcarro;
		this.corcarro = corcarro;
		this.placacarro = placacarro;
	}

	public int getNumapto() {
			return numapto;
	}

	public void setNumapto(int numapto) {
		numapto =(int)((Math.random()*100)+10);
		this.numapto = numapto;
 	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		nome="Morador "+cta;
		this.nome = nome;
		cta++;
	}

	public String getModcarro() {
		return modcarro;
	}

	public void setModcarro(String modcarro) {
		String [] carros= {"Corsa","Fiesta","Palio","Fox","Sandero"};
		modcarro=carros[(int)(Math.random()*5)];
		this.modcarro = modcarro;
	}

	public String getCorcarro() {
		return corcarro;
	}

	public void setCorcarro(String corcarro) {
		String[] cores= {"vermelho","azul","amarelo","branco","preto","cinza"};
		corcarro=cores[(int)(Math.random()*6)];
		this.corcarro = corcarro;
	}

	public String getPlacacarro() {
		return placacarro;
	}

	public void setPlacacarro(String placacarro) {
		String [] letras= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","X","W","Y","Z"};
		int num1=(int)(Math.random()*10);
		int num3=(int)(Math.random()*10);
		int num2=(int)(Math.random()*10);
		int num4=(int)(Math.random()*10);
		placacarro= letras[(int)(Math.random()*26)] + letras[(int)(Math.random()*26)]+letras[(int)(Math.random()*26)]+"-"+String.valueOf(num1)+String.valueOf(num2)+String.valueOf(num3)+String.valueOf(num4);
		this.placacarro = placacarro;
	}

	@Override
	public String toString() {
		return "Morador =" + nome +", Apto= "+numapto+", modcarro=" + modcarro + ", corcarro=" + corcarro
				+ ", placacarro=" + placacarro + "";
	}

	@Override
	public int hashCode() {
		int posicao;
		if(numapto>10) {
			posicao=(numapto/10)-1;
			return posicao;
		}
		posicao=numapto-1;
		return posicao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Morador other = (Morador) obj;
		return numapto == other.numapto;
	}
	
	
	
	
	
}
