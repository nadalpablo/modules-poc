module com.pocs.modulespoc.service {
    requires com.pocs.modulespoc.model;
    requires com.pocs.modulespoc.repository;

    requires spring.context;

    exports com.pocs.service;
}