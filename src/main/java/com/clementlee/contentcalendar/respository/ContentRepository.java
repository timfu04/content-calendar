package com.clementlee.contentcalendar.respository;

import com.clementlee.contentcalendar.model.Content;
import com.clementlee.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    // Query derivation
    List<Content> findAllByTitleContains(String keyword);

    // Manual defined query
    @Query("""
        SELECT * FROM Content
        where status = :status
    """)
    List<Content> listByStatus(@Param("status") Status status);
}
