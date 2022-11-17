package org.gg;

import org.gg.models.Movie;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/movies")
public class Movies {

    private static ArrayList<Movie> moviesArrayList = new ArrayList<>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMovies() {
        return Response.ok(moviesArrayList.toString()).build();
    }
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response setMovies(String newMovie) {
        return Response.ok(moviesArrayList.toString()).build();
    }

}
