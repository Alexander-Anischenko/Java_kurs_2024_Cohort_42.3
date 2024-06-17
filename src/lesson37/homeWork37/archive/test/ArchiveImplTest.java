package lesson37.homeWork37.archive.test;

import lesson37.homeWork37.archive.dao.Archive;
import lesson37.homeWork37.archive.dao.ArchiveImpl;
import lesson37.homeWork37.archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveImplTest {

    Archive archive;
    Document[] doc;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        archive = new ArchiveImpl(7);
        doc = new Document[6];
        doc[0] = new Document(1, 1,"t1", "url1", now.minusDays(2));
        doc[1] = new Document(1, 2,"t2", "url2", now.minusDays(3));
        doc[2] = new Document(1, 3,"t3", "url3", now.minusDays(5));
        doc[3] = new Document(2, 1,"t1", "url4", now.minusDays(7));
        doc[4] = new Document(2, 2,"t2", "url5", now.minusDays(7));
        doc[5] = new Document(2, 3,"t3", "url6", now.minusDays(7));

        // put doc into archive
        for (Document d : doc) {
            archive.addDocument(d);
        }
    }

    @Test
    void addDocument() {
        //can't add null
        assertFalse(archive.addDocument(null));
        //can't add existed document
        assertFalse(archive.addDocument(doc[2]));
        //can add a new document
        Document document = new Document(3, 1, "title", "url", now.minusDays(1));
        assertTrue(archive.addDocument(document));
        //check size
        assertEquals(7, archive.size());
        //can't add more documents
        Document document1 = new Document(3, 2, "title", "url", now.minusDays(1));
        assertFalse(archive.addDocument(document1));
    }

    @Test
    void removeDocument() {
    }

    @Test
    void updateDocument() {
    }

    @Test
    void getDocumentFromArchive() {
    }

    @Test
    void getAllDocsFromFolder() {
    }

    @Test
    void getDocsBetweenDate() {
    }

    @Test
    void size() {
    }
}