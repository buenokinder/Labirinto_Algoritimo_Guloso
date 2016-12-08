
public class Mapa {
	
	public char[][] mapa;
	public int linhas;
	public int colunas;
	
	
	public Mapa(int linhas, int colunas){
		this.linhas = linhas;
		this.colunas = colunas;
		mapa = new char[linhas][colunas];
		for(int i = 0; i < linhas; i++ ){
			for(int j = 0; j<colunas; j++ ){
				mapa[i][j] = TipoElementoLabirinto.Livre.asChar();
			}
			
		}
	}
	
	
	public void Imprimir(){
		for(int i = 0; i < linhas; i++ ){
			for(int j = 0; j<colunas; j++ ){
				System.out.print(mapa[i][j]); 
			}
			System.out.println("");
		}
		
	}
	public void addBloqueio(int linha, int coluna){
		if(linha < 0 || linha > this.linhas || coluna < 0 || coluna > this.colunas )
			return;
		
		mapa[linha][coluna] = TipoElementoLabirinto.Bloqueado.asChar();
		
	}
	public boolean isBlocked(Posicao value){
		if(mapa[value.linha][value.coluna] == TipoElementoLabirinto.Bloqueado.asChar())
			return true;
		
		return false;
	}
	
	public boolean isFree(Posicao value){
		if(mapa[value.linha][value.coluna] == TipoElementoLabirinto.Livre.asChar())
			return true;
		
		return false;
	}
	
}
