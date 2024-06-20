package lesson37.homeWork37.archive.dao;

import lesson37.homeWork37.archive.model.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class ArchiveImpl implements Archive{

    // fields
    private Document[] documents;
    private int size;

    // constructor

    public ArchiveImpl(int capacity) {
        this.documents = new Document[capacity];
        this.size = 0;
    }
    // this comparator allows you to sort objects of type Document first by date, then by documentId
    static Comparator<Document> comparator = (d1, d2) -> {
        int res = d1.getCreationDate().compareTo(d2.getCreationDate());
        //return if (res != 0) {
        //res = res;
        //} else {
        //    Integer.compare(d1.getDocumentId(), d2.getDocumentId());
        //}
        //то-же самое, что тернарное выражение ниже is the same as the ternary expression below
        return res != 0 ? res : Integer.compare(d1.getDocumentId(), d2.getDocumentId());
    };

    @Override
    public boolean addDocument(Document document) {
        //bad cases
        if (document == null || size == documents.length || getDocumentFromFolder(document.getDocumentId(), document.getFolderId()) != null) {
            return false;
        }
        // find index to insert(найти индекс для вставки)
        int index = Arrays.binarySearch(documents, 0, size, document, comparator);
        // index treatment обработка
//        if (index >= 0) {
//            index = index;
//        } else {
//            index = -index - 1;
//        }
        //используем тернарное выражение вместо if else
        index = index >= 0? index : -index -1;
        // shift array from index right on 1 position
        System.arraycopy(documents, index, documents, index + 1, size - index);
        documents[index] = document;
        size++;
        return true;
    }

    @Override
    public boolean removeDocument(int documentId, int folderId) {
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId() == documentId && documents[i].getFolderId() == folderId) {
                //оставшуюся часть массива справа от удаляемого экземпляра объекта сдвигаем на 1 позицию влево
                System.arraycopy(documents, i + 1, documents, i, size - 1 - i);
                //уменьшаем длинну массива на -1
                //size--;
                documents[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateDocument(int documentId, int folderId, String url) {
        Document document = getDocumentFromFolder(documentId, folderId);
        if (document == null) {
            return false;
        }
        document.setUrl(url); // update url
        return true;
    }

    @Override
    public Document getDocumentFromFolder(int documentId, int folderId) {
        Document pattern = new Document(folderId, documentId, null, null, null);//pattern образец
        for (Document d : documents) {
            if (pattern.equals(d)) {
                return d;
            }
        }
//        for (int i = 0; i < size; i++) {
//            Document document = documents[i];
//            if (document.getDocumentId() == documentId && document.getFolderId() == folderId) {
//                return document;
//            }
//        }
        return null;
    }

    @Override
    public Document[] getAllDocsFromFolder(int folderId) {

        return findByPredicate(p -> p.getFolderId() == folderId);
    }

    private Document[] findByPredicate(Predicate<Document> predicate) {
        //объект res с длинной массива size (избыточная длинна)
        //res object with array length size (excessive length)
        Document[] res = new Document[size];
        int j = 0; // count documents in archive
        for (int i = 0; i < size; i++) {
            if (predicate.test(documents[i])) {
                res[j] = documents[i];
                j++;
            }
        }
        // обрезали массив от null clipped the array from null
        //скопировали массив сам на себя, теперь он без элементов null
        //copied the array onto itself, now it has no null elements
        return Arrays.copyOf(res, j);
    }

    @Override
    public Document[] getDocsBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        Document pattern = new Document(0, Integer.MIN_VALUE, null, null, dateFrom.atStartOfDay());////pattern образец шаблон
        //левый край left edge
        int from = Arrays.binarySearch(documents, 0, size, pattern, comparator);
        from = from >=0 ? from : - from - 1;
        // правый край right edge
        pattern = new Document(0, Integer.MIN_VALUE, null, null, LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = Arrays.binarySearch(documents, 0, size, pattern, comparator);
        to = to >= 0 ? to : - to - 1;
        return Arrays.copyOfRange(documents, from, to);
    }

    @Override
    public Document[] getDocumentBetweenDateTwo(LocalDate dateFrom, LocalDate dateTo) {
        return new Document[0];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void viewArchive() {
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
        System.out.println("You have " + size + " documents.");
    }
}
