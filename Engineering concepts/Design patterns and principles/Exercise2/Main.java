package com.example;

import com.example.factory.DocumentFactory;
import com.example.factory.WordDocumentFactory;
import com.example.factory.PdfDocumentFactory;
import com.example.factory.ExcelDocumentFactory;

public class Main {
    public static void main(String[] patternArgs) {
        System.out.println("=== Factory Method Pattern Demo ===\n");

        DocumentFactory wordFactory = new WordDocumentFactory();
        System.out.println("Client requests a Word Document:");
        wordFactory.manageDocument(); 
        System.out.println();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        System.out.println("Client requests a PDF Document:");
        pdfFactory.manageDocument();
        System.out.println();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        System.out.println("Client requests an Excel Document:");
        excelFactory.manageDocument();
    }
}
