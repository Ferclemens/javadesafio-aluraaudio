package com.aluraaudio.principal;

import com.aluraaudio.modelos.Cancion;
import com.aluraaudio.modelos.MisFavoritos;
import com.aluraaudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 3000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 200; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 4000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total de reproducciones " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta " + miCancion.getTotalDeMeGusta());

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.adiciones(miPodcast);
        misFavoritos.adiciones(miCancion);
    }
}
