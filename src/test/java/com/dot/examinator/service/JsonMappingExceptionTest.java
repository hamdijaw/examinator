package com.dot.examinator.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class JsonMappingExceptionTest {

//    @Test(expected = JsonMappingException.class)
    public void givenBidirectionRelation_whenSerializing_thenException()
            throws JsonProcessingException {

        /*User user = new User(1, "John");
        Item item = new Item(2, "book", user);
        user.addItem(item);

        new ObjectMapper().writeValueAsString(item);*/
    }

    @Test
    public void
    givenBidirectionRelation_whenUsingJacksonReferenceAnnotation_thenCorrect()
            throws JsonProcessingException {

        /*User user = new User(1, "John");
        Item item = new Item(2, "book", user);
        user.addItem(item);

        String result = new ObjectMapper().writeValueAsString(item);

        assertThat(result, containsString("book"));
        assertThat(result, containsString("John"));
        assertThat(result, not(containsString("userItems")));*/
    }
}
