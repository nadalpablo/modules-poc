module com.pocs.modulespoc.application {
    requires spring.boot;
    requires spring.boot.autoconfigure;

    exports com.pocs.application;

    opens com.pocs.application to spring.core;
}