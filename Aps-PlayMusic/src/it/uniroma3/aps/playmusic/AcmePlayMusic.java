package it.uniroma3.aps.playmusic;

public class AcmePlayMusic {
	private Album albumCorrente;
	private Playlist playlistcorrente;
	
	public void inserisciBranoNellaPlaylist(int posizione,String commento){
		Brano b=this.albumCorrente.getBrano(posizione);
		this.playlistcorrente.creaRiga(b,commento);
		
	}
}
