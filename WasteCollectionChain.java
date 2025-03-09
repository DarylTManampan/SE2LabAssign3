public class WasteCollectionChain implements WasteCollector {
    private WasteCollector nextCollector;
    
    public WasteCollectionChain() {
        // Initialize the chain
        this.nextCollector = new OrganicWaste();
        WasteCollector recyclableCollector = new Recyclablewaste();
        WasteCollector hazardousCollector = new HazardousWaste();
        
        nextCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);
        hazardousCollector.setNextCollector(nextCollector);
    }
    
    @Override
    public void collectWaste(WasteContainer container) {
        // Checking
        if (container.getContainerCapacity() >= 30) {
            System.out.println("Container is full with 100% " + container.getWasteType() + " waste.");
            nextCollector.collectWaste(container);
        } else {
            System.out.println("Container with " + container.getWasteType() + 
                              " waste is only filled with " + container.getContainerCapacity() + " waste. No collection needed yet.");
        }
    }
    
    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }
}
