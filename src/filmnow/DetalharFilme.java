package filmnow;

public class DetalharFilme {
	
	private Filme filme;
	private int posicao;
	
	public DetalharFilme(Filme filme, int posicao) {
		this.filme = filme;
		this.posicao = posicao;
	}
	
	public String locaisDeExibicao() {
		String saida = "";
		
		for(String local: this.filme.getLocais()) {
			if (local != null) {
				saida += local + "\n";
			}
		}


		return saida.trim();
	}

	@Override
	public String toString() {
		if(this.posicao > 100 || this.posicao < 1) {
			return "POSIÇÃO INVÁLIDA!";
		}
		if(this.filme == null) {
			return "";
		}
		
	    return "\n" + this.filme.getNome() + ", " + this.filme.getAno() + "\n" + locaisDeExibicao();
	}
}
