package org.bedu.java.backend.veterinaria;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@SpringBootTest
@AutoConfigureMockMvc
public class SaludoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSaludoEndpoint() throws Exception {
        mockMvc.perform(get("/saludo"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }

    @Test
    public void testSaludoEndpointWithNameParam() throws Exception {
        mockMvc.perform(get("/saludo").param("name", "Team 11"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Team 11!"));
    }
    
}
