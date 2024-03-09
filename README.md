# Test project for Spring Boot YouTube course

Reviewing, learning-from and enjoying Dan Vega's Spring Boot Crash Course [YouTube video](https://www.youtube.com/watch?v=UgX5lgv4uVM). Below are my notes on the material.

## Testing example with httpie
Example of using [httpie](https://httpie.io/docs/cli/optional-get-and-post) to post json payload into a POST mapping controller action

file: src/main/resources/post.json
```json
{
    "id": 10,
    "title": "My 10th Blog Post",
    "desc": "My 10th blog post",
    "status": "IDEA",
    "contentType": "ARTICLE",
    "dateUpdated": null,
    "url": "null"
}
```

cmdline:
```
$ http POST localhost:8080/api/content < src/main/resources/post.json
```

## Progress Tracker
Pick up at 1:34:10 mark - Vite