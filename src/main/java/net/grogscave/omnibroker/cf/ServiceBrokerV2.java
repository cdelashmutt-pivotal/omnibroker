package net.grogscave.omnibroker.cf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.grogscave.omnibroker.ServiceRepository;
import net.grogscave.omnibroker.domain.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class ServiceBrokerV2 {

	@Resource
	private ServiceRepository repository;
	
	@RequestMapping(method=RequestMethod.GET, value="/catalog")
	public Map<String, List<Service>> catalog() {
		Map<String, List<Service>> map = new HashMap<>();
		map.put("services", repository.findAll());
		return map;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/service_instances/{id}")
	public ResponseEntity<String> serviceInstances(@PathVariable("id") String id)
	{
		return new ResponseEntity<String>("{}", HttpStatus.CREATED);
	}
	
	//@RequestMapping(method=)
}
