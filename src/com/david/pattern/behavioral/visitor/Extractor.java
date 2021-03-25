package com.david.pattern.behavioral.visitor;

public class Extractor implements Visitor {

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("Extract pdf.");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("Extract PPT.");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Extract word.");
    }
}
