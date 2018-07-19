
package org.krb.forum.entity.repository;

import java.util.Set;

import org.krb.forum.entity.Post;
import org.krb.forum.entity.Topic;
import org.krb.forum.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Integer> {
    
    Set<Post> findByUser(User user);
    
    Set<Post> findByTopic(Topic topic);
    
    Set<Post> findAllByOrderByCreationDateDesc();
    
    Set<Post> findTop5ByOrderByCreationDateDesc();
}
