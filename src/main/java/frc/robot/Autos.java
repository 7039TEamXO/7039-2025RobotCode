package frc.robot;

public enum Autos {
    MID_AUTO("ExampleAuto"),
    LEFT_AUTO("LeftAuto");
    
    private final String autoName;
    
    Autos(final String autoName){
        this.autoName = autoName;
    }

    public String getAutoName(){
        return autoName;
    }
}
