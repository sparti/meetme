package de.dhbw.meetme.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 *
 */
public class MeetMeCli {

    /**
     * Use the Jersey Rest client to connect to our server
     */
    private void callClient() {
        Client c = ClientBuilder.newClient();
        WebTarget target = c.target("http://localhost:8087/meetmeserver/api");
        String responseMsg = target.path("user/list").request().get(String.class);
        System.out.println(responseMsg);
    }

    public static void main(String[] argv) {
        MeetMeCli cli = new MeetMeCli();
        cli.callClient();
    }
}
