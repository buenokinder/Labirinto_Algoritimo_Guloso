
public class Main {

	public static void main(String[] args) {
		Mapa mapa = new Mapa(10,10);
		mapa.addBloqueio(2, 3);
		
		Labirinto labirinto = new Labirinto(mapa);
		Posicao inicial = new Posicao(1,1);
		Posicao _final = new Posicao(3,5);
		
		labirinto.Inicializar(inicial, _final);
	}

}
