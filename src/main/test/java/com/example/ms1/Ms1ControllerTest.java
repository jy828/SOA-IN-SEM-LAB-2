package com.example.ms1;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(Ms1Controller.class)
public class Ms1ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddNegativeAndPositiveNumbers() throws Exception {

        mockMvc.perform(
                get("/ms1/add")
                    .param("a", "-5")
                    .param("b", "5")
            )
            .andExpect(status().isOk())
            .andExpect(content().string("MS 1.1 - Additon = 0"));
    }
}