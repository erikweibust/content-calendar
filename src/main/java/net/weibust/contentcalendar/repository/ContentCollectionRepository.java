package net.weibust.contentcalendar.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.annotation.PostConstruct;
import net.weibust.contentcalendar.model.Content;
import net.weibust.contentcalendar.model.Status;
import net.weibust.contentcalendar.model.Type;

import java.util.Optional;
import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter( c -> c.id().equals(id)).findFirst();
    }

    public void save(Content content) {
        // if exists, replace; otherwise add
        // I think there is a code-smell here; I'll take another look if this works
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    @PostConstruct
    private void init() {
        Content content = new Content(1, "My First Blog Post", "My first blog post", Status.IDEA, Type.ARTICLE, LocalDateTime.now(), null, "null");

        contentList.add(content); 
    }

    public boolean existsById(Integer id) {
        return contentList.stream().filter( c -> c.id().equals(id)).count() ==1;
        
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }

}
