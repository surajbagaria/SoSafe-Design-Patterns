package model;

public class SecurityService extends Service {

    @Override
    public void setServiceType(String serviceType) {
        super.serviceType = serviceType;
    }

    public String getServiceType(){
        return super.serviceType;
    }

    @Override
    public void displayServiceInfo() {
        super.displayServiceInfo();
    }
}

