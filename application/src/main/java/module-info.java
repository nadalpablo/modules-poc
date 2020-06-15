module com.pocs.modulespoc.application {
    requires com.pocs.modulespoc.controller;
    requires com.pocs.modulespoc.service;
    requires com.pocs.modulespoc.repository;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires java.instrument;
    requires spring.beans;
    requires spring.context;
    requires spring.data.mongodb;
    requires spring.web;
    requires com.fasterxml.jackson.databind;

    exports com.pocs.application;
    exports com.pocs.application.config;

    opens com.pocs.application to spring.core;
    opens com.pocs.application.config to spring.core;
}