package com.example.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class ApplicationContextProvider {

	/**
	 * Holds the instance of applicant wsdl properties.
	 */
	private static Properties applicantWsdlProps = null;
	/**
	 * Logger instance used for logging.
	 */
	private static final Logger LOGGER =LoggerFactory
		.getLogger(ApplicationContextProvider.class);

	public static Properties getApplicantWsdlProps() {

		if (applicantWsdlProps == null) {
			applicantWsdlProps = new Properties();
			InputStream inputStream = null;
			try {
				
				final String FILE_NAME = "src\\main\\resources\\applicantWsdl.properties";
				File propFile = new File(FILE_NAME);
				if (propFile.exists()) {
					inputStream = new FileInputStream(propFile);
				} else {
					LOGGER.error("Unable to find property file at location : "
							+ FILE_NAME);
					LOGGER.error("Reading properties from the war properties file");
					inputStream = Thread.currentThread()
							.getContextClassLoader()
							.getResourceAsStream("applicantWsdl.properties");
				}
				applicantWsdlProps.load(inputStream);
			} catch (FileNotFoundException fileNotFoundException) {
				LOGGER.error("applicantWsdl.properties not found"
						+ fileNotFoundException.getMessage());
			} catch (IOException ioException) {
				LOGGER.error("applicantWsdl.properties not found"
						+ ioException.getMessage());
			}
		}

		return applicantWsdlProps;

	}
}
