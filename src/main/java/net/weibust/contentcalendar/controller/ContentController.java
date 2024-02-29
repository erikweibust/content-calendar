package net.weibust.contentcalendar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.weibust.contentcalendar.repository.ContentCollectionRepository;

@RestController
@RequestMapping("/api/content")
public class ContentController {

        private final ContentCollectionRepository repository;

        public ContentController(ContentCollectionRepository repository) {
            this.repository = repository;
        }

}
