package pl.rectorapator2;

public class Monitor {
    private int width = 3840;
    private int height = 1920;

    public void setLowResouliton() {
        width = 800;
        height = 600;
    }

    public void setHighResolution() {
        width = 3840;
        height = 1920;
    }

    public String getResolution() {
        return width + "x" + height;
    }


}
