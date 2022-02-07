import java.util.Arrays;
import java.util.Objects;

class Plot {
    private String cropType;
    private int cropYield;

    public Plot(String crop, int yield) {
        this.cropType=crop;
        this.cropYield=yield;
    }

    public String getCropType() {
        return cropType;
    }

    public int getCropYield() {
        return cropYield;
    }

    public String toString() {
        return this.cropType + ", " + this.getCropYield();
    }
}

public class cb8 {
    private Plot[][] farmPlots;
    private String output;

    public cb8(Plot[][] p){
        farmPlots=p;
    }

    /** Returns the plot with the highest yield for a given crop type, as
     * described in part (a). */
    public Plot getHighestYield(String c) {
        Plot plot = null;
        int greatest = farmPlots[0][0].getCropYield();
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(farmPlots[i][j].getCropType().equalsIgnoreCase(c) && farmPlots[i][j].getCropYield()>greatest){
                    greatest=farmPlots[i][j].getCropYield();
                    plot=farmPlots[i][j];
                }
            }
        }
        if(plot != null){
            System.out.println("Hightest Yield is " + plot);
            output = "Highest Yield is " + plot;
            return plot;
        }
        else {
            return null;
        }

    }

    /** Returns true if all plots in a given column in the two-dimensional
     * array farmPlots contain the same type of crop, or false otherwise, as
     * described in part (b). */
    public boolean sameCrop(int col) {
        boolean status=true;
        String crop = farmPlots[0][col].getCropType();

        for(int i=0;i<4;i++){
            if(!farmPlots[i][col].getCropType().equalsIgnoreCase(crop)){
                status=false;
                break;
            }
        }
        System.out.println("The crops in the column are all the same type: " + status);
        return status;

    }

    public String farm(){
        System.out.println(output);
        return output;
    }

}


