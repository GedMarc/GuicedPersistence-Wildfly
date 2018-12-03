
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.guicedpersistence.services.PropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.wildfly.WildflyConnectionInfoBuilder;
import com.jwebmp.guicedpersistence.wildfly.implementations.WildflyModuleExclusions;
import com.jwebmp.guicedpersistence.wildfly.readers.DB2WildflyDriver;
import com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;
import com.jwebmp.guicedpersistence.wildfly.readers.SQLServerWildflyDriver;

module com.jwebmp.guicedpersistence.wildfly {

	exports com.jwebmp.guicedpersistence.wildfly;

	uses com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;

	provides IWildflyDriverRegistration with SQLServerWildflyDriver, DB2WildflyDriver;
	provides PropertiesConnectionInfoReader with WildflyConnectionInfoBuilder;

	provides IGuiceScanJarExclusions with WildflyModuleExclusions;
	provides IGuiceScanModuleExclusions with WildflyModuleExclusions;

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