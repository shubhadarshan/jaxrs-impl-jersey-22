package in.spdev.api.bootstrap;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/google_pay")
public class GooglePayResource{

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTransactionHistory(@QueryParam("mobileNo") String mobileNo){
        return "it empty!! for " +mobileNo+" , start doing transaction it's safe" + "class id " + this.hashCode();
    }
}
