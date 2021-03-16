/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author viter
 */
@Path("helloworld")
public class HelloWorldExample {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloWorldExample
     */
    public HelloWorldExample() {
    }

    /**
     * Retrieves representation of an instance of helloworld.HelloWorldExample
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello, World!";
    }

    @GET
    @Path("{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloGuy(@PathParam("name") String name, @QueryParam("lang") String lang) {
        if("pt".equals(lang))
            return "Olá, "+name+"!";
        if("en".equals(lang))
            return "Hello, "+name+"!";
        if("es".equals(lang))
            return "Hola, "+name+"!";
        if("fr".equals(lang))
            return "Bonjour, "+name+"!";
        if("it".equals(lang))
            return "Ciao, "+name+"!";
        if("de".equals(lang))
            return "Hallo, "+name+"!";
        return "Saluton, "+name+"!";
    }

    @GET
    @Path("{name}/{sname}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloGuySname(@PathParam("name") String name, @PathParam("sname") String sname, @QueryParam("lang") String lang) {
        if("pt".equals(lang))
            return "Olá, "+name+" "+sname+"!";
        if("en".equals(lang))
            return "Hello, "+name+" "+sname+"!";
        if("es".equals(lang))
            return "Hola, "+name+" "+sname+"!";
        if("fr".equals(lang))
            return "Bonjour, "+name+" "+sname+"!";
        if("it".equals(lang))
            return "Ciao, "+name+" "+sname+"!";
        if("de".equals(lang))
            return "Hallo, "+name+" "+sname+"!";
        return "Saluton, "+name+" "+sname+"!";
    }

    
}
