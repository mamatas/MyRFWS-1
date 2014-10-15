package com.esn.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;

@Path("/v2/status")
public class Status2 {
	@GET
	//@POST if we use this in browser it gives as "method Note allowed error"
	@Produces(MediaType.TEXT_HTML)
	public String giveTitle(){
		return "<h2>Java Rest WEB-Service-2</h2>";
	}
	
	@Path("/version")
	@GET	
	@Produces(MediaType.TEXT_HTML)
	public String giveVersion(){
		return "<h2>Java Rest WEB-Service version:2</h2>";
	}
	
	@Path("/jsontest")
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public String giveJson(){
		String returnStr = null;
		ToJson tojson = new ToJson();
		JSONArray json =  new JSONArray();
		try{
			json = tojson.getJsonData();
			returnStr = json.toString();
		}
		catch(Exception e){
			e.printStackTrace();			
		}
		
		return returnStr;
	}
}
