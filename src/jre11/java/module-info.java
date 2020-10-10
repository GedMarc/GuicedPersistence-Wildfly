module com.guicedee.guicedpersistence.wildfly {

	exports com.guicedee.guicedpersistence.wildfly;

	uses com.guicedee.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;

	provides com.guicedee.guicedpersistence.wildfly.readers.IWildflyDriverRegistration with com.guicedee.guicedpersistence.wildfly.readers.SQLServerWildflyDriver, com.guicedee.guicedpersistence.wildfly.readers.DB2WildflyDriver;
	provides com.guicedee.guicedpersistence.services.IPropertiesConnectionInfoReader with com.guicedee.guicedpersistence.wildfly.WildflyConnectionInfoBuilder;

	requires org.json;

	requires org.apache.commons.io;
	requires com.guicedee.guicedpersistence;

}
