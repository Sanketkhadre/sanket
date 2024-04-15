package com.cts.Employee.Management.App.Poc.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalResources {
	public static Logger getLogger(Class ClassName) {
		return LoggerFactory.getLogger(ClassName);
	}
}
