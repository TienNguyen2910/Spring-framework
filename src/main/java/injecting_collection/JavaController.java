package injecting_collection;

import java.util.*;

public class JavaController {
    List addressList;
    Set addressSet;
    Map addressMap;
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
        this.addressMap = addressmap;
    }
    public Map getAddressMap(){
        System.out.println("Map Elements: "+ addressMap);
        return addressMap;
    }
    public void setAddressPro(Properties addressPro){
        this.addressPro = addressPro;
    }
    public Properties getAddressPro(){
        System.out.println("Properties Elements: "+ addressPro);
        return addressPro;
    }
}
