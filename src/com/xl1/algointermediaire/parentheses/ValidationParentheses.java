package com.xl1.algointermediaire.parentheses;

import java.util.Stack;

public class ValidationParentheses {

    public static boolean estParenthesee(String expression) {
        Stack<Character> pile = new Stack<>();

        for (char caractere : expression.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                // Si c'est une parenthèse ouvrante, empiler sur la pile
                pile.push(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                // Si c'est une parenthèse fermante, vérifier la correspondance avec la parenthèse au sommet de la pile
                if (pile.isEmpty() || !parenthesesCorrespondent(pile.pop(), caractere)) {
                    return false; // Mauvaise correspondance
                }
            }
        }

        return pile.isEmpty(); // L'expression est bien parenthésée si la pile est vide à la fin
    }

    private static boolean parenthesesCorrespondent(char ouvrante, char fermante) {
        return (ouvrante == '(' && fermante == ')') ||
               (ouvrante == '[' && fermante == ']') ||
               (ouvrante == '{' && fermante == '}');
    }

    public static void main(String[] args) {
        //String expressionCorrecte = "((a + b) * (c - d))";
        String expressionIncorrecte = "((a + b) * (c - d)";

        //System.out.println(estParenthesee(expressionCorrecte)); // Devrait renvoyer true
        System.out.println(estParenthesee(expressionIncorrecte)); // Devrait renvoyer false
    }
}
