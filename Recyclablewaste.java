public class Recyclablewaste implements WasteCollector {
    private WasteCollector nextCollector;
    
    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }
    
    @Override
    public void collectWaste(WasteContainer container) {
        if ("Recyclable".equals(container.getWasteType())) {
            System.out.println("RECYCLABLE WASTE COLLECTOR: Processing recyclable waste");
            
            if (container.getContainerCapacity() > 75) {
                System.out.println("Recyclable Container capacity: " + container.getContainerCapacity());
            }
            
            System.out.println("Recyclable waste collection completed");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No appropriate collector found for " + container.getWasteType() + " waste type.");
        }
    }
}
