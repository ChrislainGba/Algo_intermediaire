package com.xl1.algointermediaire.compression;

import java.util.stream.Collectors;

public class CompressionChaine {

    public static String compresserChaine(String chaine) {
        if (chaine == null || chaine.isEmpty()) {
            return chaine;
        }

        StringBuilder resultat = new StringBuilder();

        chaine.chars()
              .mapToObj(c -> (char) c)
              .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
              .forEach((caractere, occurrences) -> {
                  resultat.append(caractere);
                  if (occurrences > 1) {
                      resultat.append(occurrences);
                  }
              });

        return resultat.toString();
    }

    public static void main(String[] args) {
        String chaine = "aaabbccccdd";
        System.out.println("Chaîne d'origine : " + chaine);

        String chaineComprimee = compresserChaine(chaine);
        System.out.println("Chaîne compressée : " + chaineComprimee);
    }
}
