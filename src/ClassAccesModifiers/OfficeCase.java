package ClassAccesModifiers;

public class OfficeCase {
    private String type;
    private String description;
    private String confidentialityLevel;

    public void setType(String type){
        this.type = type;
    }
    public String getDescription(){
        return description;
    }
    public String getConfidentialityLevel(){
        return confidentialityLevel;
    }
    public void setConfidentialityLevel(String confidentialityLevel){
        this.confidentialityLevel = confidentialityLevel;
    }

    public OfficeCase(String type, String description, String confidentialityLevel) {
        this.type = type;
        this.description = description;
        this.confidentialityLevel = confidentialityLevel;
    }
}
