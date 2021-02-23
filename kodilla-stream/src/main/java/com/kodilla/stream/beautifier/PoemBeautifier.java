package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String text, PoemDecorator poemDecorator){
        return poemDecorator.decorate(text);
    }

    //metodę beautify, której jako parametry będzie można przekazać tekst do upiększenia
    // oraz wyrażenie lambda upiększające tekst
}
