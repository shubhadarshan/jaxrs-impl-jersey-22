package in.spdev.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/paytm")
public class PaytmWalletResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public double getWalletBalance(@QueryParam("mobileNo") String mobileNo){
        System.out.println(mobileNo);
        return 234.0;
    }
}
