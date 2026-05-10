package org.template;

import java.lang.System;

void main() {
    try {
        System.out.println("Hello world!");
    } catch (Exception exception) {
        exception.printStackTrace();
        System.exit(1);
    }
}

