package it.uniroma3.aps.playmusic;

import java.util.List;

public class Playlist {
	private List<RigaPlaylist> righe;
	
	public void creaRiga(Brano b, String commento) {
		this.righe.add(new RigaPlaylist(b,commento));
		
	}

}
