package in.spdev.api.bootstrap.wallet;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/wallet")
public class PaytmWallet {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String walletBalance(@QueryParam("mobileNo") String mobileNo){
        return mobileNo+" bal is "+97792 + "class id " + this.hashCode();
    }
}
