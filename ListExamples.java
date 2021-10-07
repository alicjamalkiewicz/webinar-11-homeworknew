package pl.test.collection_examples;

import java.util.*;

/*
- przejdź pętlą for (klasyczny for) po liście namesList i wyświetl elementy (do sprawdzenia jak pobrać rozmiar listy)
 */

// UWAGA Lista operuje tylko na obiektach, nie można używać typów prostych
public class ListExamples {
    public static void main(String[] args) {
        // ArrayList -> jeśli głównie wyszukiwanie elementów w liście
        // LinkedList -> dużo operacji usuwania/dodawania elementów
        List<String> namesList = new ArrayList<String>();

        // dodawanie elementu do listy
        namesList.add("Wojtek");
        System.out.println(namesList);

        namesList.add("Agata");
        namesList.add("Tomasz");
        namesList.add("Ania");
        System.out.println(namesList);

        // dodanie elementu w określonym miejscu (index)
        namesList.add(1, "Dominika");
        System.out.println(namesList);

        // pobranie konkretnego elementu
        System.out.println(namesList.get(3)); // w tablicach pisaliśmy tab[3]

        // tworzenie tablicy z listy
        // new String[0] -> tworzenie nowej tablicy
        String[] namesTab = namesList.toArray(new String[0]);
        System.out.println(namesTab[0]);
        System.out.println(namesTab[1]);

        // sortowanie elementów listy na dwa sposoby
        namesList.sort(null);
        System.out.println(namesList);
        Collections.sort(namesList);
        System.out.println(namesList);

        // można dodawać duplikaty
        namesList.add("Ania");
        System.out.println(namesList);

        // ostatnie wystąpienie elementu
        System.out.println(namesList.lastIndexOf("Ania"));

        // usuwanie elementu - zawsze usuwa pierwsze wystąpienie
        namesList.remove("Wojtek");
        System.out.println(namesList);
        namesList.remove("Ania");
        System.out.println(namesList);

        // zamiana elementu pod konkretnym indeksem
        namesList.set(0, "Kamil");
        System.out.println(namesList);

        // sprawdzenie czy element znajduje się w liście
        System.out.println(namesList.contains("Tomasz"));

        // podajemy nazwę pod jaką wystąpi kolejny elemnt a za operatorem strzałki wykonujemy kod
        namesList.forEach(element -> System.out.println(element));

        // czyszczenie listy
//        namesList.clear();
//        System.out.println(namesList);

        // zamiana tablicy na listę
        Integer[] example = new Integer[] {1, 2, 3};
        List<Integer> list = Arrays.asList(example);

        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < example.length; i++) {
            list2.add(example[i]);
        }

        System.out.println("ZADANIE DOMOWE 04.10");

        System.out.println(namesList);

        int size = namesList.size();
        System.out.println(size);

        for (String n : namesList){
            System.out.println(n);
        }
        //poprawiona lista
        for (int name = 0; name < size; name++){
            System.out.println(namesList.get(name));
        }
    }
}
