package com.mber.study.javaee.husivm._01_servlets;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.net.URL;

@UtilityClass
public class TestUtil {

    public static boolean connect(String postfix) {
        try {
            new URL("http://localhost:8080/mber-study-javaee-husivm-1.0-SNAPSHOT/" + postfix).openConnection().getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
