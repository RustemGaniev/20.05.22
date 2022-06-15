package ru.netology.repository;

import ru.netology.model.Post;

// import javax.servlet.http.HttpServletResponse;
import java.util.*;
// import java.util.concurrent.ConcurrentHashMap;
// import java.util.concurrent.atomic.AtomicLong;

public class PostRepository {
  private Map<Long, Post> posts = new HashMap<>();

  public List<Post> all() {

    return new ArrayList<>(posts.values());
  }

  public Post getById(long id) {

    return posts.get(id);
  }

  public synchronized Post save(Post post) {

    Post newPost = new Post(post.getId(), post.getContent());
    long id = post.getId();
    post.setId(id);
    posts.put(id, newPost);
        return newPost;
  }

  public synchronized void removeById(long id) {

    posts.remove(id);
  }
}
