package in.spdev.api.bootstrap.application;

import in.spdev.api.bootstrap.GooglePayResource;
import in.spdev.api.bootstrap.wallet.PaytmWallet;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

//@ApplicationPath("/api")
public class RestApplication extends Application {

    private final Set<Object> singleton;
    private final Set<Class<?>> reqPerObjModel;

    public RestApplication(){
        System.out.println("RestApplication.RestApplication");
        singleton = new HashSet<>();
        reqPerObjModel = new HashSet<>();

        reqPerObjModel.add(PaytmWallet.class);
        singleton.add(new GooglePayResource());
    }

    @Override
    public Set<Class<?>> getClasses() {
        System.out.println("RestApplication.getClasses");
        return reqPerObjModel;
    }

    @Override
    public Set<Object> getSingletons() {
        System.out.println("RestApplication.getSingletons");
        return singleton;
    }
}
