package com.restdemo.http;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.restdemo.resource.RestDemo;



public class JettyServer {
	 public static void main(String[] args) throws Exception {
	        
		    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
	        context.setContextPath("/m");

	        Server jettyServer = new Server(8080);
	        jettyServer.setHandler(context);

     	    ServletHolder jerseyServlet = context.addServlet(org.glassfish.jersey.servlet.ServletContainer.class, "/*");
	        
	        jerseyServlet.setInitOrder(0);
           
	        // Tells the Jersey Servlet which REST service/class to load.
	        jerseyServlet.setInitParameter(
	        		"jersey.config.server.provider.classnames",
	                RestDemo.class.getCanonicalName());
	        try {
	            jettyServer.start();
	            jettyServer.join();
	        } finally {
	           
	        }
	    }
}
