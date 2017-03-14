package com.dot.examinator.service;

/**
 * Created by hamid on 12-Mar-17.
 */
public enum FileConsumerType {
    WORD("word", new String[]{"doc", "docs"}), EXCEL("excel", new String[]{"excel"});

    FileConsumerType(String name, String... extensions) {
        this.name = name;
        this.extensions = extensions;
    }

    String name; String[] extensions;

    public String getName() {
        return this.name;
    }



}
