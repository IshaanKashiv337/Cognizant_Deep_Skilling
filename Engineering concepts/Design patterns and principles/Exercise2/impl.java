package com.example.factory;

import com.example.document.Document;
import com.example.document.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

package com.example.factory;

import com.example.document.Document;
import com.example.document.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

package com.example.factory;

import com.example.document.Document;
import com.example.document.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
