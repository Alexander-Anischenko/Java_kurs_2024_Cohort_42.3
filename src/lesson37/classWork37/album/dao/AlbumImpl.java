package lesson37.classWork37.album.dao;

import lesson37.classWork37.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class AlbumImpl implements Album{
    //fields
    private Photo[] photos;
    private int size;

    //constructor
    public AlbumImpl(int capacity) {
        this.photos = new Photo[capacity];
        this.size = 0;
    }
    static Comparator<Photo> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());
        return  res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };

    @Override
    public boolean addPhoto(Photo photo) {
        //bad cases
        if (photo == null || size == photos.length || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        // find index to insert
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator);
        // index treatment
        index = index >= 0? index : -index -1;
        // shift array from index right on 1 position
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        return false;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            Photo photo = photos[i];
            if (photo.getPhotoId() == photoId && photo.getAlbumId() == albumId) {
                return photo;
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotosFromAlbum(int albumId) {
        return new Photo[0];
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate daeFrom, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }
}
