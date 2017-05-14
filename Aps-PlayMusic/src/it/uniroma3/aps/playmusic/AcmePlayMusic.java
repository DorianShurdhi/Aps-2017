package it.uniroma3.aps.playmusic;

public class AcmePlayMusic {
	private Album albumCorrente;
	private Playlist playlistCorrente;
	
	

	public void inserisciBranoNellaPlaylist(int posizione,String commento){
		Brano b=this.albumCorrente.getBrano(posizione);
		this.playlistCorrente.creaRiga(b,commento);
	}
	public void confermaPlaylist(String titolo,String descrizione){

	}
	
	public void annullaInserimento(){
		this.playlistCorrente=null;
	}


}
