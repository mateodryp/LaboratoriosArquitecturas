/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testws.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Trabajo
 */

@Path("service")

public class Servicio {
    
    private static Map<Integer, Persona> personas = new HashMap<Integer, Persona>();
    static{
      for(int i=0;i<10;i++){
      Persona persona = new Persona();
      int id = i+1;
      persona.setId(id);
      persona.setNombre("Maravillosa persona" + id);
      persona.setEdad((int)Math.random()*60+1);
      personas.put(id, persona);
    }
    }
    
    @GET
    @Path("/getPersonByIdXML/{id}")
    @Produces(MediaType.APPLICATION_XML)
     public Persona getPersonByIdXML(@PathParam("id")int id){
        return personas.get(id);
    }

    @GET
    @Path("/ping")
    public Response ping() {​​​​​​​​
        return Response.ok("ping").build();
    }​​​​​​​​
     
    
    
    @GET
    @Path("/getPersonByIdJSON/{id}")
    @Produces(MediaType.APPLICATION_JSON) 
      public Persona getPersonByIdJSON(@PathParam("id")int id){
        return personas.get(id);
    }
    
    
    @GET
    @Path("/getAllPersonsXML")
    @Produces(MediaType.APPLICATION_XML)
    public List<Persona> getAllPersonsXML(){
        return new ArrayList<Persona>(personas.values());
    }
    
    
    @GET
    @Path("/getAllPersonsJSON")
    @Produces(MediaType.APPLICATION_JSON)
     public List<Persona> getAllPersonsJSON(){
        return new ArrayList<Persona>(personas.values());
    }
     
    @POST
    @Path("/addPersonInJson")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
     public Persona addPersonJson(Persona persona){
        personas.put(new Integer(persona.getId()), persona);
        return persona;
    }
    
    
    
}
