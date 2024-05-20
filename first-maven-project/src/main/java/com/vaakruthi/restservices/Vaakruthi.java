package com.vaakruthi.restservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
@Path("/RestServices")
public class Vaakruthi {
	public static void main(String[] args) throws ParseException {
		

		JSONObject customer =new JSONObject();
		JSONArray arrayValues = new JSONArray();
		JSONObject customervalues1 = new JSONObject();
		JSONObject customervalues2 = new JSONObject();
		JSONObject customervalues3 = new JSONObject();
		
		customervalues1.put("name","vaakruthi");
		customervalues1.put("accountnumber","45678231");
		customervalues1.put("mobile","8907654321");
		customervalues1.put("address","hyd");
		
		customervalues2.put("name","vaakruthi");
		customervalues2.put("accountnumber","675782311");
		customervalues2.put("mobile","88976543211");
		customervalues2.put("address","vizag");
		
		customervalues3.put("name","vaakruthi");
		customervalues3.put("accountnumber","90878231");
		customervalues3.put("mobile","9807654321");
		customervalues3.put("address","banglore");
		
		arrayValues.add(customervalues1);
		arrayValues.add(customervalues2);
		arrayValues.add(customervalues3);
		
		customer.put("customer",arrayValues);
		System.out.println("JSON Values:"+customer.toJSONString());
		/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_HTML) public String sayHTML() { return "HELLO"; }
	 */
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayhello() throws ParseException,Exception
	{*/
	/*
	 * String jsonresponse
	 * ="{\"customer\":[{\"accountnumber\":\"45678231\",\"mobile\":\"8907654321\",\"address\":\"hyd\",\"name\":\"vaakruthi\"},{\"accountnumber\":\"675782311\",\"mobile\":\"88976543211\",\"address\":\"vizag\",\"name\":\"vaakruthi\"},{\"accountnumber\":\"90878231\",\"mobile\":\"9807654321\",\"address\":\"banglore\",\"name\":\"vaakruthi\"}]}";
	 * JSONParser parse =new JSONParser(); JSONObject responsecustomer =
	 * (JSONObject) parse.parse(jsonresponse);
	 * System.out.println("customerValues:"+responsecustomer.get("customer"));
	 * //return jsonresponse; //}
	 */			
	}

}