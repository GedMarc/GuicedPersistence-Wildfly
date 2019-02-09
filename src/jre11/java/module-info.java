module com.jwebmp.guicedpersistence.wildfly {

	exports com.jwebmp.guicedpersistence.wildfly;

	uses com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;

	provides com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration with com.jwebmp.guicedpersistence.wildfly.readers.SQLServerWildflyDriver, com.jwebmp.guicedpersistence.wildfly.readers.DB2WildflyDriver;
	provides com.jwebmp.guicedpersistence.services.IPropertiesConnectionInfoReader with com.jwebmp.guicedpersistence.wildfly.WildflyConnectionInfoBuilder;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.guicedpersistence.wildfly.implementations.WildflyModuleExclusions;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.guicedpersistence.wildfly.implementations.WildflyModuleExclusions;

	requires com.jwebmp.guicedpersistence;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.logmaster;
	requires java.logging;

	requires com.google.common;

	requires org.json;
	requires com.fasterxml.jackson.databind;
	requires org.apache.commons.io;

	requires com.jwebmp.guicedpersistence.readers.hibernateproperties;
	requires com.jwebmp.guicedpersistence.readers.systemproperties;
	requires com.jwebmp.guicedinjection;
	requires java.validation;
}
