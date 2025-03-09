public class HazardousWaste implements WasteCollector {
    private WasteCollector nextCollector;
    
    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }
    
    @Override
    public void collectWaste(WasteContainer container) {
        if ("Hazardous".equals(container.getWasteType())) {
            System.out.println("HAZARDOUS WASTE COLLECTOR: Processing hazardous waste");
            
            if (container.getContainerCapacity() > 20) {
                System.out.println("Hazardous container capacity : " + container.getContainerCapacity());
            }
            
            System.out.println("Hazardous waste collection completed");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No appropriate collector found for " + container.getWasteType() + " waste type.");
        }
    }
}
