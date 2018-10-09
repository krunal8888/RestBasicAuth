package com.kp.auth.controller;

import com.kp.auth.model.Employee;
import com.kp.auth.service.EmployeeService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/secured/resource")
public class EmployeeController {

    @GET
    @Path("/employee/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployee(@PathParam("id") final int id) {
        return Response.status(200).entity(EmployeeService.getEmployee(id)).build();
    }

    @GET
    @Path("/employees")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllEmployee() {
        return Response.status(200).entity(EmployeeService.getAllEmployees()).build();
    }

    @POST
    @Path("/employee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addEmployee(Employee employee) {
        EmployeeService.addEmployee(employee);
        return Response.status(200).entity(EmployeeService.getAllEmployees()).build();
    }

    @PUT
    @Path("/employee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateEmployee(Employee employee) {
        EmployeeService.updateEmployee(employee);
        return Response.status(200).entity(EmployeeService.getAllEmployees()).build();
    }

    @DELETE
    @Path("/employee/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteEmployee(@PathParam("id") int id) {
        EmployeeService.deleteEmployee(id);
        return Response.status(200).entity(EmployeeService.getAllEmployees()).build();
    }
}
