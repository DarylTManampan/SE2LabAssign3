public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollectionChain collectionChain = new WasteCollectionChain();
        WasteContainer organicContainer = new WasteContainer(50, "Organic");
        WasteContainer recyclableContainer = new WasteContainer(80, "Recyclable");
        WasteContainer hazardousContainer = new WasteContainer(30, "Hazardous");
        
        System.out.println("\nWaste Containers");
        collectionChain.collectWaste(organicContainer);
        collectionChain.collectWaste(recyclableContainer);
        collectionChain.collectWaste(hazardousContainer);
    }
}
