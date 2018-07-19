
package org.krb.forum.service.model;

import org.krb.forum.controller.model.UserProfile;


public interface UserProfileService {
    
    public UserProfile findOne(int userId);
    
    public UserProfile findOne(String username);
    
}
