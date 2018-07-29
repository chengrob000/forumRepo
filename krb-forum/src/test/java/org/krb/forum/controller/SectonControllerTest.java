
package org.krb.forum.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.krb.forum.ConfigTest;
import org.krb.forum.controller.form.NewSectionForm;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;


public class SectonControllerTest extends ConfigTest {

    @Test
    @Transactional
    @Rollback
    public void testNewSectionFunction() throws Exception {
        NewSectionForm newSection = new NewSectionForm();
        newSection.setName("abc123abc");
        mockMvc.perform(post("/section/new").flashAttr("newSection", newSection)).andExpect(status()
            .is3xxRedirection());
    }
}
