package org.kie.model;

/**
 * Definition of package to be copied.
 */
public class Package {
    private String name;
    private String type="main";
    private String language="java";
    private String filesystemRoot="./";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFilesystemRoot() {
        return filesystemRoot;
    }

    public void setFilesystemRoot(String filesystemRoot) {
        this.filesystemRoot = filesystemRoot;
    }

    @Override
    public String toString() {
        return "Package{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", language='" + language + '\'' +
                ", filesystemRoot='" + filesystemRoot + '\'' +
                '}';
    }
}
