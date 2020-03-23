package de.bschueller.microprofile.contact;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

@Path("/contacts")
@RequestScoped
public class ContactsEndpoint {

    @Inject
    ContactResource contactResource;

    private Logger logger = Logger.getLogger("ContactsResource");

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Contact> getContacts() {
        return contactResource.getContacts();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Contact getContact(@PathParam("id") Long id) {
        return contactResource.getContact(id);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateContact(@PathParam("id") Long id, Contact c) {
        contactResource.updateContact(id, c);
    }

    @DELETE
    @Path("/{id}")
    public void deleteContact(@PathParam("id") Long id) {
        contactResource.deleteContact(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Contact addContact(Contact c) {
        return contactResource.addContact(c);
    }
}