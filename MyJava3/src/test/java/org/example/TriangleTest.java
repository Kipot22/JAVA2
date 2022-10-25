package org.example;

import lesson12.Triangle;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    public void check() {
        Triangle.sqrt(2, 3, 4);
        if (Triangle.sqrt(2, 3, 4) == 0) {
            System.out.println("Impossible");;
        }
        else {
            System.out.println("Possible");
        }
    }
    }




