#Usamos el jboss/Wildfly image

FROM jboss/wildfly



#Desplegamos el war

ADD api-1.0.war /opt/jboss/wildfly/standalone/deployments/
