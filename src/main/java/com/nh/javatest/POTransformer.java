package com.nh.javatest;

import java.io.IOException;

import com.nh.javatest.parser.POParser;
import com.nh.javatest.reader.POLoader;
import com.nh.javatest.writer.POXMLWriter;

/**  
 *  
 */
public class POTransformer {

	public static void main(String[] args) throws IOException {
		String inFile;
		String outFile;
		
		inFile = args[0];
		outFile = args[1];
		
		if (inFile == null) {
			System.out.println("Error: no input file specified.");
		}
		if (outFile == null) {
			System.out.println("Error: no output file specified.");
		}
		
		if (args.length == 0) {
			System.out.println("POTransformer <infile> <outfile>");
		}
		
		POLoader poloader = new POLoader(inFile);
		
		POParser potrans = new POParser(poloader.loadFile());
		
		POXMLWriter poXmlWriter = new POXMLWriter(potrans.getModel());
		
	}
}
