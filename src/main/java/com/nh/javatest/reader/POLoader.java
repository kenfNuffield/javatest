package com.nh.javatest.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class POLoader {

	//public?
	public String inFileName;
	
	public POLoader(String inFileName) {
		this.inFileName = inFileName;
	}
	
	public JsonNode loadFile() throws IOException {
		Path path = Paths.get(inFileName);
		Stream<String> lines = Files.lines(path);
		
		String data = lines.collect(Collectors.joining("\n"));
		
		System.out.println(data);
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(data);
		
		return jsonNode;
	}

}
