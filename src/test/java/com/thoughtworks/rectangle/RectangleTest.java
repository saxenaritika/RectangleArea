

package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldReturnWhenLengthAndBreadthArePositive() {
        Rectangle rectangle = new Rectangle(10, 10);
        int area = rectangle.area();
        assertThat(area, is(equalTo(100)));
    }
}