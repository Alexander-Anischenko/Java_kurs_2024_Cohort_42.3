package lesson37.classWork37.album.dao;

import lesson37.classWork37.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

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
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId) {
                // оставшуюся часть сделать -1
                System.arraycopy(photos, i + 1, photos, i, size - 1 - i);
                //size--;
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId, albumId);
        if (photo == null) {
            return false;
        }
        photo.setUrl(url); // update url
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId, photoId, null, null, null); //pattern образец
//        for (int i = 0; i < size; i++) {
//            if (pattern.equals(photos[i])) {
//                return photos[i];
//            }
//        }
        for (Photo p : photos) {
            if (pattern.equals(p)) {
                return p;
            }
        }
//        for (int i = 0; i < size; i++) {
//            Photo photo = photos[i];
//            if (photo.getPhotoId() == photoId && photo.getAlbumId() == albumId) {
//                return photo;
//            }
//        }
        return null;
    }

    @Override
    public Photo[] getAllPhotosFromAlbum(int albumId) {
        return findByPredicate(p -> p.getAlbumId() == albumId); // условия для предиеата
    }

    private Photo[] findByPredicate(Predicate<Photo> predicate) {
        Photo[] res = new Photo[size]; //все фото могут туда попасть
        int j = 0; // count photos in album
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])) {
                res[j] = photos[i];
                j++;
            }
        }
        return Arrays.copyOf(res, j); // обрезали массив от null
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate daeFrom, LocalDate dateTo) {
        Photo pattern = new Photo(0, Integer.MIN_VALUE, null, null, daeFrom.atStartOfDay());
        // левый край
        int from = Arrays.binarySearch(photos, 0, size, pattern, comparator);
        from = from >= 0 ? from : - from - 1;
        // правый край
        pattern = new Photo(0, Integer.MIN_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = Arrays.binarySearch(photos, 0, size, pattern, comparator);
        to = to >= 0 ? to : - to - 1;
        return Arrays.copyOfRange(photos, from, to);
    }

    @Override
    public int size() {
        return size;
    }
}
