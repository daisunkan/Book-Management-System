package com.daisunkan.bms.service;

import java.util.List;
import java.util.Map;

import com.daisunkan.bms.model.BookInfo;

public interface BookInfoService {
    Integer getCount();

    List<BookInfo> queryBookInfos();

    BookInfo queryBookInfoById(Integer bookid);

    Integer getSearchCount(Map<String, Object> params);

    List<BookInfo> searchBookInfosByPage(Map<String, Object> params);

    Integer addBookInfo(BookInfo bookInfo);

    Integer deleteBookInfo(BookInfo bookInfo);

    Integer deleteBookInfos(List<BookInfo> bookInfos);

    Integer updateBookInfo(BookInfo bookInfo);
}
