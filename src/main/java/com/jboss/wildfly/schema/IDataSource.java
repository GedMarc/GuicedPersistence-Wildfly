package com.jboss.wildfly.schema;

@FunctionalInterface
public interface IDataSource
{
	String getJndiName();
}
