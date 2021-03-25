package com.david.pattern.behavioral.visitor;

public class Compressor implements Visitor {

    @Override
    public void visit(PdfFile pdfFile) {
        System.out.println("Compress pdf.");
    }

    @Override
    public void visit(PPTFile pptFile) {
        System.out.println("Compress PPT.");
    }

    @Override
    public void visit(WordFile wordFile) {
        System.out.println("Compress word.");
    }
}
