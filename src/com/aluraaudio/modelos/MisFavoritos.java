package com.aluraaudio.modelos;

public class MisFavoritos {
    public void adiciones(Audio audio){
        if(audio.getClasificacion() > 8){
            System.out.println(audio.getTitulo() + " Es un favorito top 10");
        } else {
            System.out.println(audio.getTitulo() + " Es popular");
        }
    }
}
