package lesson37.homeWork37.archive.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Document implements Comparable<Document>{

    //fields
    private int folderId;
    private int documentId;
    private String title;
    private String url;
    private LocalDateTime creationDate;

    //constructor

    public Document(int folderId, int documentId, String title, String url, LocalDateTime creationDate) {
        this.folderId = folderId;
        this.documentId = documentId;
        this.title = title;
        this.url = url;
        this.creationDate = creationDate;
    }

    public int getFolderId() {
        return folderId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Document{" +
                "folderId=" + folderId +
                ", documentId=" + documentId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document document)) return false;
        return folderId == document.folderId && documentId == document.documentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folderId, documentId);
    }

    @Override
    public int compareTo(Document o) {
        //sort by folderId and then by documentId
        int res = Integer.compare(folderId, o.folderId); //сравниваем по documentId
        return res != 0 ? res : Integer.compare(documentId, o.documentId);
    }
}
