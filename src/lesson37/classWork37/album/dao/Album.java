package lesson37.classWork37.album.dao;

import lesson37.classWork37.album.model.Photo;

import java.time.LocalDate;

public interface Album {
    boolean addPhoto(Photo photo);
    boolean removePhoto(int photoId, int albumId);
    boolean updatePhoto(int photoId, int albumId, String url);
    Photo getPhotoFromAlbum(int photoId, int albumId);
    Photo[] getAllPhotosFromAlbum(int albumId);
    Photo[] getPhotoBetweenDate(LocalDate daeFrom, LocalDate dateTo);
    int size();
}
