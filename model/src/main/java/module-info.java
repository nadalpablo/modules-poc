module com.pocs.modulespoc.model {
    requires spring.data.mongodb;
    requires spring.data.commons;

    exports com.pocs.model;

    opens com.pocs.model to spring.core;
}