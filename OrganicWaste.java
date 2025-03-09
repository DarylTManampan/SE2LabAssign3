public class OrganicWaste implements WasteCollector {
    private WasteCollector nextCollector;
    
    @Override
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }
    
    @Override
    public void collectWaste(WasteContainer container) {
        if ("Organic".equals(container.getWasteType())) {
            System.out.println("ORGANIC WASTE COLLECTOR: Processing organic waste");
            
            if (container.getContainerCapacity() > 30) {
                System.out.println("Organic Container  capacty: " + container.getContainerCapacity());
            }
            
            System.out.println("Organic waste collection completed");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No appropriate collector found for " + container.getWasteType() + " waste type.");
        }
    }
}
