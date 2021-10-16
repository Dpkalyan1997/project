/**
 * This class implements the factory design pattern
 */

public class FoundaryFactory {
    public Foundary SupplyMetal(String shape, String area){
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("Distribution")) {
            Foundary g= new Distribution();
            ((Distribution) g).selectArea(area);
            return g;
        }
        else if(shape.equalsIgnoreCase("Raw metal")){
            Foundary g= new Raw metal();
            ((Raw metal) g).selectArea(area);
            return g;
        }
        else if(shape.equalsIgnoreCase("Minting")) {
            Foundary g= new Minting();
            ((Minting) g).selectArea(area);
            return g;
        }
        return null;
    }
}