/**
 * 1. Создать объект класса Текст,
 * используя классы Предложение,
 * Слово.
 * Методы: дополнить текст, вывести
 * на консоль текст, заголовок текста.
 */

import java.util.Arrays;

class Word {
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String word) {
        this.word = word;
    }
}

class Sentence {
    private String sentence = "";
    private char end;

    public void addWord(Word word) {
        this.sentence += " " + word.getWord();
    }

    public String getSentence() {
        return sentence + end;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public char getEnd() {
        return end;
    }

    public void setEnd(char end) {
        this.end = end;
    }
}

class Text {
    private String header;
    private String text = "";

    public void addSentence(Sentence sentence) {
        this.text += sentence.getSentence() + " ";
    }

    public String toString() {
        return text;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}

public class AggComp1 {

    public static void main(String[] args) {

        Text text = new Text();
        text.setHeader("Test");

        Sentence sentence1 = new Sentence();

        Word word11 = new Word("What");
        Word word12 = new Word("a");
        Word word13 = new Word("beautiful");
        Word word14 = new Word("day");


        for (Word word1 : Arrays.asList(word11, word12, word13, word14)) {
            sentence1.addWord(word1);
        }
        sentence1.setEnd('!');

        text.addSentence(sentence1);

        Sentence sentence2 = new Sentence();

        Word word21 = new Word("Can");
        Word word22 = new Word("it");
        Word word23 = new Word("be");
        Word word24 = new Word("even");
        Word word25 = new Word("better");


        for (Word word : Arrays.asList(word21, word22, word23, word24, word25)) {
            sentence2.addWord(word);
        }
        sentence2.setEnd('?');

        text.addSentence(sentence2);
        System.out.println(text.getHeader());
        System.out.println();
        System.out.println(text.toString());
    }

}
