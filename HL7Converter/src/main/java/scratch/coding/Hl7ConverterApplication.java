package scratch.coding;

import java.io.IOException;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ca.uhn.hl7v2.HL7Exception;


@SpringBootApplication
public class Hl7ConverterApplication {
	
	public static void main(String[] args) throws HL7Exception, IOException {
		System.out.println(new Date());
		SpringApplication.run(Hl7ConverterApplication.class, args);
	}
}