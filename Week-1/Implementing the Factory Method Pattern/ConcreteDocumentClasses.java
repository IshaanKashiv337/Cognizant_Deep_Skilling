package com.example.document;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document (.docx)...");
    }

    @Override
    public void save() {
        System.out.println("Saving Word Document...");
    }
}

package com.example.document;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document (.pdf)...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF Document...");
    }
}

package com.example.document;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Spreadsheet (.xlsx)...");
    }

    @Override
    public void save() {
        System.out.println("Saving Excel Spreadsheet...");
    }
}
