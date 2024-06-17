package lesson37.classWork37.album.tests;

import lesson37.classWork37.album.dao.Album;
import lesson37.classWork37.album.dao.AlbumImpl;
import lesson37.classWork37.album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album album;
    Photo[] ph;
    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {

        album = new AlbumImpl(7);

        ph = new Photo[6];
        ph[0] = new Photo(1, 1,"t1", "url1", now.minusDays(2)); // newest photo
        ph[1] = new Photo(1, 2,"t2", "url2", now.minusDays(3));
        ph[2] = new Photo(1, 3,"t3", "url3", now.minusDays(5));
        ph[3] = new Photo(2, 1,"t1", "url4", now.minusDays(7));
        ph[4] = new Photo(2, 2,"t2", "url5", now.minusDays(7));
        ph[5] = new Photo(2, 3,"t3", "url6", now.minusDays(7)); // oldest photos

        // put ph into album
//        for (int i = 0; i < ph.length; i++) {
//            album.addPhoto(ph[i]);
//        }

        for (Photo p : ph) {
            album.addPhoto(p);
        }

    }

    @Test
    void addPhoto() {
        //can't add null
        assertFalse(album.addPhoto(null));
        //can't add existed photo
        assertFalse(album.addPhoto(ph[2]));
        //can add a new photo
        Photo photo = new Photo(3, 1, "title", "url", now.minusDays(1));
        assertTrue(album.addPhoto(photo));
        //check size
        assertEquals(7, album.size());
        //can't add more photos
        Photo photo1 = new Photo(3, 2, "title", "url", now.minusDays(1));
        assertFalse(album.addPhoto(photo1));
    }

    @Test
    void removePhoto() {
        //remove existed photo
        assertTrue(album.removePhoto(3, 2));
        // remove notExisted photo
        assertFalse(album.removePhoto(5, 5));
        //check size
        assertEquals(5, album.size());
        // find removed photo
        assertFalse(album.removePhoto(3, 2));
    }

    @Test
    void updatePhoto() {
        assertTrue(album.updatePhoto(1, 1, "newUrl"));
        assertEquals("newUrl", album.getPhotoFromAlbum(1, 1).getUrl());
    }

    @Test
    void getPhotoFromAlbum() {
        assertEquals(ph[0], album.getPhotoFromAlbum(1, 1));
        assertNull(album.getPhotoFromAlbum(5, 5));
    }

    @Test
    void getAllPhotosFromAlbum() {
        Photo[] expected = {ph[3], ph [4], ph[5]};
        Photo[] actual = album.getAllPhotosFromAlbum(2);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void getPhotoBetweenDate() {
        LocalDate ld = now.toLocalDate();
        Photo[] actual = album.getPhotoBetweenDate(ld.minusDays(6), ld.minusDays(1));
        Arrays.sort(actual);
        Photo[] expected = {ph[0], ph[1], ph[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
        assertEquals(6, album.size());
    }
}