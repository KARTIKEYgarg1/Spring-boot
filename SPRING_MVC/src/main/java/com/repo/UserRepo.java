package com.repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepo{
	Map<String,String> map;
	public UserRepo(){
		map=new HashMap<String,String>();
		map.put("Kart","ikey");
		map.put("Swa","ti");
		map.put("Nikh","il");
		}
	public String returnS(String q) {
		return map.containsKey(q)?map.get(q):"NA";
	}
}