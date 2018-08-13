import com.jwebmp.guicedpersistence.db.PropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.wildfly.WildflyConnectionInfoBuilder;
import com.jwebmp.guicedpersistence.wildfly.readers.DB2WildflyDriver;
import com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;
import com.jwebmp.guicedpersistence.wildfly.readers.SQLServerWildflyDriver;

module com.jwebmp.guicedpersistence.wildfly {

	exports com.jwebmp.guicedpersistence.wildfly;

	uses com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;

	provides IWildflyDriverRegistration with SQLServerWildflyDriver, DB2WildflyDriver;
	provides PropertiesConnectionInfoReader with WildflyConnectionInfoBuilder;

	requires com.jwebmp.guicedpersistence;
	requires com.fasterxml.jackson.annotation;

	requires com.jwebmp.logmaster;
	requires java.logging;

	requires commons.io;
	requires com.google.common;

	requires json;
	requires com.fasterxml.jackson.databind;

}
