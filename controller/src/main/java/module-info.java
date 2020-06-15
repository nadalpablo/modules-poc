module com.pocs.modulespoc.controller {
    requires com.pocs.modulespoc.model;
    requires com.pocs.modulespoc.service;

    requires spring.web;

    exports com.pocs.controller;

    opens com.pocs.controller.dto to com.fasterxml.jackson.databind;
}