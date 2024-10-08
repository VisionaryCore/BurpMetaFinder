package burp;

/*
 * @(#)IBurpCollaboratorInteraction.java
 *
 * Copyright PortSwigger Ltd. All rights reserved.
 *
 * This code may be used to extend the functionality of Burp Suite Community Edition
 * and Burp Suite Professional, provided that this usage does not violate the
 * license terms for those products.
 */
import java.util.Map;

/**
 * This interface represents a network interaction that occurred with the Burp
 * Collaborator server.
 */
public interface IBurpCollaboratorInteraction {

    /**
     * This method retrieves a specific property of the interaction. Common properties
     * across all interactions include: interaction_id, type, client_ip, and time_stamp.
     * For DNS interactions, properties include: query_type and raw_query, where raw_query
     * is Base64-encoded. For HTTP interactions, properties include: protocol, request, 
     * and response, both request and response are Base64-encoded.
     *
     * @param name The name of the property to retrieve.
     * @return A string representing the property value, or null if not present.
     */
    String getProperty(String name);

    /**
     * This method retrieves a map containing all properties of the interaction.
     *
     * @return A map containing all properties of the interaction.
     */
    Map<String, String> getProperties();
}
