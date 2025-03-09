public class WasteContainer {
    private int containerCapacity;
    private String wasteType;
    
    public WasteContainer(int containerCapacity, String wasteType) {
        this.containerCapacity = containerCapacity;
        this.wasteType = wasteType;
    }
    
    public int getContainerCapacity() {
        return this.containerCapacity;
    }
    
    public String getWasteType() {
        return this.wasteType;
    }
}


