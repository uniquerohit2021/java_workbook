package week4_page_55_Car_Engine;

public class Engine {
    private int engineId, engineHours;
    private String engineType;
    private float engineWeight;

    public int getEngineId() {
        return engineId;
    }
    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public int getEngineHours() {
        return engineHours;
    }

    public void setEngineHours(int engineHours) {
        this.engineHours = engineHours;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public float getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(float engineWeight) {
        this.engineWeight = engineWeight;
    }

    public String toString()
    {
        String str = String.format("Engine id : %d\n Engine Hours: %d\n Engine type: %s\n Engine Weight: %.2f\n", getEngineId(), getEngineHours(), getEngineType(), getEngineWeight());
        return str;
    }



}
