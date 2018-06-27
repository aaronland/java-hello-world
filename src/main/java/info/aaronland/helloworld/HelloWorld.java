package info.aaronland.helloworld;

// https://commons.apache.org/proper/commons-cli/usage.html
// https://commons.apache.org/proper/commons-lang/javadocs/api-2.5/org/apache/commons/lang/WordUtils.html

import org.apache.commons.cli.*;
import org.apache.commons.lang.WordUtils;

public class HelloWorld {
    
    public static void main(String[] args) {

	Options options = new Options();

	Option name = new Option("n", "name", true, "name");
	options.addOption(name);

	// this ensures that -h works
	options.addOption(OptionBuilder.withLongOpt("help").create('h'));

	// this does not...
	// Option help = new Option("h", "help", true, "show usage");
	// options.addOption(help);
	
	CommandLineParser parser = new DefaultParser();
	CommandLine cmd = null;

	try {
	    cmd = parser.parse(options, args);	    
	} catch( ParseException exp ) {
	    System.out.println( "Unexpected exception:" + exp.getMessage() );
	    System.exit(1); 
	}
	
	if (cmd.hasOption("h")){

	    String app_name = "hello world";
		
	    HelpFormatter formatter = new HelpFormatter();
	    formatter.printHelp(app_name, options );

	    System.exit(0); 
	    return;
	}
	
	String str_name = cmd.getOptionValue("n");

	if ((str_name == null) || (str_name.length() == 0)){

	    // import java.lang.RuntimeException;	    
	    // throw new RuntimeException("Invalid name");

	    System.out.println("Invalid name");
	    System.exit(1);	     
	}
	
	System.out.println("Hello World '" + WordUtils.capitalize(str_name) + "'");
    }
    
}
