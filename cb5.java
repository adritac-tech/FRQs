
public class cb5 {
    String hostName;
    String address;
    String inviteName;
    public cb5(String hostName, String address, String inviteName){
        this.hostName = hostName;
        this.address = address;
        this.inviteName = inviteName;
    }
    public void invitation(String hostName, String address){
        this.address = address;
        this.hostName = "Host";
    }
    public String getHostName(){
        return hostName;
    }
    public String getAddress(String address){
        this.address = address;
        return address;
    }
    public String invite(){
        return "Dear " + inviteName + " you are invited to my event at  " + address + " See you then, " + hostName;
    }
    
}
