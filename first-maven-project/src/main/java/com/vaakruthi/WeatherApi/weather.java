package com.vaakruthi.WeatherApi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.json.simple.*;

@WebServlet("/weather")
public class weather extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		JSONObject weather = new JSONObject();
		JSONArray arrayValues = new JSONArray();
		String lon = req.getParameter("lon");
		String lat = req.getParameter("lan");

		JSONObject weatherObject = new JSONObject();
		weatherObject.put("id", 804);
		weatherObject.put("main", "Clouds");
		weatherObject.put("description", "overcast Clouds");
		weatherObject.put("icon", "04d");

		arrayValues.add(weatherObject);

		weather.put("weather", arrayValues);

		JSONObject coord = new JSONObject();
		coord.put("lon", lon);
		coord.put("lat", lat);

		weather.put("coord", coord);

		System.out.println("JSON Values :" + weather.toJSONString());

		resp.setContentType("application/json");
		resp.getWriter().print(weather);

	}
}
