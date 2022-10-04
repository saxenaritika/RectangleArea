package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldReturnWhenLengthAndBreadthArePositive() {
        Rectangle rectangle = new Rectangle(10, 10);
        int area = rectangle.area();
        assertEquals(100,area);
    }
}
