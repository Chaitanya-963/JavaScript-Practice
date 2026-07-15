public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int min){
        int expectedMin = expectedMinutesInOven();
        return expectedMin - min;
    }

    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int min){
        int prepTime = preparationTimeInMinutes(layers);
        return prepTime + min;
    }
}
