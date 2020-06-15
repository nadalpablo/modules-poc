module com.pocs.modulespoc.repository {
    requires com.pocs.modulespoc.model;

    requires spring.data.mongodb;
    requires spring.context;

    exports com.pocs.repository;
}