package com.wellstek.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
class MainControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @DisplayName("Hello World 문자열을 body 에 담아서 응답한다.")
    @Test
    void root() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpectAll(
                        MockMvcResultMatchers.status().isOk(),
                        MockMvcResultMatchers.content().string("Hello World!")
                );

    }
}
