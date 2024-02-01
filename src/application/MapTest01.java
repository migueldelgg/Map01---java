package application;

import entities.Consumidor;
import entities.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Miguel");
        Consumidor consumidor2 = new Consumidor("Hemilly");

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
        Manga manga2 = new Manga(1L, "Berserk", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Attack on Titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon ball Z", 2.99);

        List <Manga> mangaConsumidorList1 = List.of(manga1, manga2, manga3);
        List <Manga> mangaConsumidorList2 = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor1, mangaConsumidorList1);
        consumidorMangaMap.put(consumidor2, mangaConsumidorList2);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }
            System.out.println();
        }


    }
}
