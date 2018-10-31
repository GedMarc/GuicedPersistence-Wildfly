
import com.jwebmp.guicedpersistence.services.PropertiesConnectionInfoReader;
import com.jwebmp.guicedpersistence.wildfly.WildflyConnectionInfoBuilder;
import com.jwebmp.guicedpersistence.wildfly.readers.DB2WildflyDriver;
import com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;
import com.jwebmp.guicedpersistence.wildfly.readers.SQLServerWildflyDriver;

module com.jwebmp.guicedpersistence.wildfly {

	exports com.jwebmp.guicedpersistence.wildfly;

	uses com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;

	provides IWildflyDriverRegistration with SQLServerWildflyDriver, DB2WildflyDriver;
	provides PropertiesConnectionInfoReader with WildflyConnectionInfoBuilder;

	requires transitive com.jwebmp.guicedpersistence;

	requires transitive org.apache.commons.io;

	requires transitive com.jwebmp.guicedpersistence.readers.hibernateproperties;
	requires transitive com.jwebmp.guicedpersistence.readers.systemproperties;
}
