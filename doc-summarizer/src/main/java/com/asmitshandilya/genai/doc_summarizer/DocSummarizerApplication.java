package com.asmitshandilya.genai.doc_summarizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DocSummarizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocSummarizerApplication.class, args);
	}
}
