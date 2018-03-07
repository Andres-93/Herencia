package Ejercicio1.ej;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import Ejercicio1.pojo.*;

public class UsoCds {

	public static void main(String[] args) {
		
		
		ArrayList<CD> lista = new ArrayList<CD>();
		
		audio aud = new audio(123, "audio", "mp3");
		lista.add(aud);		
		aud = new audio(456, "audio", "mp3");
		lista.add(aud);		
		aud = new audio(777, "audio", "wma");
		lista.add(aud);		
		datos dat = new datos(678, "datos", "texto");
		lista.add(dat);		
		dat = new datos(858, "datos", "video");
		lista.add(dat);	
		musica mus = new musica(333, "musica", "rap");
		lista.add(mus);
		mus = new musica(124, "musica", "hiphop");
		lista.add(mus);
		mus = new musica(876, "musica", "pop");
		lista.add(mus);
		dat = new datos(355, "datos", "imagen");
		lista.add(dat);
		mus = new musica(455, "musica", "trap");
		lista.add(mus);
		aud = new audio(988, "audio", "mp4");
		lista.add(aud);
		mus = new musica(699, "musica", "dance");
		lista.add(mus);
		aud = new audio(233, "audio", "avi");
		lista.add(aud);
		dat = new datos(252, "datos", "otro");
		lista.add(dat);
		
		Collections.sort(lista);
		
		for(CD lista1 : lista) {
			System.out.println(lista1);
		}


	}

}
