package com.stackroute.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//Used to override the method of inherited class
//This is predefined class

    public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[]{AppConfig.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return null;
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }
    }



