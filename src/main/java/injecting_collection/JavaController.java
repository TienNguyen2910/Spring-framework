package injecting_collection;

import java.util.*;

public class JavaController {
    List addressList;
    Set addressSet;
    Map addressmap;
    Properties addressPro;

    public void setAddressList(List addressList){
        this.addressList = addressList;
    }
    public List getAddressList(){
        System.out.println("List Elements: "+ addressList);
        return addressList;
    }
    public void setAddressSet(Set addressSet){
        this.addressSet = addressSet;
    }
    public Set getAddressSet(){
        System.out.println("Set Elements: "+ addressSet);
        return addressSet;
    }
    public void setAddressMap(Map addressmap){
        this.addressmap = addressmap;
    }
    public Map getAddressMap(){
        System.out.println("Map Elements: "+ addressmap);
        return addressmap;
    }
    public void setAddressPro(Properties addresspro){
        this.addressPro = addresspro;
    }
    public Properties getAddressPro(){
        System.out.println("Map Elements: "+ addressPro);
        return addressPro;
    }
}
