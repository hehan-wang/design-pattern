package com.david.pattern.behavioral.visitor;

public interface Visitor {
    void visit(PdfFile pdfFile);

    void visit(PPTFile pptFile);

    void visit(WordFile wordFile);
}
