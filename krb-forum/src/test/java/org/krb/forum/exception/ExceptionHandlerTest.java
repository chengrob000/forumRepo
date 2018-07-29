
package org.krb.forum.exception;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.krb.forum.ConfigTest;


public class ExceptionHandlerTest extends ConfigTest {
    
    @Test
    public void notFoundErrorPage() throws Exception {
        mockMvc.perform(get("/fsasa4eraw4rffsref")).andExpect(status().isNotFound());
    }
}
