package com.esn.rest;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class Status1 {
	@GET
	//@POST if we use this in browser it gives as "method Note allowed error"
	@Produces(MediaType.TEXT_HTML)
	public String giveTitle(){
		return "<h2>Java Rest WEB-Service</h2>";
	}
	
	@Path("/version/{c}")
	@GET	
	@Produces(MediaType.TEXT_HTML)
	public String giveVersion(@PathParam("c") Double c){
		return "<h2>Java Rest WEB-Service version:1</h2>";
	}
}
