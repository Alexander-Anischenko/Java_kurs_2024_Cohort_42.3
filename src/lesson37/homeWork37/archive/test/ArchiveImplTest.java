package lesson37.homeWork37.archive.test;

import lesson37.homeWork37.archive.dao.Archive;
import lesson37.homeWork37.archive.dao.ArchiveImpl;
import lesson37.homeWork37.archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

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
        doc[3] = new Document(2, 1,"t1", "url4", LocalDateTime.of(now.minusDays(7).toLocalDate(), LocalTime.MIN));
        doc[4] = new Document(2, 2,"t2", "url5", LocalDateTime.of(now.minusDays(7).toLocalDate(), LocalTime.MIN));
        doc[5] = new Document(2, 3,"t3", "url6", LocalDateTime.of(now.minusDays(7).toLocalDate(), LocalTime.MIN));

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
        archive.viewArchive();
        //can add a new document
        Document document = new Document(3, 1, "title", "url", now.minusDays(1));
        assertTrue(archive.addDocument(document));
        //check size
        assertEquals(7, archive.size());
        System.out.println("<=============================>");
        archive.viewArchive(); // print the array after adding
        //can't add more documents
        Document document1 = new Document(3, 2, "title", "url", now.minusDays(1));
        assertFalse(archive.addDocument(document1));
    }

    @Test
    void removeDocument() {
        // remove existed document
        assertTrue(archive.removeDocument(3, 2)); // doc[5]
        System.out.println("<=============================>");
        archive.viewArchive(); // print the array after removal
        // remove notExisted document
        assertFalse(archive.removeDocument(5, 5));
        //check size
        assertEquals(5, archive.size());
        // find removed document
        assertFalse(archive.removeDocument(3, 2));

    }

    @Test
    void updateDocument() {
        assertTrue(archive.updateDocument(1, 1, "newUrl"));
        assertEquals("newUrl", archive.getDocumentFromFolder(1, 1).getUrl());
    }

    @Test
    void getDocumentFromFolder() {
        // searching exist
        assertEquals(doc[0], archive.getDocumentFromFolder(1, 1));
        // searching not exist
        assertNull(archive.getDocumentFromFolder(5, 5));
    }

    @Test
    void getAllDocsFromFolder() {
        Document[] expected = {doc[3], doc[4], doc[5]};
        Document[] actual = archive.getAllDocsFromFolder(2);// all doc's from folder №2
        Arrays.sort(actual); //sorting
        assertArrayEquals(expected, actual);
    }

    @Test
    void getDocsBetweenDate() {
        LocalDate ld = now.toLocalDate(); // leave only the date
        Document[] actual = archive.getDocsBetweenDate(ld.minusDays(6), ld.minusDays(1));
        for (Document d : actual) {
            System.out.println(d);
        }
        System.out.println("<==============After sorting===============>");
        Arrays.sort(actual);//sorting
        for (Document d : actual) {
            System.out.println(d);
        }
        Document[] expected = {doc[0], doc[1], doc[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
        assertEquals(6, archive.size());
    }

    @Test
    void viewArchiveTest() {
        archive.viewArchive(); // before sorting
        Arrays.sort(doc);
        archive.viewArchive(); //after sorting
    }
}