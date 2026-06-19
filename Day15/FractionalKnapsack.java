import java.util.Arrays;

public class FractionalKnapsack {

    static class Item {
        int weight, value; 
        double ratio; 
        
        Item(int weight, int value){
            this.weight = weight; 
            this.value = value; 
            this.ratio = (double) value/weight;
        }
        
    }

    public double fractionalKnapsack(int capacity, int[][] items){
        
        Item[] arr = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            arr[i] = new Item(items[i][0], items[i][1]);
        }
        
        Arrays.sort(arr, (a,b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0.0;
        int remaining = capacity;

        for(Item item : arr){
            if(remaining == 0) break; 

            if(item.weight <= remaining){
                totalValue += item.value; 
                remaining -= item.weight;
            } else {
                totalValue += item.ratio * remaining;
                remaining = 0;
            }
        }
        return totalValue; 
    }
    public static void main(String[] args) {
        FractionalKnapsack fk = new FractionalKnapsack();
    
        int capacity = 50;
        int[][] items = {
            {10, 60},  // weight=10, value=60
            {20, 100}, // weight=20, value=100
            {30, 120}  // weight=30, value=120
        };
        
        double result = fk.fractionalKnapsack(capacity, items);
        System.out.println("Maximum Value = " + result); // Output: 240.0
    }
}
