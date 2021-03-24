package co.nz.demo;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EmployeeService {

	public void listStreams()
	{
	    final String uri = "http://localhost:8088/ksql";
	    RestTemplate restTemplate = new RestTemplate();
	    
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("Content-Type", "application/vnd.ksql.v1+json; charset=utf-8");
	   
	    JSONObject jsonObject = new JSONObject();
	    jsonObject.put("ksql", "LIST STREAMS;");
	    jsonObject.put("streamsProperties", new JSONObject());
	    
	    HttpEntity<String> request = 
	    	      new HttpEntity<String>(jsonObject.toString(), headers);
	    
	    System.out.println(restTemplate.postForObject(uri, request, String.class));
	}
}


