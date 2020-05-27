module com.jwebmp.guicedpersistence.wildfly {

	exports com.jwebmp.guicedpersistence.wildfly;

	uses com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration;

	provides com.jwebmp.guicedpersistence.wildfly.readers.IWildflyDriverRegistration with com.jwebmp.guicedpersistence.wildfly.readers.SQLServerWildflyDriver, com.jwebmp.guicedpersistence.wildfly.readers.DB2WildflyDriver;
	provides com.guicedee.guicedpersistence.services.IPropertiesConnectionInfoReader with com.jwebmp.guicedpersistence.wildfly.WildflyConnectionInfoBuilder;

	requires org.json;

	requires org.apache.commons.io;
	requires com.guicedee.guicedpersistence;

}
