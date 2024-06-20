package lesson37.homeWork37.archive.dao;

import lesson37.homeWork37.archive.model.Document;

import java.time.LocalDate;

public interface Archive {
    boolean addDocument(Document document);
    boolean removeDocument(int documentId, int folderId);
    boolean updateDocument(int documentId, int folderId, String url);
    Document getDocumentFromFolder(int documentId, int folderId);
    Document[] getAllDocsFromFolder(int folderId);
    Document[] getDocsBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    Document[] getDocumentBetweenDateTwo(LocalDate dateFrom, LocalDate dateTo);
    int size();
    void viewArchive();
}
