package lesson37.homeWork37.archive.dao;

import lesson37.classWork37.album.model.Photo;
import lesson37.homeWork37.archive.model.Document;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ArchiveImpl implements Archive{

    // fields
    private Document[] documents;
    private int size;

    // constructor

    public ArchiveImpl(int capacity) {
        this.documents = new Document[capacity];
        this.size = 0;
    }
    static Comparator<Document> comparator = (d1, d2) -> {
        int res = d1.getCreationDate().compareTo(d2.getCreationDate());
        return res!= 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());
    };

    @Override
    public boolean addDocument(Document document) {
        //bad cases
        if (document == null || size == documents.length || getDocumentFromArchive(document.getDocumentId(), document.getFolderId()) != null) {
            return false;
        }
        // find index to insert(найти индекс для вставки)
        int index = Arrays.binarySearch(documents, 0, size, document, comparator);
        // index treatment обработка
        index = index >= 0? index : -index -1;
        // shift array from index right on 1 position
        System.arraycopy(documents, index, documents, index + 1, size - index);
        documents[index] = document;
        size++;
        return true;
    }

    @Override
    public boolean removeDocument(int documentId, int folderId) {
        return false;
    }

    @Override
    public boolean updateDocument(int documentId, int folderId, String url) {
        return false;
    }

    @Override
    public Document getDocumentFromArchive(int documentId, int folderId) {
        for (int i = 0; i < size; i++) {
            Document document = documents[i];
            if (document.getDocumentId() == documentId && document.getFolderId() == folderId) {
                return document;
            }
        }
        return null;
    }

    @Override
    public Document[] getAllDocsFromFolder(int folderId) {
        return new Document[0];
    }

    @Override
    public Document[] getDocsBetweenDate(LocalDate daeFrom, LocalDate dateTo) {
        return new Document[0];
    }

    @Override
    public int size() {
        return size;
    }
}
