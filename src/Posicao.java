public class Posicao {
	
	public int coluna;
	public int linha;
	
	
	
	public Posicao(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	
	public boolean IsValid(){
		if(this.coluna < 0 || this.linha < 0)
			return false;
		
		return true;
	}
	
	public boolean IsInsideArray(int linhas, int colunas){
		if(this.linha > linhas || this.coluna > colunas )
			return false;
		
		return true;
	}
	
	public Posicao Mover( Posicao _final){
	
			if(this.coluna == _final.coluna)
				return MoveMelhorLinha(_final);
			
			if(this.linha == _final.linha)
				return MoveMelhorColuna(_final);
			
			
			if(Math.abs(this.coluna-_final.coluna) > Math.abs(this.linha-_final.linha) )
				return MoveMelhorLinha(_final);
			else
				return MoveMelhorColuna(_final);
		
		
		
	}


	private Posicao MoveMelhorColuna(Posicao _final) {
		if(this.coluna > _final.coluna)
			return new Posicao(this.linha, this.coluna-1);
		else
			return new Posicao(this.linha, this.coluna+1);
	}


	private Posicao MoveMelhorLinha(Posicao _final) {
		if(this.linha > _final.linha)
			return new Posicao(this.linha-1, this.coluna);
		else
			return new Posicao(this.linha+1, this.coluna);
	}
	
	public boolean Equals(Posicao value){
		if(this.coluna == value.coluna && this.linha == value.linha)
			return true;
		
		return false;
		
	}
}