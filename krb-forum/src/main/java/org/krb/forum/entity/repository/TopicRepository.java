
package org.krb.forum.entity.repository;

import java.util.Set;

import org.krb.forum.entity.Section;
import org.krb.forum.entity.Topic;
import org.krb.forum.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicRepository extends JpaRepository<Topic, Integer> {
    
    Set<Topic> findBySection(Section section);
    
    Set<Topic> findByUser(User user);
    
    Set<Topic> findAllByOrderByCreationDateDesc();
    
    Set<Topic> findTop5ByOrderByCreationDateDesc();
    
    
}
