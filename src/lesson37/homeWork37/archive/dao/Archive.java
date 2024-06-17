package lesson37.homeWork37.archive.dao;

import lesson37.homeWork37.archive.model.Document;

import java.time.LocalDate;

public interface Archive {
    boolean addDocument(Document document);
    boolean removeDocument(int documentId, int folderId);
    boolean updateDocument(int documentId, int folderId, String url);
    Document getDocumentFromArchive(int documentId, int folderId);
    Document[] getAllDocsFromFolder(int folderId);
    Document[] getDocsBetweenDate(LocalDate daeFrom, LocalDate dateTo);
    int size();
}
